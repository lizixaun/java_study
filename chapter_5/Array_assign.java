package chapter_5;

/**
 * @author 李子煊
 * @version 1.0
 */
//要求赋值完的数组改完之后不会影响之前的数组结果。因为数组是地址赋值，这点就比python省运行内存，所以比python快
public class Array_assign {
    public static void main(String[] args) {
        int []array_1={1,2,3,4};
        int []array_2=new int[array_1.length];
        for (int i=0;i<array_1.length;i++){
            array_2[i]=array_1[i];
        }
        System.out.println(array_2);
        for (int i_1=0;i_1<array_2.length;i_1++){
            System.out.println(array_2[i_1]);
        }
    }
}
