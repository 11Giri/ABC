package com.abc;

// Static is 
public class StaticExam {
	static int index;
	int nonStaticindex;
	static {
		index = 1000;
	}

	void test() {
		this.nonStaticindex++;
		nonStaticindex=5;
		System.out.println("Test");
//	StaticExam.call();
	}

	static void call() {
//	StaticExam example=new StaticExam();
//	example.test();
		index++;
		System.out.println("static block");
	}

	public static void main(String[] args) {
		StaticExam example1 = new StaticExam();
		example1.test();
		call();
		System.out.println(StaticExam.index);
		System.out.println(example1.nonStaticindex);
	}
}
