import java.util.Scanner;
/**
 * this program will show which of the integers that the user entered is the biggest one 
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner (System.in);

    // declare a variable to store the first integer
    System.out.println("Please enter an integer.");
    //prompt the user for the first integer 
    int first_integer = input.nextInt();
    System.out.println("Please enter another integer.");
    //declare a variable to store second_integer
    //prompt the user for the second integer
    int second_integer = input.nextInt();
    // define the biggest number
    if( second_integer > first_integer){
      System.out.println ("The biggest number is " + second_integer + ".") ;
      
    }else{ 
    // tell the user the biggest number is the first one
   System.out.println ("The biggest number is " + first_integer + ".");
   }



    

    
  }
}
