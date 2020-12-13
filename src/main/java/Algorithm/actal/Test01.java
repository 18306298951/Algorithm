package Algorithm.actal;

import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

/**
 * 第二道简单的 是
 * 输入  一个正整数 n  和一个 数组
 * 例如 2  【2 2 100 0 0 99 0 2】
 * 输出平均数小于2 的最大连续的下标
 * 输出 0-2 3-4 6-7
 */
public class Test01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        String str1 = "";
        while("".equals(str1)){
            str1 = in.nextLine();
        }
        in.close();
        String[] str = str1.split(" ");

        if (str.length==1){
            System.out.print(0+"-"+0);
        }

        Map<Integer, List<String>> map = new HashMap();

        for (int i = 0; i < str.length; i++) {
            int ave = 0;
            int sum = Integer.valueOf(str[i]);
            for (int j = i + 1; j < str.length; j++) {
                int b = Integer.valueOf(str[j]);
                sum = sum + b;
                ave = sum / (j - i+1);
                if (ave <= min) {
                    if (map.keySet().contains(j - i+1)) {
                        List<String> list = map.get(j - i+1);
                        list.add(i + "-" + j);
                        map.put(j - i+1, list);
                    } else {
                        List<String> list = new ArrayList<>();
                        list.add(i + "-" + j);
                        map.put((j - i+1), list);
                    }
                }
            }
        }

        int max = -1;

        for (int key : map.keySet()) {
            if (max == -1) {
                max = key;
            }
            if (max < key) {
                max = key;
            }
        }

        if (max == -1) {
            System.out.println("NULL");
        } else {
            List<String> list = map.get(max);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        }

    }

}
