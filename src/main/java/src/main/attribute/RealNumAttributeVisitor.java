package src.main.attribute;
import  src.main.java.RealNum.*;
public class RealNumAttributeVisitor extends  RealNumberBaseVisitor<Double> {
    private  static  Integer len = 1;
    @Override
    public Double visitRealnum(RealNumberParser.RealnumContext ctx) {
        System.out.println("visitRealnum");
        System.out.println(ctx.getText());
        System.out.println(ctx.depth());
        Double a = visit(ctx.getChild(0)); // 整数部分
        Double b =visit(ctx.getChild(2)) ;//小数部分
        return  a + b ;
    }

    @Override
    public Double visitZhengshu(RealNumberParser.ZhengshuContext ctx) {
        System.out.println("visit Zhengshu:");
        System.out.println(ctx.getText());
        System.out.println(ctx.depth());
        return  visit(ctx.getChild(0))+visit(ctx.getChild(1));
    }

    @Override
    public Double visitXiaoshu(RealNumberParser.XiaoshuContext ctx) {
        System.out.println("visit Xiaoshu:");
        System.out.println(ctx.getText());
        System.out.println(ctx.depth());
        Double part1 = visit(ctx.getChild(0));
        Double part2 = visit(ctx.getChild(1));
        return  part1 +part2;
    }

    @Override
    public Double visitDanti0(RealNumberParser.Danti0Context ctx) {
        System.out.println("visit Danti0:");
        System.out.println(ctx.getText());
        System.out.println(ctx.depth());
        len = 1;  // 修改 位置 为 1；
        return  visit(ctx.getChild(0));
    }

    @Override
    public Double visitDanti1(RealNumberParser.Danti1Context ctx) {
        System.out.println("visit Danti1:");
        System.out.println(ctx.getText());
        System.out.println(ctx.depth());
        return visit(ctx.getChild(0)); //访问子节点
    }

    @Override
    public Double visitNum(RealNumberParser.NumContext ctx) {
        System.out.println(ctx.depth());
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
        String textNum = ctx.getText();
        Double duobNum = Double.valueOf(textNum);
        return  duobNum * getValBit(pos);

    }
    private Double getValBit(int pos){
        return  multidecil(pos);
    }

    private Double multidecil(int pos) {

        if(pos == 0) return  1.0;
        if(pos > 0){
            return   10 * multidecil(pos -1);
        }
        else{
            return   0.1 * multidecil(pos + 1);
        }
    }
}
