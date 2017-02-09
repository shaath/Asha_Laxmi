package day8;

import methods.BasicMethodsEg;

public class ResuseEg {

	public static void main(String[] args) 
	{
		BasicMethodsEg b=new BasicMethodsEg();
		int res=b.sum(40, 60);
		System.out.println(res);

		b.function1();
	}

}
