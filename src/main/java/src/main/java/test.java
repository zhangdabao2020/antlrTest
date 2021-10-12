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






    }




}
