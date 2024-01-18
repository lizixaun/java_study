package chapter_5;

/**
 * @author 李子煊
 * @version 1.0
 */
public class TollBoothExample {
    public static void main(String[] args) {
        int someone_money = 100000;
        int count = 0;

        while (someone_money >= 1000) {
            if (someone_money > 50000) {
                int toll = (int) (someone_money * 0.05); // 计算5%的交费
                someone_money -= toll;
            } else {
                someone_money -= 1000; // 当现金<=50000时，每次交1000
            }

            count++; // 经过路口次数加1
        }

        System.out.println("该人可以经过 " + count + " 次路口");
    }
}
