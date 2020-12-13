package Algorithm.huawei;

import java.util.Scanner;

/**
 * 输入描述:
 * 本题含有多组样例输入
 * 对于每组样例，输入一行，代表待统计的字符串
 *
 * 输出描述:
 * 对于每组样例，输出一个整数，代表字符串中大写字母的个数
 */
public class T_Easy_14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String str = scan.nextLine();
            char [] chars =str.toCharArray();
            int count =0;
            for(int i =0;i<chars.length;i++){
                if(chars[i]>='A'&&chars[i]<='Z'){
                    count++;
                }
            }
            System.out.println(count);
        }
        scan.close();
    }
}
