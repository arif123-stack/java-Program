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
    int first = 30;
    int second = 50;
    
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
//programs of the ASCII Value. 
public class AsciiValue {

    public static void main(String[] args) {

        char ch = 'A';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
public class Main {

  public static void main(String[] args) {

    // value a, b, and c
    double a = 2.3, b = 4, c = 5.6;
    double root1, root2;

    // calculate the determinant (b2 - 4ac)
    double determinant = b * b - 4 * a * c;

    // check if determinant is greater than 0
    if (determinant > 0) {

      // two real and distinct roots
      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    }

    // check if determinant is equal to 0
    else if (determinant == 0) {

      // two real and equal roots
      // determinant is equal to 0
      // so -b + 0 == -b
      root1 = root2 = -b / (2 * a);
      System.out.format("root1 = root2 = %.2f;", root1);
    }

    // if determinant is less than zero
    else {

      // roots are complex number and distinct
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    }
  }
}

ly if it is perfectly divisible by 400.

Example: Java Program to Check a Leap Year
public class Main {

  public static void main(String[] args) {

    // year to be checked
    int year = 1996;
    boolean leap = false;

    // if the year is divided by 4
    if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      // if the year is not century
      else
        leap = true;
    }
    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}

public class PositiveNegative {

    public static void main(String[] args) {

        double number = 12.3;

        // true if number is less than 0
        if (number < 0.0)
            System.out.println(number + " is a negative number.");

        // true if number is greater than 0
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");

        // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0.");
    }
}

public class Alphabet {

    public static void main(String[] args) {

        char c = '*';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}
public class SumNatural {

    public static void main(String[] args) {

        int num = 100, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
public class Main {

  public static void main(String[] args) {

    // year to be checked
    int year = 1996;
    boolean leap = false;

    // if the year is divided by 4
    if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      // if the year is not century
      else
        leap = true;
    }
    
    else
      leap = false;

public class Factorial {

    public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
public class MultiplicationTable {

    public static void main(String[] args) {

        int num = 5;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
//program
class Main {
  public static void main(String[] args) {

    int n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
