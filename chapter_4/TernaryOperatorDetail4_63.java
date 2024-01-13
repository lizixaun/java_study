package chapter_4;

/**
 * @author 李子煊
 * @version 1.0
 */
public class TernaryOperatorDetail4_63 {
    public static void main(String[] args){
        //求三个数中 最大的一个数字
        int a=1;
        int b=2;
        int c=3;
        int d=a>b?a:b;
        int e=c>d?c:d;
        System.out.println(e);
    }
}
