package chapter_5;

/**
 * @author 李子煊
 * @version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {24, 69, 80, 57, 13};

        // 找到未排序数组中最大值及其索引
        int max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        // 输出未排序数组中最大值及其索引
        System.out.println("未排序数组中最大数值：" + max + "，最大数值的下标：" + maxIndex);

        // 执行气泡排序
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // 交换元素
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // 打印排序后的数组
        System.out.print("排序后的数组：");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
