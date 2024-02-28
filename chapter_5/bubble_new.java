package chapter_5;

/**
 * @author 李子煊
 * @version 1.0
 */

/**
 * @author 李子煊
 * @version 1.0
 */
public class bubble_new {
    public static void main(String[] args) {
        int[] array = {24, 69, 80, 57, 13};

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
