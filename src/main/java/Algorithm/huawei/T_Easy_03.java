package Algorithm.huawei;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
public class T_Easy_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        for (int i = strs.length - 1; i >= 0; i--) {
            System.out.print(strs[i] + " ");
        }



    }
}
