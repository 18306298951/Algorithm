package Algorithm.huawei;

import java.util.Scanner;

/**
 * 公元前五世纪，我国古代数学家张丘建在《算经》一书中提出了“百鸡问题”：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 *
 * 详细描述：
 *
 * 接口说明
 *
 * 原型：
 *
 * int GetResult(vector &list)
 *
 * 输入参数：
 *
 *         无
 *
 * 输出参数（指针指向的内存区域保证有效）：
 *
 *     list  鸡翁、鸡母、鸡雏组合的列表
 *
 * 返回值：
 *
 *      -1 失败
 *
 *      0 成功
 */
public class T_Easy_15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<20;i++)
        {
            for(int j=0;j<(100-i*5)/3;j++){
                if(14*i+8*j == 200 ){
                    System.out.println(i+" "+j+" "+(100-i-j));
                }
            }
        }
        scan.close();
    }
}
