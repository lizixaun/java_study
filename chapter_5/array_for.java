package chapter_5;

/**
 * @author 李子煊
 * @version 1.0
 */
public class array_for {
    public static void main(String[] args) {
        double[] array={1,2,3,4};
        double max=0;
        for (int i=0;i<array.length;i++){
            max=array[i]+max;
            System.out.println(max);
        }
    }
}
