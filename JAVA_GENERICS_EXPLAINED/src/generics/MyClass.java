package generics;

public class MyClass <T, V>{
	T ob;
	V ob2;
	
	MyClass(T ob, V ob2) {
		this.ob = ob;
		this.ob2 = ob2;
		
	}
	
	void ShowType() {
		System.out.println(ob.getClass().getName());
		System.out.println(ob2.getClass().getName());
	}
	

}
