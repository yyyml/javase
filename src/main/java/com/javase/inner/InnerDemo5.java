package com.javase.inner;

/**
 * @author jojo
 * 匿名内部类
 */
public class InnerDemo5 {
	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		o.method();
	}
}


interface Inter{
	public abstract void show();
	public abstract void show2();
}
class OuterClass{
	public void method(){
		/*new Inter() {
			@Override
			public void show2() {
				System.out.println("show2");
			}
			@Override
			public void show() {
				System.out.println("show");
			}
		}.show();
		new Inter() {
			@Override
			public void show2() {
				System.out.println("show2");
			}
			@Override
			public void show() {
				System.out.println("show");
			}
		}.show2();;*/
		//下面是解决方案
		Inter inter = new Inter() {
			public void show2() {
				System.out.println("show2");
			}
			public void show() {
				System.out.println("show");
			}
		};
		inter.show();
		inter.show2();
	}
}
