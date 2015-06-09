package ModInvoice;


import java.text.NumberFormat;
import java.util.Scanner;

public class ModInvoiceApp
{
    public static void main(String[] args)
    {
    	
    	
    	
        // welcome the user to the program
        System.out.println("Weclome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);
        
        InvoiceAppMethod IAM = new InvoiceAppMethod();

        // initialize variables for invoice count, invoice total and discount total
       

        // perform invoice calculations until choice is equal to "n" or "N"
        String choice = "y";
        do
        {
            // get the input from the user
            System.out.print("Enter subtotal:   ");
            IAM.setSubtotal(sc.nextDouble());
          //  double subtotal = IAM.getSubtotal();
            // calculate the discount amount and total
            
           
            //assert(discountAmount<total ): "Discount can never be greater than total. ";
           // System.out.println("");

            // accumulate the invoice count and invoice total
            
            // display the discount percent, discount amount, and total
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String message = "Discount percent: " + currency.format(IAM.DiscountPercent()) + "\n"
                    + "Discount amount:  " + currency.format(IAM.DiscountAmount()) + "\n"
                    + "Invoice total:    " + currency.format(IAM.CalculateTotal()) + "\n";
            System.out.println(message);
         
           

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        while (!choice.equalsIgnoreCase("n"));

        // calculate and display invoice count, total, and average
      
        String message = "Number of invoices: " + IAM.InvoiceCount() + "\n"
                       + "Average invoice:    " + IAM.InvoiceTotal() / IAM.InvoiceCount() + "\n"
                       + "Average discount:   " + IAM.DiscountTotal() / IAM.InvoiceCount() + "\n";
        System.out.println(message);
        
       

    }
}