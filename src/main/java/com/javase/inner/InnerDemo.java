package com.javase.inner;

import com.javase.inner.OutClass.InnerClass;

public class InnerDemo {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		InnerClass innerClass = outClass.new InnerClass();
		innerClass.show();
	}
}


class OutClass{
	private int num = 10;
	class InnerClass{
		public void show(){
			System.out.println(num);
		}
	}
	
	
}