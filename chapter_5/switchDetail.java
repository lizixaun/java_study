package chapter_5;

/**
 * @author 李子煊
 * @version 1.0
 */
public class switchDetail {
    public static void main(String[] args) {
        //表达式数据类型，应和case后的常量类型一致，或者是可以自动转成可以相互比较的类型
            char c='a';
            switch (c){
                case 'a':
                    System.out.println("ok1");
                    break;
                case 20:            //这边这么写默认是为int类型，那么就是可以转化就可以
                    System.out.println("ok2");
                    break;
//                case "oqks":
//                    System.out.println("类型不一样，代码跑不了");
//                    break;
                default:
                    System.out.println("输入错误");
            }
    }
}
