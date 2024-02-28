package chapter_5;
/**
 * @author 李子煊
 * @version 1.0
 */
public class ForDetail {
    public static void main(String[] args) {
        // 记录开始时间
        long startTime = System.currentTimeMillis();

        // 在这里放入你要计时的代码
        // 例如，一个简单的循环
        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i;
        }

        // 记录结束时间
        long endTime = System.currentTimeMillis();

        // 计算代码执行时间
        long elapsedTime = endTime - startTime;

        System.out.println("代码执行时间: " + elapsedTime + " 毫秒");
    }
}

