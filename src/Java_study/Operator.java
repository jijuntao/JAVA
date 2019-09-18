package Java_study;
//        算术运算符——>+;-;*;/;%;++;--
//        关系运算符——>==;!=;>;<;>=;<=
//        位运算符——>&;|;^;~;<<;>>;>>>
//        逻辑运算符——>&&;||;！
//        赋值运算符——>=;+=;-=;*=;/=;(%)=;<<=;>>=;&=;^=;|=
//        其他运算符
public class Operator {
    public static void main(String[] args){
        int a = 3;//定义一个变量
        int b = ++a;//自增运算, 操作数的值增加1
        int c = 3;//定义一个变量
        int d = --c;//自减运算, 操作数的值减少1
        System.out.println("进行自增运算后的值等于"+b);
        System.out.println("进行自减运算后的值等于"+d);
    }
}
