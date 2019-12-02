package practice_hands_tax_Calculator;

public abstract class AbstractTaxCalculator {
	protected double annualIncome;
	protected TaxSlab[] taxSlabs;
	
	public AbstractTaxCalculator(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public double calculateTax() {
		double totalTax = 0.0;
		for (TaxSlab taxSlab : taxSlabs) {
			totalTax += taxSlab.calculateSlabTax(annualIncome);
		}
		return totalTax;
	}
	
}
