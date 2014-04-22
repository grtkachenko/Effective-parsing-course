import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

public class CalcVisitor extends ArithmeticExpressionsBaseVisitor<Integer> {
    private final Map<String, Integer> memory = new HashMap<String, Integer>();

    /**
     * VAR '=' expr NEWLINE
     */
    @Override
    public Integer visitAssign(ArithmeticExpressionsParser.AssignContext ctx) {
        String var = ctx.VAR().getText();
        int value = visit(ctx.expr());
        memory.put(var, value);
        System.out.println("" + var + " = " + value);
        return value;
    }

    /**
     * INT
     */
    @Override
    public Integer visitInt(ArithmeticExpressionsParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /**
     * VAR
     */
    @Override
    public Integer visitVar(ArithmeticExpressionsParser.VarContext ctx) {
        String var = ctx.VAR().getText();
        return (memory.containsKey(var) ? memory.get(var) : 0) * (ctx.SUB() != null ? -1 : 1);
    }

    /**
     * expr op=('*') right_expr
     */
    @Override
    public Integer visitMulDiv(@NotNull ArithmeticExpressionsParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return ctx.op.getType() == ArithmeticExpressionsParser.MUL ? left * right : left / right;
    }

    /**
     * expr op=('+'|'-') right_expr
     */
    @Override
    public Integer visitAddSub(ArithmeticExpressionsParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return ctx.op.getType() == ArithmeticExpressionsParser.ADD ? left + right : left - right;
    }

    /**
     * '(' expr ')'
     */
    @Override
    public Integer visitParens(ArithmeticExpressionsParser.ParensContext ctx) {
        return visit(ctx.expr()) * (ctx.SUB() != null ? -1 : 1);
    }


}