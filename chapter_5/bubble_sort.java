package chapter_5;

/**
 * @author 李子煊
 * @version 1.0
 */
public class bubble_sort {
    public static void main(String[] args) {
        int[] array={24,69,80,57,13};
        int example=0;
        int example_1=0;
        int subscript=0;
        for (int i=0;i<array.length;i++){
        example=example>array[i]?example:array[i];
        //写法问题：会导致代码知道最大的数字，但是找不到怎么才可以直到最大的数字的下标。所以我们需要加上下标
        example_1=example!=example_1?example_1+1:example_1;
        }
            System.out.println("最大数值"+example+"最大数值的下标"+example_1);
    }
}
