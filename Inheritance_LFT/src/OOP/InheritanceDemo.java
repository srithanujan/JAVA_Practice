package OOP;

class Employee {
	private String name;
	private double salary;
	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	Employee() {
		name = " ";
		salary = 0.0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void raiseSalary(double percent) {
		salary += salary*percent/100;
		
	}
	
}

class Manager extends Employee {
	double bonus;
	
	Manager(String name, double salary, double bonus){
		super(name, salary);
		this.bonus = bonus;
		
	}
	void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalary() {
		return super.getSalary() + bonus;
	}
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Ram", 35000);
		e1.raiseSalary(10);
		System.out.println(e1.getSalary());
		
		
		Manager m1 = new Manager("Sri", 23000.0, 0.0);
		System.out.println(m1.getSalary());

	}

}
