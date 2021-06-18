package packageA;
interface A{
	void a();
	void b();
	void c();
	void d();
}

abstract class N implements A{
	public void c() {
		System.out.println("I am in C");
	}
	public void a() {
		
	}
	public void b() {
		
	}

}

class M extends N{
	public void a()
	{
		System.out.println("I am in a");
	}
	public void d() {
		System.out.println("I am d");
	}
}
public class Interface  {
	public static void main(String args[]) {
		A a1=new M();
		a1.a();
		a1.b();
		a1.c();
		a1.d();
		
	}
	

}
