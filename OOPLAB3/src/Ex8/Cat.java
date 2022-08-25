package Ex8;

public class Cat extends Pet {
    private int livesLeft;
    public Cat(String name, String owner, int age,
                        int l) {
         super(name, owner, age);
         this.livesLeft = livesLeft;
    }
    
    public void getDetails() {
    	super.showDetails();
    	System.out.println("I am a cat. " + this.livesLeft + " Lives remain for me");
    }
    
    public Cat(String name, String owner) {
    	super(name, owner);
    }
    
    
}//end of the pet class
