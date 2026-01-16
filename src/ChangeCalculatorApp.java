import java.util.Scanner;

/**
 * Application that calculates the minimum number of quarters, dimes, nickels,
 * and pennies needed for the specified number of cents returned in change
 * after using a $1 bill to pay for an item costing between 1 and 99 cents
 *
 * rbaig@email.uscb.edu
 * @version ICE for week of 12 Jan 2026
 */
public class ChangeCalculatorApp {
    /**
     * Main method for the app
     *
     * @param args
     */
    public static void main(String[] args) {
        /* display a welcome message */
        System.out.println("Welcome to the Change Calculator\n"); // note `\n` --> extra blank line

        /* create the Scanner object */
        Scanner sc = new Scanner( System.in );

        /* perform conversions UNTIL `choice` is NOT equal to "y" or "Y" */
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            
            /* INITIALIZATION PHASE (for current loop iteration) */
            
            /* get the number of cents from the user */
            System.out.print("Enter number of cents (0-99): ");
            int cents = sc.nextInt();  // get user input
            sc.nextLine();  // discard rest of line ("clears input buffer")
            System.out.println();  // blank line for readability

            /* PROCESSING PHASE (for current loop iteration) */
            
            /* calculate the number of (whole) quarters */
            int quarters = cents / 25;  // get number of WHOLE quarters
            cents %= 25  // assign the REMAINDER as new value of cents that REMAIN
                         // cents %= 25; --> cents = cents % 25;

            /* 
             * calculate the number of (whole) dimes 
             * (Remember: this is the number of dimes in the cents
             *  that REMAIN after you've accounted for the quarters above) 
             */
            int dimes = cents / 10;  // get number of WHOLE dimes
            cents %= 10;  // assign the remainder to the cents variable
                          // cents %= 10; --> cents = cents % 10;
            /* 
             * calculate the number of (whole) nickels
             * (and then the number of pennies will simply be equal to
             *  the number of cents that remain)
             */
              // get number of WHOLE nickels
              // get number of pennies

              
            /* ... PHASE (for current loop iteration) */
            
            /*
             * display the results using **formatted printing**
             * (Watch spacing inside your format strings, and 
             *  don't forget to include the newline character!)
             */
             
            
            System.out.println(); // blank line for readability

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
              // get user input
              // discard rest of line
              
            System.out.println(); // blank line for readability
            
        } // end while
    } // end method main
} // end class ChangeCalculatorApp
