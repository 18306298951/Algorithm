package Algorithm.huawei;

import java.util.Scanner;

/**
 * 题目描述
 * 密码按如下规则进行计分，并根据不同的得分为密码进行安全等级划分。
 * <p>
 * 一、密码长度:
 * <p>
 * 5 分: 小于等于4 个字符
 * <p>
 * 10 分: 5 到7 字符
 * <p>
 * 25 分: 大于等于8 个字符
 * <p>
 * 二、字母:
 * <p>
 * 0 分: 没有字母
 * <p>
 * 10 分: 全都是小（大）写字母
 * <p>
 * 20 分: 大小写混合字母
 * <p>
 * 三、数字:
 * <p>
 * 0 分: 没有数字
 * <p>
 * 10 分: 1 个数字
 * <p>
 * 20 分: 大于1 个数字
 * <p>
 * 四、符号:
 * <p>
 * 0 分: 没有符号
 * <p>
 * 10 分: 1 个符号
 * <p>
 * 25 分: 大于1 个符号
 * <p>
 * 五、奖励:
 * <p>
 * 2 分: 字母和数字
 * <p>
 * 3 分: 字母、数字和符号
 * <p>
 * 5 分: 大小写字母、数字和符号
 * <p>
 * 最后的评分标准:
 * <p>
 * >= 90: 非常安全
 * <p>
 * >= 80: 安全（Secure）
 * <p>
 * >= 70: 非常强
 * <p>
 * >= 60: 强（Strong）
 * <p>
 * >= 50: 一般（Average）
 * <p>
 * >= 25: 弱（Weak）
 * <p>
 * >= 0:  非常弱
 * <p>
 * <p>
 * 对应输出为：
 * <p>
 * VERY_SECURE
 * <p>
 * SECURE,
 * <p>
 * VERY_STRONG,
 * <p>
 * STRONG,
 * <p>
 * AVERAGE,
 * <p>
 * WEAK,
 * <p>
 * VERY_WEAK,
 * <p>
 * <p>
 * 请根据输入的密码字符串，进行安全评定。
 * <p>
 * 注：
 * <p>
 * 字母：a-z, A-Z
 * <p>
 * 数字：-9
 * <p>
 * 符号包含如下： (ASCII码表可以在UltraEdit的菜单view->ASCII Table查看)
 * <p>
 * !"#$%&'()*+,-./     (ASCII码：x21~0x2F)
 * <p>
 * :;<=>?@             (ASCII<=><=><=><=><=>码：x3A~0x40)
 * <p>
 * [\]^_`              (ASCII码：x5B~0x60)
 * <p>
 * {|}~                (ASCII码：x7B~0x7E)
 */
public class T_Easy_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.next();
            int numCount = 0;
            int upStrCount = 0;
            int lowStrCount = 0;
            int otherCount = 0;

            int score = 0;

            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= 48 && chars[i] <= 57) {
                    numCount++;
                } else if (chars[i] >= 65 && chars[i] <= 90) {
                    upStrCount++;
                } else if (chars[i] >= 97 && chars[i] <= 122) {
                    lowStrCount++;
                } else {
                    otherCount++;
                }
            }
            if (upStrCount == 0 && lowStrCount == 0) {
                score += 0;
            } else if (upStrCount != 0 && lowStrCount != 0) {
                score += 20;
            } else {
                score += 10;
            }

            if (numCount == 0) {
                score += 0;
            } else if (numCount == 1) {
                score += 10;
            } else {
                score += 20;
            }

            if (otherCount == 0) {
                score += 0;
            } else if (otherCount == 1) {
                score += 10;
            } else {
                score += 25;
            }

            if (otherCount != 0 && upStrCount != 0 && lowStrCount != 0 && numCount != 0) {
                score += 5;
            } else if (otherCount != 0 && (upStrCount != 0 || lowStrCount != 0) && numCount != 0) {
                score += 3;
            } else if ((upStrCount != 0 || lowStrCount != 0) && numCount != 0) {
                score += 2;
            }

            if (chars.length <= 4) {
                score += 5;
            } else if (chars.length >= 8) {
                score += 25;
            } else {
                score += 10;
            }

            if (score >= 90) {
                System.out.println("VERY_SECURE");
            } else if (score >= 80) {
                System.out.println("SECURE");
            } else if (score >= 70) {
                System.out.println("VERY_STRONG");
            } else if (score >= 60) {
                System.out.println("STRONG");
            } else if (score >= 50) {
                System.out.println("AVERAGE");
            } else if (score >= 25) {
                System.out.println("WEAK");
            } else if (score >= 0) {
                System.out.println("VERY_WEAK");
            }
        }
        scan.close();

    }
}
