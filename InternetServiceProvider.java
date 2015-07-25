import java.util.Scanner;

// Zachery Smith
// Week 5 
// 7-12-15
// Problem 13
// InternetServiceProvider.java

public class InternetServiceProvider {

  public static void main (String[] args) {
  
    // Declare constants and variabls
    final double PACKAGE_A_FEE = 9.95;
    final double PACKAGE_B_FEE = 13.95;
    final double PACKAGE_C_FEE = 19.95;    
    final double PACKAGE_A_PER_HOUR = 2.00;
    final double PACKAGE_B_PER_HOUR = 1.00;
    
    char packageLetter;
    double hoursUsed;
    double billTotal;
    
    // Declare scanner for user input
    Scanner keyboard = new Scanner(System.in);
    
    // User input for package letter and hours used
    System.out.print("Enter your internet package A, B or C: ");
    packageLetter = keyboard.next().charAt(0);
    
    System.out.print("Enter the total internet hours used: ");
    hoursUsed = keyboard.nextDouble();    
    
    // Switch statement that calculates internet users bill
    switch (packageLetter) {
      
      case 'a': // Package A is 9.95 per month with 10 hours
      case 'A': // with each additional hour $2.00
        if (hoursUsed > 10) 
          billTotal = PACKAGE_A_FEE + (hoursUsed - 10) * PACKAGE_A_PER_HOUR;
        else
          billTotal = PACKAGE_A_FEE;
        
        System.out.printf("Your monthly internet bill is $%.2f for Package A.", billTotal);
        break;
        
      case 'b': // Pacakge B is $13.95 per month with 20 hours
      case 'B': // with each additional hour $1.00
        
        if (hoursUsed > 20) 
          billTotal = PACKAGE_B_FEE + (hoursUsed - 20) * PACKAGE_B_PER_HOUR;
        else
          billTotal = PACKAGE_B_FEE;
        
        System.out.printf("Your monthly internet bill is $%.2f for Package B.", billTotal);
        break;
        
      case 'c': // Package C is $19.95 per month with unlmited access
      case 'C':
      
      System.out.printf("Your monthly internet bill is $%.2f for Package C.", PACKAGE_C_FEE);
      break;
      
      default:
        System.out.print("Please enter your internet package code: " +
                         "A, B or C");
    }
    
  }
}