package Algorithm.huawei;

import java.util.Scanner;

/**
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class T_Easy_12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int month = scan.nextInt();
            System.out.println(getNum(month)+1);
        }

        scan.close();
    }

    public static int getNum(int month){
        if(month <= 2){
            return 0;
        }
        int count = 0;
        for(int i=0;i<month;i++){
            if(i >1){
                count += getNum(month-i)+1;
            }
        }
        return count;
    }
}
