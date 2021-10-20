package src.main.attribute;
import  src.main.java.lambda.*;
public class lambdaVisitor extends lambdaBaseVisitor<String> {

    @Override
    public String visitExpression(lambdaParser.ExpressionContext ctx) {

        return visit(ctx.getChild(0)); //访问子节点
    }

    @Override
    public String visitIdentifier(lambdaParser.IdentifierContext ctx) {
        Integer depth = ctx.depth();
        String tempstr = "var("+ctx.getText()+")";
        String blank = getBlank(depth);
        System.out.println(blank+tempstr);
        return "var("+ctx.getText()+")";
    }

    @Override
    public String visitFunction_(lambdaParser.Function_Context ctx) {
        Integer depth = ctx.depth();
        String blank = getBlank(depth);
        System.out.println(blank+"lamb(");

        Integer chConut =  ctx.getChildCount();// 子节点个数
        Integer varCount = chConut - 4 ;//identifier变量个数
        Integer varStart = 2; // 变量开始节点
        String varstr = "";
        for(Integer  i = 0; i < varCount ;i++){
            varstr = varstr +  visit( ctx.getChild(varStart+i));
        }
        String scopst = visit( ctx.getChild(chConut-2));
        System.out.println(blank+")");
        return "lamb("+varstr+","+scopst+")";
    }

    @Override
    public String visitApplication(lambdaParser.ApplicationContext ctx) {
        Integer depth = ctx.depth();
        String blank = getBlank(depth);
        System.out.println(blank+"comb(");
        Integer count = ctx.getChildCount();// 子节点个数
        Integer exp1Count = count - 3;//第一个表达式个数
        Integer exp1Start = 1 ;//第一个表达式开始位置
        String expstr1 = "";

        for(Integer i = 0; i < exp1Count ; i ++){
            expstr1 = expstr1 + visit(ctx.getChild(exp1Start+i));
        }
        String expstr2 = visit(ctx.getChild(count-2));
        System.out.println(blank+")");
        return "comb("+expstr1+","+expstr2+")";
    }

    @Override
    public String visitAppfunction(lambdaParser.AppfunctionContext ctx) {
        Integer depth = ctx.depth();
        String blank = getBlank(depth);
        System.out.println(blank+"comb(");
        String exp1 = visit(ctx.getChild(0));
        String exp2 = visit(ctx.getChild(1));
        System.out.println(blank+")");
        return "comb("+exp1+","+exp2+")";
    }

    @Override
    public String visitConstant(lambdaParser.ConstantContext ctx) {

        Integer depth = ctx.depth();
        String tempstrcon = "con("+ctx.getText()+")";
        String blank = getBlank(depth);
        System.out.println(blank+tempstrcon);
        return  "con("+ctx.getText()+")";
    }

    @Override
    public String visitScope(lambdaParser.ScopeContext ctx) {
        return visit(ctx.getChild(0));
    }

    private String getBlank(Integer n){
        StringBuilder sb = new StringBuilder();
        for (Integer i = 0; i<n;i++){
            sb.append("  ");
        }
        return   sb.toString();
    }

}
