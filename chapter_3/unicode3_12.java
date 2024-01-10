package chapter_3;

/**
 * @author 李子煊
 * @version 1.0
 */
//老师给的代码注释有点问题，不够严谨。容易误导初学者。####char是最接近计算机底层的
    //接下来我以我的角度开始讲述第3点和第5点
public class unicode3_12{
    public static void main(String[] args) {
            //第三点：ASCII是Unicode码的一个子集，他们是一个东西，应该算是Unicode码是ASCII的补充。不应该是互相转换，我们下面输出的应该是他们的不同写法。unicode码（ASCII码）有四种类别分别为二级制，十进制，十六进制，图形化。
            //应该是叫输出时，我们需要10进制还是图形化，图形化指的是我们的字母：a,b.ASCII的底层就是使用数字对应我们的字母。让计算机用输出我们需要的对应字母，然后打出英文。
            //下面几行代码说明：1.直接输出得到图形化2.int之后得到对应的十进制3.char本质就是以Unicode或者说是ASCII码的十进制保存计算的
            //1.2
            char a=10;//十进制的ascii
            System.out.println(a);//得到图形化，\n也就是换行符
            System.out.println((int)a);//告诉系统我们需要数字的，数字也就是默认为10
            char b='c';
            System.out.println("我是b:"+b);//得到图形化也就是c
            System.out.println("我是b的十进制："+(int)b);//得到99
            //3char本质就是以Unicode或者说是ASCII码的十进制保存计算的####同时也说明了计算完之后就是整数的形式下一行代码得到的结果
            System.out.println('b'+1);//得到99，也就是说自动加上了int效果
            char c1='b'+1;             //因为是通过十进制（Unicode）计算保存的所以等于99的十进制结果，注意下面那一行只要图形化结果所以是c
            System.out.println(c1);     //c
    }
}