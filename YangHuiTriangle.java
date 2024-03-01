package chapter_6;

/**
 * @author 李子煊
 * @version 1.0
 */
public class YangHuiTriangle {
    public static void main(String[] args) {
        int numRows = 10; // 行数为10
        int[][] yangHui = new int[numRows][];

        // 生成杨辉三角
        for (int i = 0; i < numRows; i++) {
            yangHui[i] = new int[i + 1]; // 每一行的元素个数

            // 给每一行赋值
            for (int j = 0; j < yangHui[i].length; j++) {
                // 每一行的第一个元素和最后一个元素都是1
                if (j == 0 || j == yangHui[i].length - 1) {
                    yangHui[i][j] = 1;
                } else { // 中间的元素
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                }
            }
        }

        // 输出杨辉三角
        for (int i = 0; i < numRows; i++) {
            // 调整空格以进行格式化
            for (int k = 0; k < numRows - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < yangHui[i].length; j++) { // 遍历输出该行
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println(); // 换行
        }
    }
}
