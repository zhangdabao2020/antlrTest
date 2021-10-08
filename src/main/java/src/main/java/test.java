package src.main.java;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import  org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import  src.main.attribute.*;
import  src.main.java.CBinaryNum.*;
import src.main.java.RealNum.RealNumberLexer;
import src.main.java.RealNum.RealNumberParser;

import java.io.IOException;


public class test {
    public static void main(String[] args) {

        String s = "110.101";
        CharStream input = CharStreams.fromString(s);
        CBinaryNumLexer CBlex = new CBinaryNumLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(CBlex); //token 流
        CBinaryNumParser CBpar = new CBinaryNumParser(tokens);
        ParseTree tree = CBpar.binaryNum();

        arrtibureVisite atrVisit = new arrtibureVisite();
        Double result =   atrVisit.visit(tree);
        System.out.println("二进制的值为："+result);
       //  ParseTree tree1 = CBpar.binaryNum();

       // RuleContext treer = CBpar.binaryNum();
       // System.out.println(treer.toString(CBpar));

       // System.out.println(tree.);
       // System.out.println(tree.toString(CBpar));

        //利用属性文法 计算 实数的值
          String real = "13.6875";
          CharStream input1 = CharStreams.fromString(real);
        RealNumberLexer realNumLex = new RealNumberLexer(input1);
        CommonTokenStream RealNumTokens = new CommonTokenStream(realNumLex);
        RealNumberParser realNumPar = new RealNumberParser(RealNumTokens);
        ParseTree realTree = realNumPar.realnum();

        RealNumAttributeVisitor realArrVisitor = new RealNumAttributeVisitor();
        Double  RealNumVal =    realArrVisitor.visit(realTree);
        System.out.println("实数字符串的值是："+RealNumVal);


     /*    String sql = "Select 'abc' as a, `hahah` as c  From a aS table;";
        CharStream input = CharStreams.fromString(sql);

         CustomSqlLexer lex = new CustomSqlLexer(input); //词法分析

         CommonTokenStream tokens = new CommonTokenStream(lex); //token 流

         CustomSqlParser par = new CustomSqlParser(tokens);  //语法分析
         CustomSqlParser.StaContext tree = par.sta(); // 获取某一个语法书，对应 表达式中的规则。
         System.out.println(tree.toStringTree(par)); //打印规则

         ParseTreeWalker walker = new ParseTreeWalker();*/

        // CustomSqlListener comsql = new CustomSqlBaseListener(par);
         // ParseTree tree = par.
         // CustomSqlParser.ExprContext tree = par.expr(); //表达式
         //CustomSqlVisitor tv = new CustomSqlVisitor();
         //  tv.visit(tree);



    }

    /*    static class CustomSqlVisitor extends CustomSqlBaseVisitor<Void> {
            @Override
            public Void visitAdd(CustomSqlParser.AddContext ctx) {

             *//*   System.out.println("========= test add");
                System.out.println("first arg: " + ctx.expr(0).getText());
                System.out.println("second arg: " + ctx.expr(1).getText());*//*

                return super.visitAdd(ctx);
            }
        }*/


}
