package com.huatec.edu;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(100);
		System.out.println('A');
		System.out.println("1"+"2");//12
		System.out.println(1+2);//3
		//声明一个int类型的变量i，并赋值
//		int i;
//		i = 10;
		int i = 10;
		System.out.println(i);//10
		
		int a = 2,b = 3,c = 4;
		System.out.println("abc");//abc
		System.out.println('a');//a
		System.out.println('a'+'b'+'c');//294	char值相加，a=97,b=98,c=99
		System.out.println(a+b+c);//9
		System.out.println("a"+"b"+"c");//abc
		System.out.println(a+","+b+","+c);//2,3,4	
	}
}