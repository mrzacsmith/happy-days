import java.util.Scanner;

// Zachery Smith
// Week 5 
// 7-12-15
// LetterGrade.java

public class LetterGrade {
  
  public static void main (String[] args) {
  
    // Declare constants and variables
    String input;
    char letterGrade;
    final double GRADE_A = 4.0;
    final double GRADE_B = 3.0;
    final double GRADE_C = 2.0;
    final double GRADE_D = 1.0;
    final double GRADE_F = 0.0;
    
    // Declare scanner for user input
    Scanner keyboard = new Scanner(System.in);
    
    // Input letter grade from user
    System.out.print("Enter your letter grade: ");
    input = keyboard.nextLine();
    
    // Change string to char
    letterGrade = input.charAt(0);
    
    // Switch statement returning numeric equailivant to letter grade
    switch (letterGrade) {
      case 'a':
      case 'A':
        System.out.printf("You have a %.1f GPA.", GRADE_A);
        break;
      case 'b':
      case 'B':
        System.out.printf("You have a %.1f GPA.", GRADE_B);
        break;
      case 'c':
      case 'C':
        System.out.printf("You have a %.1f GPA.", GRADE_C);
        break;
      case 'd':
      case 'D':
        System.out.printf("You have a %.1f GPA.", GRADE_D);
        break;
      case 'f':
      case 'F':
        System.out.printf("You have a %.1f GPA.", GRADE_F);
        break;
      default:
        System.out.print("Incorrect entry! You must enter an " +
                         "A, B, C, D, F.");
    }
  }
}