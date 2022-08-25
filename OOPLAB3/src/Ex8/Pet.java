package Ex8;

public class Pet {
	
	private String name;
    private String owner;
    private int age;
    
    public Pet(String name, String owner, int age) {
         this.name = name;
         this.owner = owner;
         this.age = age;
    } 
    public void showDetails(){
         System.out.println("I am a pet. My name is "
            +this.name+". My owner is "+this.owner);
    }
    
    public Pet(String name, String owner) {
    	this.name = name;
    	this.owner = owner;
    }
    

}
