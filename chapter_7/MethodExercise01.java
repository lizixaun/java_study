package chapter_7;

/**
 * @author 李子煊
 * @version 1.0
 */
public class MethodExercise01 {
    public static void main(String[] args) {
        AA trueif=new AA();
        //System.out.println(trueif.method001(10));
        trueif.method002(10,9,'%');
    }
}
class AA {
    public boolean method001(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void method002(int a,int col, char b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < col; j++) {//控制行
                System.out.print(b);
            }
            System.out.println();//加上这一行是为了有换行的能力，我们需要输完完一行后面换行
        }
    }
    public void meth003(int[] a ){
        a[1]=1;
        System.out.println(a);
    }
}