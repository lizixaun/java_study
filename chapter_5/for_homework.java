package chapter_5;

/**
 * @author 李子煊
 * @version 1.0
 */
public class for_homework {
    public static void main(String[] args) {
        /*
        for (int i=1, int sum;sum<100;i++,sum=i*9){
            System.out.println(sum);
        }*/
        //前面代码有问题，看完之后发现，如果一个步骤里面写多步，那么需要只有一个类型
        for (int i=1,sum=0;sum<100;i++,sum=i*9) {
            System.out.println(sum);
        }
    }
}
