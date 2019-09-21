package Java_study;
//Java中有三种主要的循环结构： while 循环/do…while 循环 /for 循环
//关键字：break和continue
public class Day3_for_while {
    public static void main(String[] args){
        int sum = 0;
        int n = 0;
        while (n <= 100) {                      // while循环
            n ++;
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
//总结：
//     while循环先判断循环条件是否满足，再执行循环语句；
//        while循环可能一次都不执行；
//        编写循环时要注意循环条件，并避免死循环

public class Day3_for_while {
    public static void main(String[] args){
        int sum = 0;
        int n = 1;
        do {                                  // do…while 循环
            sum = sum + n;
            n ++;
        } while (n <= 100);
        System.out.println(sum);
    }
}
//总结：
//        do while循环先执行循环，再判断条件；
//        do while循环会至少执行一次

public class Day3_for_while {
    public static void main(String[] args){
        int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int i=0; i<ns.length; i++) {                // for循环
            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
            sum = sum + ns[i];
        }
        System.out.println("sum = " + sum);
    }
}
public class Day3_for_while {
    public static void main(String[] args){
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int n : ns) {                            // for each循环，用以遍历数组
            System.out.println(n);
        }
    }
}
//总结：
//        for循环通过计数器可以实现复杂循环；
//        for each循环可以直接遍历数组的每个元素

public class Day3_for_while {
    public static void main(String[] args){
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;                      // break关键字
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}
//总结：
//        break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。
//        break 跳出最里层的循环，并且继续执行该循环下面的语句

public class Day3_for_while {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                continue;                  // continue关键字
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}
//总结：
//        continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
//        在 for 循环中，continue 语句使程序立即跳转到更新语句。
//        在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句