package com.javase.inner;


public class InnerDemo3 {
	public static void main(String[] args) {
		Outer3 outer3 = new Outer3();
		outer3.method();
	}
}



class Outer3{
	private int num=10;
	public void method(){
		final int num2=20;
		//原因是编译程序实现上的困难：内部类对象的生命周期会超过局部变量的生命期�?�局部变量的生命期：当该方法被调用时，该方法中的�?部变量在栈中被创建，当方法调用结束时，�??栈，这些�?部变量全部死亡�?��?�内部类对象生命期，与其它类�?样，当创建一个局部内部类对象后，只有当没有其它人再引用它时，它才能死亡�?�所以完全可能一个方法已调用结束（局部变量已死亡），但该�?部类的对象仍然活�?。即：局部类的对象生命期会超过局部变量�??
		class Inner{//这个是局部内部类,是在堆内存中�? 不会立即消失
			public void show(){
				System.out.println(num);
				System.out.println(num2);//这里要使用num2必须使用final 因为使用final就变为常量了�?
			}
		}
		Inner i=new Inner();
		i.show();//�?部变量是随着方法的消失�?�消�? 调用结束 num2的声明周期就结束
	}

}