package chapter_5;

/**
 * @author 李子煊
 * @version 1.0
 */
public class Array2 {
    public static void main(String[] args) {
        int[] arry = {4,-1,9,10,23};
        int max=0;
        int max_i=0;
        for (int i=1;i<arry.length;i++){
            int mun=arry[i];
            max=max>mun?max:mun;
            if (mun==max){
                max_i=i;
            }
        }
        System.out.println(max+"这个索引为"+max_i);
    }
}
