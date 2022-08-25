package Genrics1;

public class GenericsDemo<T> {
	
	T t;
	
public GenericsDemo(T ob)
{
	this.t = ob;
}

public void show()
{
	System.out.println("Class of this object is ");
	System.out.println(t.getClass().getTypeName());
}

}
