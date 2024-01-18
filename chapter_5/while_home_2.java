package chapter_5;
import java.util.Scanner;
/**
 * @author 李子煊
 * @version 1.0
 */
public class while_home_2 {
    public static void main(String[] args) {
        int max=0;
        int last_one=0;
       for(int i=1;i<101;i++){
           last_one=last_one+i;
           max=max+last_one;
        }
        System.out.println(max);

    }
}
