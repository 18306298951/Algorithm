package Algorithm.huawei;

import java.util.Scanner;

/**
 * 题目描述
 * 求一个byte数字对应的二进制数字中1的最大连续数，例如3的二进制为00000011，最大连续2个1
 * <p>
 * 本题含有多组样例输入。
 * <p>
 * 输入描述:
 * 输入一个byte数字
 */
public class T_Easy_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int max = 0;
            int count = 0;
            while (n > 0) {
                if ((n & 1) == 1) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                } else {
                    if (count > max) {
                        max = count;
                    }
                    count = 0;
                }
                n = n >> 1;

            }
            System.out.println(max);
        }
        scan.close();
    }
}
