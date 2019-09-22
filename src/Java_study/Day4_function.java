package Java_study;
//遵循特定语法，具有特定功能的一段代码，描述的是类的行为
//构造函数
//非构造函数(普通函数)

//函数格式：修饰符    返回值类型    函数名  （  [    参数类型1 参数名1,参数类型2 参数名2....    ]  ）{
//                           //   [    ]    里面表示可选项，即参数不是必须的
//                           执行语句...
//                           return  返回值；    //返回值的类型必须与返回值类型一致
//                            }
//        说明:
//        修饰符：可以是访问修饰符，也可以说是函数修饰符（abstract、final、 static、synchronized），还可以是两者的组合。
//        返回值类型：用于限定函数返回值的数据类型。
//        参数类型：用于限定调用函数时传递的数据类型。
//        参数名：是一个变量，用来接收调用方法时传递的数据。
//        return：用来接收方法以及返回函数指定类型的值。
//        返回值：这个值会返回给函数的调用者。

public class Day4_function {
    /*
     * 程序入口,主函数 .
     *
     * @ 方法 <==> 函数,指的是同一个东西.
     */
    public static void main(String[] args) {
        // 通过函数名调用
        method01();

        method02(9, 3);
        System.out.println("5+6=" + add(5, 6));
    }

    /*
     * @ 函数的格式为：
     *
     * @ 访问修饰符 返回值类型 函数名(参数类型1 参数名1,参数类型2 参数名2....){
     *
     * @ 执行语句
     *
     * @ return 返回值;//返回值的类型必须与返回值类型一致
     *
     * @ }
     */
    /*
     * @ 声明一个静态函数method01() 无参数无返回值
     */
    static void method01() {
        System.out.println("这是method01方法,可以通过method01();调用.");
        // 这个return可以省略.每个函数都是以return结束,返回到函数调用处
        return;
    }

    /*
     * 有参数无返回值
     */
    static void method02(int num1, int num2) {
        method01();
        System.out.println("这是method02方法,第一个参数是" + num1 + "第二个参数是" + num2);
    }

    /*
     * 有返回值的返回值类型要和要返回的数据类型一致
     *
     * @ 例如：计算两个整数的和,结果仍然是整型,返回值类型为int.返回值类型可以说基本数据类型，也可是自定义的数据类型
     */
    static int add(int num1, int num2) {
        int sum = 0; // 声明一个整形变量并初始化为0
        sum = num1 + num2;// 将num1和num2的和赋值给sum
        return sum;// 将sum的值返回到调用处
    }
}
