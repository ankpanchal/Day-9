//Ankur Panchal//
package ModInvoice;

public class InvoiceAppMethod {
	private double discountPercent;
	private double discountAmount;
	private double totalBeforeTax;
	private double salesTax;
	private double subtotal;
	private int invoiceCount;
	private double discountTotal;
	private double invoiceTotal;
	private double total;
	
	private final double Sales_Tax_Percent = 0.2;
	
	
	public double getSubtotal() {
		System.out.println(subtotal);
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public double getTotalBeforeTax() {
		return totalBeforeTax;
	}
	public void setTotalBeforeTax(double totalBeforeTax) {
		this.totalBeforeTax = totalBeforeTax;
	}
	public double getSalesTax() {
		return salesTax;
	}
	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}
	
	
	public double DiscountAmount()
	{
		discountAmount = subtotal * discountPercent;
		return discountAmount;
	}
		
	
	public double CalculateTotal()
	{
		double total = subtotal - discountAmount;
				          
		return total;
	}
	
	public double DiscountPercent()
	{
		if(discountPercent>=0.0 && discountPercent<=0.25)
		
		{if (subtotal >= 500)
	        discountPercent = .25;
	    else if (subtotal >= 200)
	        discountPercent = .2;
	    else if (subtotal >= 100)
	        discountPercent = .1;
	    else
	        discountPercent = 0.0;
		
		}return discountPercent;
	}
	
	public int InvoiceCount()
	{
		if(invoiceCount>=0 && invoiceCount<=10000)
			invoiceCount = invoiceCount + 1;
		return invoiceCount;
	}
			
	public double DiscountTotal()
	{
		discountTotal = discountTotal + discountAmount;
		return discountTotal;
	}
	
	public double InvoiceTotal()
	{
		invoiceTotal = invoiceTotal + total;
		return invoiceTotal;
	}
	
	
	
}

