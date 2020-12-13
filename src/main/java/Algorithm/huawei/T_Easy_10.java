package Algorithm.huawei;

import java.util.Scanner;

/**
 * 请计算n*m的棋盘格子（n为横向的格子数，m为竖向的格子数）沿着各自边缘线从左上角走到右下角，总共有多少种走法，要求不能走回头路，即：只能往右和往下走，不能往左和往上走。
 * <p>
 * 本题含有多组样例输入。
 * 递归法
 */
public class T_Easy_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            System.out.print(a(n, m));

        }
        scan.close();
    }

    public static int a(int a, int b) {
        if (a == 0 && b != 0 || a != 0 && b == 0) {
            return 1;
        } else if (a == 0 && b == 0) {
            return 0;
        } else
            return a(a - 1, b) + a(a, b - 1);
    }
}
