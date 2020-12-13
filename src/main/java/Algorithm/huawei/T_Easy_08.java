package Algorithm.huawei;

import java.util.Scanner;

/**
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。
 */
public class T_Easy_08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char [] strs = scan.nextLine().toCharArray();
        for(int i =strs.length-1;i>=0;i--){
            System.out.print(strs[i]);
        }
        scan.close();
    }
}
