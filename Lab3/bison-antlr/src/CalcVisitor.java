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
     * term op=('*'|'/') factor
     */
    @Override
    public Integer visitMulDiv(@NotNull ArithmeticExpressionsParser.MulDivContext ctx) {
        int left = visit(ctx.term());
        int right = visit(ctx.factor());
        return ctx.op.getType() == ArithmeticExpressionsParser.MUL ? left * right : left / right;
    }

    /**
     * expr op=('+'|'-') term
     */
    @Override
    public Integer visitAddSub(ArithmeticExpressionsParser.AddSubContext ctx) {
        int left = visit(ctx.expr());
        int right = visit(ctx.term());
        return ctx.op.getType() == ArithmeticExpressionsParser.ADD ? left + right : left - right;
    }

    /**
     * '(' expr ')'
     */
    @Override
    public Integer visitParens(ArithmeticExpressionsParser.ParensContext ctx) {
        return visit(ctx.expr()) * (ctx.SUB() != null ? -1 : 1);
    }

    /**
     * term
     */
    @Override
    public Integer visitAddSubTerm(@NotNull ArithmeticExpressionsParser.AddSubTermContext ctx) {
        return visit(ctx.term());
    }

    /**
     * factor
     */
    @Override
    public Integer visitMulDivFactor(@NotNull ArithmeticExpressionsParser.MulDivFactorContext ctx) {
        return visit(ctx.factor());
    }

    /**
     * expr
     */
    @Override
    public Integer visitExprOnly(@NotNull ArithmeticExpressionsParser.ExprOnlyContext ctx) {
        int result = visit(ctx.expr());
        System.out.println(result);
        return result;
    }

    @Override
    public Integer visitSimpleDeg(@NotNull ArithmeticExpressionsParser.SimpleDegContext ctx) {
        return visit(ctx.deg());
    }

    @Override
    public Integer visitFactorDeg(@NotNull ArithmeticExpressionsParser.FactorDegContext ctx) {
        int left = visit(ctx.deg());
        int right = visit(ctx.factor());
        return (int) Math.pow(left, right);
    }
}