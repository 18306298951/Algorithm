package Algorithm.huawei;

import java.util.Scanner;

/**
 * 功能:等差数列 2，5，8，11，14。。。。
 *
 * 输入:正整数N >0
 *
 * 输出:求等差数列前N项和
 *
 * 本题为多组输入，请使用while(cin>>)等形式读取数据
 */
public class T_Easy_09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            int count =0;
            int a=2;
            for(int i =0;i<num;i++){
                count = a+count;
                a=a+3;
            }
            System.out.println(count);
        }

        scan.close();

    }
}
