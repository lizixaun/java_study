package chapter_3;

/**
 * @author 李子煊
 * @version 1.0
 */
public class AutoConvert {
    public static void main(String[] args){
        int num='a';
        System.out.println(num);//得到97
        double d=80;
        System.out.println(d);//得到80.0
        //细节，多种类型混合计算
        //多种 类型混合运算的时候，系统会自动将所有，数据转化为容量最大的那种数据类型（也就是运算中最大精密度的数字），然后在计算，所有这个时候如果再转化到容量小的里面会包错

        int n1=10;
        //float d1=n1+1.1;//包错//结果数据类型是double
        //解决方法
        double di =n1 +1;
        float d1= n1+1.1F;
        //4.byte,short,char是可以计算的，计算的时候会转化为int类型
        //当吧数据赋值
        byte b1=10;//这么写是可以的虽然默认是int，但是系统会先判断范围再判断

    }
}
