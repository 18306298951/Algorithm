package Algorithm.actal;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * 上面的输入 栈中的某一个元素 等于 他前面几个数的和
 * n1 n2 n 3 n4... n(x)
 *  n3 = n1+n2
 * 则移除 n1 n2 n3 插入 2*n3
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Long> list = new ArrayList();

        String str = in.nextLine();
        in.close();
        String[] strs = str.split(" ");

        for (int z = 0; z < strs.length; z++) {
            if (Integer.valueOf(strs[z]) >0){
                list.add(Long.valueOf(strs[z]));
            }
        }

        for (int i = 1; i < list.size(); i++) {
            long count = 0;
            int num = -1;
            long sum = 0;
            int i2 = i;
            for (int j = i - 1; j >= 0; j--) {
                count = count + list.get(j);
                if (count == list.get(i)) {
                    num = j;
                    sum = 2 * count;
                    break;
                }
            }
            if (num != -1) {
                for (int h = num; h <= i2; h++) {
                    list.remove(num);
                    i--;
                }
                list.add(i + 1, sum);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
