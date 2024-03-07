package chapter_7;

/**
 * @author 李子煊
 * @version 1.0
 */
public class object01 {
    public static void main(String[] args) {
//        String catname1="小猫";
//        int catage1=10;
//
//        String catname2="大猫";
//        int catage2=10;
        Cat cat1=new Cat();
        cat1.age=10;
        Cat cat2=new Cat();
        cat2.age=100;
    }
}
class Cat{
    String name;
    int age;
}