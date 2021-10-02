import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
       		 Scanner reader = new Scanner(System.in);
        	 System.out.print("Enter a number: ")
        	 int number = reader.nextInt();
        	System.out.println("You entered: " + number);
    }
}

class Main {

  public static void main(String[] args) {
    
    System.out.println("Enter two numbers");
    int first = 10;
    int second = 20;
    
    System.out.println(first + " " + second);

    // add two numbers
    int sum = first + second;
    System.out.println("The sum is: " + sum);
  }
}
