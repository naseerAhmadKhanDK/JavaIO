import java.util.Scanner; // Import the Scanner class

class AddClass {
  public static void main(String[] args){
    int x, y, sum;
    double m,d;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Please enter a number:");
    x = myObj.nextInt(); // Read user input

    System.out.println("please enter another number:");
    y = myObj.nextInt(); // Read user input

    sum = x + y;  // Calculate the sum of x + y
    System.out.println("Sum is: " + sum); // Print the sum

    //For Multiplication 
    System.out.println("Please enter a number:");
    x = myObj.nextInt(); // Read user input

    System.out.println("please enter another number:");
    y = myObj.nextInt(); // Read user input

    m = x * y;  // Calculate the multiplication of x + y
    System.out.println("Multiplication of  is: " + m); // Print the sum

    //for Division
    System.out.println("Please enter a number:");
    x = myObj.nextInt(); // Read user input

    System.out.println("please enter another number:");
    y = myObj.nextInt(); // Read user input

    d = x / y;  // Calculate the division of x + y
    System.out.println("Division of : " + d); // Print the sum


  }
} 