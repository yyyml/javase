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
			System.out.println(num2);//ιζ?ει¨η±»εͺθ½θ°η¨ιζ?ηει,δΈθ½θ°η¨ιιζηει
		}

		public static void show2() {
			System.out.println(num2);
		}		
	}
}