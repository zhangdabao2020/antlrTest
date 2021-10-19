package src.main.java;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import  org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import  src.main.attribute.*;
import src.main.attribute.lambdaVisitor;
import  src.main.java.CBinaryNum.*;
import src.main.java.RealNum.RealNumberLexer;
import src.main.java.RealNum.RealNumberParser;
import  src.main.java.lambda.*;
import java.io.IOException;


public class test {
    public static void main(String[] args) {

  /*      String s = "110.101";
        CharStream input = CharStreams.fromString(s);
        CBinaryNumLexer CBlex = new CBinaryNumLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(CBlex); //token 流
        CBinaryNumParser CBpar = new CBinaryNumParser(tokens);
        ParseTree tree = CBpar.binaryNum();

        arrtibureVisite atrVisit = new arrtibureVisite();
        Double result =   atrVisit.visit(tree);
        // tree.accept()
        System.out.println("二进制的值为："+result);*/


        //利用属性文法 计算 实数的值
        /*String real = "13.6875";
        CharStream input1 = CharStreams.fromString(real);
        RealNumberLexer realNumLex = new RealNumberLexer(input1);
        CommonTokenStream RealNumTokens = new CommonTokenStream(realNumLex);
        RealNumberParser realNumPar = new RealNumberParser(RealNumTokens);
        ParseTree realTree = realNumPar.realnum();

        RealNumAttributeVisitor realArrVisitor = new RealNumAttributeVisitor();
        Double  RealNumVal =    realArrVisitor.visit(realTree);
        System.out.println("实数字符串的值是："+RealNumVal);*/

        //解析lambda表达式
        String l1 = "((L x y (add x y )) 5 8 )";
        String t2 = "(  L m ( sqr (L n (add m n )) 2))";
        String t3  = "((L x ( L y (add x y ))) 5 8 )";
        String t4 = "( ( (L x ( L y (add x y ))) 5 ) 8 )";
        String t5 = "( ( (L x ( L y ( (add x) y ))) 5 ) 8 )";
        String t6 = "( ( L m(sqr((L n ( (add m) n))2)))  4 )";
        String s = t6;
        System.out.println("输入表达式："+s);
        CharStream input = CharStreams.fromString(s);
        lambdaLexer lamlex = new lambdaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lamlex); //token 流
        lambdaParser lampar = new lambdaParser(tokens);
        ParseTree tree = lampar.expression();

        lambdaVisitor atrVisit = new lambdaVisitor();
        String result = atrVisit.visit(tree);
        // tree.accept()
        System.out.println("解析表达式树："+result);




    }




}
