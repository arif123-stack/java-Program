//program for enter a number. 
import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
       		 Scanner reader = new Scanner(System.in);
        	 System.out.print("Enter a number: ")
        	 int number = reader.nextInt();
        	System.out.println("You entered: " + number);
    }
}
//program of additions
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

//program of even and prime number
public class Main {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
public class AsciiValue {

    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
//programs of
