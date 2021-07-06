public class DiceGame{
    public static void main(String[] args){

	int SIDES =6;
	System.out.println("Rolling the dice...");
	int a = 1+ (int)(Math.random() * SIDES);
	System.out.println("Die 1: "+a);
	int b= 1+(int)(Math.random() * SIDES);
	System.out.println("Die 2: "+b);
	int sum=a+b;
	System.out.println("Total value: "+sum);

	
	if(sum>7){
	    System.out.println("You won!");
	}else{
	    System.out.println("You lost!");
	}
    }
}
