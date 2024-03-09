package chapter_7;

/**
 * @author 李子煊
 * @version 1.0
 */
public class kebian {
    public static void main(String[] args) {
        metch0001 m=new metch0001();
        int c=m.iii(1+2+3);
        System.out.println(c);
    }
}
class metch0001{

    public int iii(int... a){
        int b=0;
        for (int i = 0; i < a.length; i++) {
            b=b+a[i];
        }
        return b;
    }
}