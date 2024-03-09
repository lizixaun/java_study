//package chapter_7;
//
///**
// * @author 李子煊
// * @version 1.0
// */
//public class RecursionExercise01 {
//    public static void main(String[] args) {
//        metch02 s=new metch02();
//        int n=10;
//        int []a=s.fanfa(n);
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i]+" ");
//
//        }
//    }
//}
//class metch02{
//    public int[] fanfa(int a){
//        int []arr=new int[a];
//        arr[0]=1;
//        arr[1]=1;
//        for (int i = 2; i < a; i++) {
//            arr[i]=arr[i-1]+arr[i-2];
//        }
//        return arr;
//    }
//}
