import java.util.Scanner;
public class DiceGame{
    public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("What is your name? ");
	String name =scanner.next();
	System.out.println("Hello,"+name+ "!");
	
	int SIDES =6;
	System.out.println("Rolling the dice...");
	int a = 1+ (int)(Math.random() * SIDES);
	System.out.println("Die 1: "+a);
	int b= 1+(int)(Math.random() * SIDES);
	System.out.println("Die 2: "+b);
	int sum=a+b;
	System.out.println("Total value: "+sum);
    }
}
