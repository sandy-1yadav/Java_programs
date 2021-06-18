package packageA;

public class TestWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		Integer i1 = Integer.valueOf(x);
		System.out.println("primitive value "+ x +"Wrapper value"+ i1);
		//Autoboxing
		Integer i2=x;
		
		System.out.println(i2);

	
		Integer i3=new Integer(30);
		int y=i3.intValue();
		System.out.println(y);
		//Unboxing
		int z=i3;
		System.out.println(z);
	}

}
