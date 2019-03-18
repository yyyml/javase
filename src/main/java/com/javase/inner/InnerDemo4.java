package com.javase.inner;

/**
 * @author jojo
 * 解决一些非面向对象的语句块
 * 这些语句都不是面向对象的，给我们造成了系统的扩展上的麻烦。
 * 我们可以看看，在模式中，有多少模式是用来解决由if语句带来的扩展性的问题。
 */
public class InnerDemo4 {
	public static void main(String[] args) {
		new DataTemplate().execute(new DataManager() {
			public void manageData() {
				/*Integer i = null;
				if(i == 1)*/
				System.out.println("第一个业务");
				System.out.println("--------------------------");
			}
		});
		new DataTemplate().execute(new DataManager() {
			public void manageData() {
				/*Integer i = null;
				if(i == 1)*/
				System.out.println("第二个业务");
			}
		});
	}
}

interface DataManager{
        public void manageData();
}

class DataTemplate{
	public void execute(DataManager dm){
		try {
			dm.manageData();
		} catch (Exception e) {
			System.out.println("公共catch");
			e.printStackTrace();
		} finally {
			System.out.println("公共finally");
		}
	}
}
