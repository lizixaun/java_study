//package chapter_7;
//
///**
// * @author 李子煊
// * @version 1.0
// */
//public class p_null {
//    public static void main(String[] args) {
//        person p=new person();
//        p.age=10;
//        p.name="马达加斯加";
//        method method=new method();
//        method.method01(p);
//        System.out.println(p.age);//10
//        System.out.println(p);//chapter_7.person@4f3f5b24
//    }
//}
//class person{
//    String name;
//    int age;
//}
//class method{
//    public void method01(person p){
////        p.age=15;
//        p=null;//没有报错应该是真的
//        System.out.println(p);//null
//    }
//}