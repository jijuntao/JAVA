package Java_study;
// 字符串：字符串类型String是引用类型，我们用双引号"..."表示字符串，因为字符串使用双引号"..."表示开始和结束，
//         那如果字符串本身恰好包含一个"字符时，我们需要借助转义字符\;
//字符串连接：可以使用+连接任意字符串和其他数据类型，这样极大地方便了字符串的处理
public class Day2_String_Arrary {
    public static void main(String[] args){
        String s = "abc\\xyz"; // 包含7个字符: a, b, c, \, x, y, z
        System.out.println(s);
        String s1 = "Hello";//连接
        String s2 = "world";
        String v = s1 + " " + s2 + "!";
        System.out.println(v);
    }
}
// 数组：定义一个数组类型的变量，使用数组类型“类型[]”,数组一旦创建后，大小就不可改变。
//       要访问数组中的某一个元素，需要使用索引。数组索引从0开始
//       数组元素可以是值类型（如int）或引用类型（如String），但数组本身是引用类型；
//  遍历数组:使用for循环，for循环可以访问数组索引，for each循环直接迭代每个数组元素，但无法获取索引；
//           使用Arrays.toString()可以快速获取数组内容。
public class Day2_String_Arrary {
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int n : ns) {//for循环
            System.out.println(n);
        }
    }
}
import java.util.Arrays;//用Arrays.toString()可以快速获取数组内容
public class Day2_String_Arrary  {
    public static void main(String[] args) {
        int[] ns = { 1, 1, 2, 3, 5, 8 };
        System.out.println(Arrays.toString(ns));
    }
}
//  数组排序:常用的排序算法有冒泡排序、插入排序和快速排序
//           冒泡排序使用两层for循环实现排序；
//           交换两个变量的值需要借助一个临时变量。
//           可以直接使用Java标准库提供的Arrays.sort()进行排序；
//           对数组排序会直接修改数组本身
    //冒泡排序
import java.util.Arrays;
public class Day2_String_Arrary {
    public static void main (String[] args) {
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
// 多维数组：二维数组就是数组的数组，三维数组就是二维数组的数组；
//          多维数组的每个数组元素长度都不要求相同；
//          打印多维数组可以使用Arrays.deepToString()
//  二维数组：
public class Day2_String_Arrary  {
    public static void main(String[] args) {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println(ns.length); // 3
    }
}
//  三维数组
int[][][] ns = {
        {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        },
        {
                {10, 11},
                {12, 13}
        },
        {
                {14, 15, 16},
                {17, 18}
        }
}
