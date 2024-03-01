package chapter_6;

import java.util.Scanner;

/**
 * @author 李子煊
 * @version 1.0
 */
public class homework04 {
    public static void main(String[] args) {
        //{10,12,45,90}
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 45;
        arr[3] = 90;

        Scanner input=new Scanner(System.in);
        System.out.println("请输入");
        int number=input.nextInt();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>number){
                temp=arr[i];
                arr[i]=number;
                number=temp;

            }else {
                arr[arr.length+1]=number;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
