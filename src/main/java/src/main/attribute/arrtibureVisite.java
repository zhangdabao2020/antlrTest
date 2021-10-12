package src.main.attribute;

import org.antlr.v4.runtime.tree.ParseTree;
import  src.main.java.CBinaryNum.*;

import java.util.List;

public class arrtibureVisite extends CBinaryNumBaseVisitor<Double> {
    private static  Integer len = 1;
    @Override
    public Double visitBinaryNum(CBinaryNumParser.BinaryNumContext ctx) {

        //return super.visitBinaryNum(ctx);
        System.out.println("visit BinaryNum:");
        System.out.println(ctx.getText());

        Double a = visit(ctx.getChild(0)); // 整数部分
        Double b =visit(ctx.getChild(2)) ;//小数部分
        return  a + b ;
       // return  0;
    }


    @Override
    public Double visitXiaoshu(CBinaryNumParser.XiaoshuContext ctx) {
        System.out.println("visit Xiaoshu:");
        System.out.println(ctx.getText());

//        if(ctx.getChild(0).getClass().getName().contains("Danti0")){
//            len = 1;
//        }
//         else{

        // }
        Double part1 = visit(ctx.getChild(0));

        Double part2 = visit(ctx.getChild(1));

        //visit(ctx.getChild(0));


        return  part1 +part2;
    }

    @Override
    public Double visitZhengshu(CBinaryNumParser.ZhengshuContext ctx) {
        System.out.println("visit Zhengshu:");
        System.out.println(ctx.getText());

        Integer pos = ctx.depth() -1;  //位置就是深度-1
       // List<ParseTree> list =  ctx.children;
        //遍历节点

        return  visit(ctx.getChild(0))+visit(ctx.getChild(1));
    }

    @Override
    public Double visitDanti0(CBinaryNumParser.Danti0Context ctx) {
        System.out.println("visit Danti0:");
        System.out.println(ctx.getText());

        len = 1;  // 修改 位置 为 1；
        return  visit(ctx.getChild(0));
    }

    @Override
    public Double visitDanti1(CBinaryNumParser.Danti1Context ctx) {
        System.out.println("visit Danti1:");
        System.out.println(ctx.getText());

       // Integer pos = ctx.depth() -2;

        return visit(ctx.getChild(0)); //访问子节点
    }

    @Override
    public Double visitZero(CBinaryNumParser.ZeroContext ctx){

        String classname = ctx.parent.getClass().getName();
        if(classname.contains("Xiaoshu")){
            len = len +1;
        }
        return 0.0;
    }

    @Override
    public Double visitOne(CBinaryNumParser.OneContext ctx) {

       /// if(ctx.getParent().)
      //  if(ctx.t)
        //整数部分
        Integer pos = 0;
        String classname = ctx.parent.getClass().getName();
        //String classname = ctx.parent.getClass().getName();
        if(classname.contains("Xiaoshu")){
            len = len +1;
        }
        if(classname.contains("Zhengshu") || classname.contains("Danti1")) {
             pos = ctx.depth() - 3; //位置是 深度减3
        }
        else{
            if(classname.contains("Danti0")){
                pos = -1;
                len = 1;
            }
            else{
                pos = 0-len;
            }
        }
        return getValBit(pos);
    }


    private Double getValBit(int pos){
        return  multidecil(pos);
    }

    private Double multidecil(int pos) {

        if(pos == 0) return  1.0;
        if(pos > 0){

            return   2 * multidecil(pos -1);
        }
        else{
            return   0.5 * multidecil(pos + 1);
        }
    }


}
