package com.javase.inner;


public class InnerDemo2 {
	public static void main(String[] args) {
		OutClass2.Inner2.show2();
		OutClass2.Inner2 inner2 = new OutClass2.Inner2();
		inner2.show();
	}
}


class OutClass2{
	private int num = 10;
	private static int num2 = 100;
	public static class Inner2 {
		public void show() {
			System.out.println(num2);//静�?�内部类只能调用静�?�的变量,不能调用非静态的变量
		}

		public static void show2() {
			System.out.println(num2);
		}		
	}
}