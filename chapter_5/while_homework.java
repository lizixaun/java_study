package chapter_5;


/**
 * @author 李子煊
 * @version 1.0
 */
//public class while_homework {
//    public static void main(String[] args) {
//        int someone_money = 100000;
//        int mun = 0;
//        System.out.println("1");
//
//        while (someone_money >= 1000) {
//            System.out.println("2");
//
//            if (someone_money > 50000) {
//                someone_money = (int)(0.95*someone_money);
//            } else {
//                someone_money = someone_money - 1000;
//            }
//
//            mun = mun + 1;
//        }
//
//        System.out.println("最终循环次数：" + mun);
//    }
//}
//代码问题，小于0还会继续工作，while只要复合条件了就在里面了，直到后面的while判断完了才出来
public class while_homework {
    public static void main(String[] args) {
        int someone_money=100000;
        int mun=0;
        while(true) {
            while (someone_money > 50000) {
                someone_money = someone_money - someone_money % 5;

            }
            while (someone_money <= 50000) {
                someone_money = someone_money - 1000;
            }
            while (someone_money<1000){
                break;
            }
            mun=mun+1;
        }

    }
}
//public class while_homework {
//    public static void main(String[] args) {
//        double someone_money = 100000;
//        int mun = 0;
//        int mun1 = 0;
//
//        while (someone_money > 1000) {
//            while (someone_money > 50000) {
//                someone_money = 0.95 * someone_money;
//                mun = mun + 1;
//            }
//
//            while (someone_money <= 50000) {
//                System.out.println(someone_money);
//                if (someone_money>0) {
//                    someone_money = someone_money - 1000;
//                }
//                else {
//                    break;
//                }
//                mun1 = mun1 + 1;
//            }
//        }
//
//        int munmax = mun + mun1;
//        System.out.println(munmax);
//    }
//}
