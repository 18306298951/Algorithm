package Algorithm.huawei;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * 题目描述
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * 输入描述:
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 */
public class T_Easy_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        TreeMap<String, Integer> tree = new TreeMap<String, Integer>(
                (o1, o2) -> {
                    if (o1.compareTo(o2) > 0) {
                        return 1;
                    } else if (o1.compareTo(o2) == 0) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
        );
        for (int i = 0; i < num; i++) {
            String str = sc.next();
            if (tree.keySet().contains(str)) {
                tree.put(str, tree.get(str) + 1);
            } else {
                tree.put(str, 1);
            }

        }
        tree.keySet().forEach(key -> {
            for (int i = 0; i < tree.get(key); i++) {
                System.out.println(key);
            }

        });
    }
}
