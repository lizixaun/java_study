package chapter_7;

/**
 * @author 李子煊
 * @version 1.0
 */
public class method01 {
    public static void main(String[] args) {
    Person person=new Person();
    person.speak();
    person.cal01();
    int returnres=person.app(10,12);//返回的值放起来
    }
}class Person{
    String name;
    int age;
    //添加一个方法
    public void speak(){
        System.out.println("我是一个好人");
    }

    public int app(int a,int b){//方法执行后面返回一个int类型的结果，肯定要加上return，
        // 不然会报错
        int mun =a+b;
        return mun;
    }
    public void cal01(){
        int mun=0;
        for (int i = 0; i < 100; i++) {
            mun=mun+i;
        }
        System.out.println(mun);
    }
}
class A{
    public int[] get(int a,int b){
        int [] arr=new int[2];
        arr[1]=a-b;
        arr[0]=a+b;
        return arr;
    }
}