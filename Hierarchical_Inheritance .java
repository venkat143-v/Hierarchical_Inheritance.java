package Oops;
class Student2 // parent class
{
	int rn;
	String name;
	
	Student2(int rn, String name)// parent class constructor
	{
		this.rn = rn;
		this.name = name;		
	}
	
	void display1()
	{
		System.out.println("rollno = "+ rn);
		System.out.println("sname = "+ name);
	}
}

class Marks extends Student2 // child1 class
{
	int m1,m2;
	Marks(int rn, String name, int m1, int m2)
	{
		super(rn,name);
		this.m1 = m1;
		this.m2 = m2;
	}
	void display2()
	{
		System.out.println("marks1 = "+ m1);
		System.out.println("marks2 = "+ m2);
	}
}

class Marks2 extends Student2 // child2 class
{
	int m3,m4;
	Marks2(int rn, String name, int m3, int m4)
	{
		super(rn,name);
		this.m3 = m3;
		this.m4 = m4;
	}
	void display3()
	{
		System.out.println("marks3 = "+ m3);
		System.out.println("marks4 = "+ m4);
	}
}
public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		Marks obj = new Marks(11,"sai",67,87);
	    obj.display1();
		obj.display2();
		
		Marks2 obj2 = new Marks2(11,"sai",76,89);
		obj2.display1();
		obj2.display3();
	}

}