import java.util.Scanner;

// Zachery Smith
// Week 5 
// 7-12-15
// Problem 16
// BookClubPoints.java

public class BookClubPoints {

  public static void main (String[] args) {
  
    // Declare variables
    int booksPurchased;
    
    // Declare scanner for user input
    Scanner keyboard = new Scanner(System.in);
       
    // Input from user on the number of books purchased this month
    System.out.print("Enter the number of books purchased this month: ");
    booksPurchased = keyboard.nextInt();
    
    // Switch statement to inform customer of award points earned
    // for the month based on user input.
    switch (booksPurchased) {
      case 0:
        System.out.print("You earned 0 award points this month.");
        break;
      case 1:
        System.out.print("You earned 5 award points this month.");
        break;
      case 2:
        System.out.print("You earned 15 award points this month.");
        break;
      case 3:
        System.out.print("You earned 30 award points this month.");
        break;
      default:
        System.out.print("You earned 60 award points this month.");
        
    } 
  }
}