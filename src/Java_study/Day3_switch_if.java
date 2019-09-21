package Java_study;
// if 语句后面可以跟 else 语句，当 if 语句的布尔表达式值为 false 时，else 语句块会被执行。
// switch case 语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支。
public class Day3_switch_if {
    public static void main(String[] args){
        int x = 30;
        if( x == 10 ){                            // if语句
            System.out.print("Value of X is 10");
        }else if( x == 20 ){
            System.out.print("Value of X is 20");
        }else if( x == 30 ){
            System.out.print("Value of X is 30");
        }else{
            System.out.print("这是 else 语句");
        }
    }
}
//总结：
//        if ... else可以做条件判断，else是可选的；
//        不推荐省略花括号{}；
//        多个if ... else串联要特别注意判断顺序；
//        要注意if的边界条件；
//        要注意浮点数判断相等不能直接用==运算符；
//        引用类型判断内容相等要使用equals()，注意避免NullPointerException。

//   switch语句根据switch (表达式)计算的结果，跳转到匹配的case结果，然后继续执行后续语句，直到遇到break结束执行。
//   如果 case 语句块中没有 break 语句时，程序并不会顺序输出每一个 case 对应的返回值，而是继续匹配，匹配不成功则返回默认case
//   如果 case 语句块中没有 break 语句时，匹配成功后，从当前 case 开始，后续所有 case 的值都会输出
//   如果当前匹配成功的 case 语句块没有 break 语句，则从当前 case 开始，后续所有 case 的值都会输出，如果后续的 case 语句块有 break 语句则会跳出判断
public class Day3_switch_if {
    public static void main(String[] args){
        int option = 99;
        switch (option) {                      // switch语句
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
    }
}
// 从Java 12开始，switch语句升级为更简洁的表达式语法,保证只有一种路径会被执行，并且不需要break语句
// 注意新语法使用->，如果有多条语句，需要用{}括起来。不要写break语句，因为新语法只会执行匹配的语句，没有穿透效应
public class Day3_switch_if {
    public static void main(String[] args){
        String fruit = "apple";
        switch (fruit) {
            case "apple" -> System.out.println("Selected apple");
            case "pear" -> System.out.println("Selected pear");
            case "mango" -> {
                System.out.println("Selected mango");
                System.out.println("Good choice!");
            }
            default -> System.out.println("No fruit selected");
        }
    }
}
// 使用新的switch语法，不但不需要break，还可以直接返回值
public class Day3_switch_if {
    public static void main(String[] args) {
        String fruit = "apple";
        int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> 0;
        }; // 注意赋值语句要以;结束
        System.out.println("opt = " + opt);
    }
}
//总结：
//        switch语句可以做多重选择，然后执行匹配的case语句后续代码；
//        switch的计算结果必须是整型、字符串或枚举类型；
//        注意千万不要漏写break，建议打开fall-through警告；
//        总是写上default，建议打开missing default警告；
//        从Java 13开始，switch语句升级为表达式，不再需要break，并且允许使用yield返回值。