import java.util.Scanner;

// Zachery Smith
// Week 5 
// 7-12-15
// ResistorValue.java;

public class ResistorValue {

  public static void main (String[] args) {
  
    // Declare constants and variabels
    String toleranceColor; 
    char toleranceC;
    double resistorValue;
    double max, min;
       
    
    // Declare scanner for user input
    Scanner keyboard = new Scanner(System.in);
    
    // Input from user for 3 band resistor value and tolerance color 
    System.out.print("Enter the resistor color: \n" +
                     "\t(G or Gold), (S or Silver), (N or None) ");
    
           // Take first letter of input for swtich
           toleranceColor = keyboard.nextLine();     
           toleranceC = toleranceColor.charAt(0); 
    
    System.out.print("Enter the resistor value: ");
    resistorValue = keyboard.nextDouble();

    System.out.println(toleranceC);
    System.out.println(resistorValue);
    // Switch statement to return resistor value and max/min
    switch (toleranceC) {
      
      case 'g':
      case 'G':
        max = resistorValue * 1.05;
        min = resistorValue * 0.95;
        System.out.printf("Your Gold resistor value is %.0f, with a max value %.0f\n" +
                          "and a min value of %.0f.", resistorValue, max, min);
        break;
      case 's':
      case 'S':
        max = resistorValue * 1.10;
        min = resistorValue * 0.90;
        System.out.printf("Your Silver resistor value is %.0f, with a max value %.0f\n" +
                          "and a min value of %.0f.", resistorValue, max, min);
        break; 
        
      case 'n':
      case 'N':
        max = resistorValue * 1.20;
        min = resistorValue * 0.80;
        System.out.printf("Your None resistor value is %.0f, with a max value %.0f\n" +
                          "and a min value of %.0f.", resistorValue, max, min);
        break;
        
      default:
        System.out.print("Invalid input!");       
    }
  }
}

