package Algorithm.huawei;

import java.util.Scanner;

/**
 * 题目描述
 * 题目描述
 *
 * 把m个同样的苹果放在n个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？（用K表示）5，1，1和1，5，1 是同一种分法。
 *
 * 数据范围：0<=m<=10，1<=n<=10。
 * 本题含有多组样例输入。
 */
public class T_Easy_13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int m = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(getapp(m,n))
            ;
        }

        scan.close();
    }

    public static int getapp(int m,int n){
        if(n==1|| m==0){
            return 1;
        }
        if(n>m){
            return getapp(m,m);
        }
        return getapp(m,n-1)+getapp(m-n,n);

    }
}
