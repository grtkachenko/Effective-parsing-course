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
        return memory.containsKey(var) ? memory.get(var) : 0;
    }

    /**
     * -VAR
     */
    @Override
    public Integer visitSVar(@NotNull ArithmeticExpressionsParser.SVarContext ctx) {
        String var = ctx.VAR().getText();
        return memory.containsKey(var) ? -memory.get(var) : 0;
    }

    /**
     * -INT
     */
    @Override
    public Integer visitSInt(@NotNull ArithmeticExpressionsParser.SIntContext ctx) {
        return -Integer.valueOf(ctx.INT().getText());
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
        int left = visit(ctx.expr());
        int right = visit(ctx.right_expr());
        return ctx.op.getType() == ArithmeticExpressionsParser.ADD ? left + right : left - right;
    }

    /**
     * '(' expr ')'
     */
    @Override
    public Integer visitParens(ArithmeticExpressionsParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    /**
     * RIGHT_VAR
     */
    @Override
    public Integer visitRightVar(@NotNull ArithmeticExpressionsParser.RightVarContext ctx) {
        String var = ctx.VAR().getText();
        return memory.containsKey(var) ? memory.get(var) : 0;
    }

    /**
     * RIGHT_INT
     */
    @Override
    public Integer visitRightInt(@NotNull ArithmeticExpressionsParser.RightIntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /**
     * right_expr op=('*'|'/') right_expr
     */
    @Override
    public Integer visitRightMulDiv(@NotNull ArithmeticExpressionsParser.RightMulDivContext ctx) {
        int left = visit(ctx.expr());
        int right = visit(ctx.right_expr());
        return ctx.op.getType() == ArithmeticExpressionsParser.MUL ? left * right : left / right;
    }

    /**
     * '(' expr ')'
     */
    @Override
    public Integer visitRightParens(@NotNull ArithmeticExpressionsParser.RightParensContext ctx) {
        return visit(ctx.expr());
    }

    /**
     * right_expr op=('+'|'-') right_expr
     */
    @Override
    public Integer visitRightAddSub(@NotNull ArithmeticExpressionsParser.RightAddSubContext ctx) {
        int left = visit(ctx.right_expr(0));
        int right = visit(ctx.right_expr(1));
        return ctx.op.getType() == ArithmeticExpressionsParser.ADD ? left + right : left - right;
    }

    /**
     * '-(' expr ')'
     */
    @Override
    public Integer visitSignParens(@NotNull ArithmeticExpressionsParser.SignParensContext ctx) {
        return -visit(ctx.expr());
    }
}