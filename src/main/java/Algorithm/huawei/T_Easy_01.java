package Algorithm.huawei;

import java.util.Scanner;

/**
 * 题目描述
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
public class T_Easy_01 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextInt()+"";
        char [] chars = str.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            System.out.print(chars[i]);
        }
    }
}
