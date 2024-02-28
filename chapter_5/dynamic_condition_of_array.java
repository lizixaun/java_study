package chapter_5;

import java.util.Scanner;

/**
 * @author 李子煊
 * @version 1.0
 */
public class dynamic_condition_of_array {
    public static void main(String[] args) {
        double [] scores=new double[5];//5个空间
        Scanner myScanner = new Scanner(System.in);
        System.out.println("未使用");
        for( int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+ (i+1) +"个元素的值");
            scores[i] = myScanner.nextDouble();//也就是说构造器在使用的时候才开始运行
        }
    }
}
//    未使用
//            请输入第1个元素的值
//1
//        请输入第2个元素的值
//        2
//        请输入第3个元素的值
