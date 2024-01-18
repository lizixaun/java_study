package chapter_5;

import java.util.Scanner;

/**
 * @author 李子煊
 * @version 1.0
 */
public class input_different_kinds {
}
//___________________________________________________________________________________________
//先得到再转换类型
//public class StringToBasic {
//    //编写一个 main 方法
//    public static void main(String[] args) {
////基本数据类型->String
//        int n1 = 100;
//        float f1 = 1.1F;
//        double d1 = 4.5;
//        boolean b1 = true;
//        String s1 = n1 + "";
//        String s2 = f1 + "";
//        String s3 = d1 + "";
//        String s4 = b1 + "";
//        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
////String->对应的基本数据类型
//        String s5 = "123";
////会在 OOP 讲对象和方法的时候回详细
////解读 使用 基本数据类型对应的包装类，的相应方法，得到基本数据类型
//        int num1 = Integer.parseInt(s5);
//        double num2 = Double.parseDouble(s5);
//        float num3 = Float.parseFloat(s5);
//        long num4 = Long.parseLong(s5);
//        byte num5 = Byte.parseByte(s5);
//        boolean b = Boolean.parseBoolean("true");
//        short num6 = Short.parseShort(s5);
//        System.out.println("===================");
//        System.out.println(num1);//123
//        System.out.println(num2);//123.0
//        System.out.println(num3);//123.0
//        System.out.println(num4);//123
//        System.out.println(num5);//123
//        System.out.println(num6);//123
//        System.out.println(b);//true
////怎么把字符串转成字符 char -> 含义是指 把字符串的第一个字符得到
////解读 s5.charAt(0) 得到 s5 字符串的第一个字符 '1'
//        System.out.println(s5.charAt(0));
//    }
//}
//——————————————————————————————————————————————————————————————————————————————————————
//直接得到不同类型的信息
//import java.util.Scanner;//表示把 java.util 下的 Scanner 类导入
//public class Input {
//    //编写一个 main 方法
//    public static void main(String[] args) {
////演示接受用户的输入
////步骤
////Scanner 类 表示 简单文本扫描器，在 java.util 包
////1. 引入/导入 Scanner 类所在的包
////2. 创建 Scanner 对象 , new 创建一个对象,体会
//// myScanner 就是 Scanner 类的对象
//        Scanner myScanner = new Scanner(System.in);
////3. 接收用户输入了， 使用 相关的方法
//        System.out.println("请输入名字");
////当程序执行到 next 方法时，会等待用户输入~~~ String name = myScanner.next(); //接收用户输入字符串
//        System.out.println("请输入年龄");
//        int age = myScanner.nextInt(); //接收用户输入 int
//        System.out.println("请输入薪水");
//        double sal = myScanner.nextDouble(); //接收用户输入 double
//        System.out.println("人的信息如下:");
//        System.out.println("名字=" + name
//                + " 年龄=" + age + " 薪水=" + sal);
//    }}