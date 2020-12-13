package Algorithm.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 题目描述
 * 根据输入的日期，计算是这一年的第几天。。
 *
 * 测试用例有多组，注意循环输入
 *
 * 输入描述:
 * 输入多行，每行空格分割，分别是年，月，日
 */
public class T_Easy_17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,31);
        map.put(2,28);
        map.put(3,31);
        map.put(4,30);
        map.put(5,31);
        map.put(6,30);
        map.put(7,31);
        map.put(8,31);
        map.put(9,30);
        map.put(10,31);
        map.put(11,30);
        map.put(12,31);
        while(scan.hasNextInt()){
            int year = scan.nextInt();
            int month = scan.nextInt();
            int day = scan.nextInt();
            int count = 0;

            if(year%4==0){
                //闰年
                map.put(2,29);
            }else{
                map.put(2,28);
            }
            for(int i=1;i<=month;i++){
                count+=map.get(i);
            }
            count = count+day-map.get(month);
            System.out.println(count);
        }
        scan.close();
    }
}
