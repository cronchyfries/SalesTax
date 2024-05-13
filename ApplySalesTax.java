/*
 Kalena Abrahim
 2/2/24
 Apply Sales Tax
 */
 
import java.util.Scanner;

public class ApplySalesTax {
    public static void main(String[] args) {
        doTheThing();    
    }
  
    public static void doTheThing() {
        // Instantiate a Scanner to take input from the user.
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a price.
        System.out.print("Enter the retail price of an item.\n");
        double retailPrice = scanner.nextDouble();
        
        // Prompt the user for a tax rate.
        System.out.print("Enter the tax rate (as a percentage).\n");
        double taxRate = scanner.nextDouble() / 100; // Converts percentage to decimal
        
        // Compute and print the total cost of the item.
        System.out.println("\nAn item with a retail price of $" + retailPrice + " and taxed at " + 
                           formatTaxRate(taxRate * 100) + "%\nwill cost the consumer $" + 
                           (retailPrice + retailPrice * taxRate) + ".");
    }
  
    // Function to format the tax rate (had continuous errors w/o it)
    private static String formatTaxRate(double taxRate) {
        return (taxRate % 1 == 0) ? String.format("%.1f", taxRate) : String.format("%.2f", taxRate);
    }
}

// =============== LAB SUMMARY ===============

/*
1. How much time was required to complete this assignment?

It took me a couple of hours actually. 

2. What was the hardest part of this lab?

I think the hardest part was crafting out the final print statement. Due to all the components 
needed to output the final sentence, making sure it was correctly formatted was crucial. I continued
to get an error with the second CodeGrade test, showing that the 7.25% was not staying true.
So, I ended up needed to make a private String to ensure that the format of the percentage
stays.

3. What will you always remember (never forget) from this exercise?

To always see the exercise for what it is, and to not overcomplicate it.

*/
