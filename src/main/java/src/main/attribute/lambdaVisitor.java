package src.main.attribute;
import  src.main.java.lambda.*;
public class lambdaVisitor extends lambdaBaseVisitor<String> {

    @Override
    public String visitExpression(lambdaParser.ExpressionContext ctx) {

        return visit(ctx.getChild(0)); //访问子节点
    }

    @Override
    public String visitIdentifier(lambdaParser.IdentifierContext ctx) {

        return "var("+ctx.getText()+")";
    }

    @Override
    public String visitFunction_(lambdaParser.Function_Context ctx) {

        Integer chConut =  ctx.getChildCount();// 子节点个数
        Integer varCount = chConut - 4 ;//identifier变量个数
        Integer varStart = 2; // 变量开始节点
        String varstr = "";
        for(Integer  i = 0; i < varCount ;i++){
            varstr = varstr +  visit( ctx.getChild(varStart+i));
        }


        String scopst = visit( ctx.getChild(chConut-2));

        return "lamb("+varstr+","+scopst+")";
    }

    @Override
    public String visitApplication(lambdaParser.ApplicationContext ctx) {
        Integer count = ctx.getChildCount();// 子节点个数
        Integer exp1Count = count - 3;//第一个表达式个数
        Integer exp1Start = 1 ;//第一个表达式开始位置
        String expstr1 = "";

        for(Integer i = 0; i < exp1Count ; i ++){
            expstr1 = expstr1 + visit(ctx.getChild(exp1Start+i));
        }
        String expstr2 = visit(ctx.getChild(count-2));
        return "comb("+expstr1+","+expstr2+")";
    }

    @Override
    public String visitConstant(lambdaParser.ConstantContext ctx) {
        return  "con("+ctx.getText()+")";
    }

    @Override
    public String visitScope(lambdaParser.ScopeContext ctx) {
        return visit(ctx.getChild(0));
    }


}
