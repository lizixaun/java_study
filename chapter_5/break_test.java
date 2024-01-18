package chapter_5;

/**
 * @author 李子煊
 * @version 1.0
 */
public class break_test {
    public static void main(String[] args) {
//        for (int i=0;i<=10;i++){
//           // System.out.println(Math.random());//得到一个double,0-1之间的
//            //我们需要0-100之间的数字int，所以我们可以
//            System.out.println((int)(Math.random()*100));
        int num=0;
        while (true){
            int a=(int)(Math.random()*100);
            System.out.println(a);
            num =num+1;
            System.out.println("查找："+num);
            if (a==80) {
                break;
            }
        }
    }
}
