package Java_study;
// 字符串：字符串类型String是引用类型，我们用双引号"..."表示字符串，因为字符串使用双引号"..."表示开始和结束，
//         那如果字符串本身恰好包含一个"字符时，我们需要借助转义字符\;
//字符串连接：可以使用+连接任意字符串和其他数据类型，这样极大地方便了字符串的处理
public class Day3_String_Arrary {
    public static void main(String[] args){
        String s = "abc\\xyz"; // 包含7个字符: a, b, c, \, x, y, z
        System.out.println(s);
        String s1 = "Hello";//连接
        String s2 = "world";
        String v = s1 + " " + s2 + "!";
        System.out.println(v);
    }
}

//数组
//    1.遍历数组遍历
//      数组可以使用for循环，for循环可以访问数组索引，for each循环直接迭代每个数组元素，但无法获取索引；
//      使用Arrays.toString()可以快速获取数组内容
public class Main {
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=0; i<ns.length; i++) {
            int n = ns[i];
            System.out.println(n);
        }
    }
}

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] ns = { 1, 1, 2, 3, 5, 8 };
        System.out.println(Arrays.toString(ns));
    }
}
//    2.常用的排序算法有冒泡排序、插入排序和快速排序等；
//      冒泡排序使用两层for循环实现排序；
//      交换两个变量的值需要借助一个临时变量。
//      可以直接使用Java标准库提供的Arrays.sort()进行排序；
//      对数组排序会直接修改数组本身
//冒泡排序
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j+1]) {
                    // 交换ns[j]和ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
        // 排序后:
        System.out.println(Arrays.toString(ns));
    }
}
//