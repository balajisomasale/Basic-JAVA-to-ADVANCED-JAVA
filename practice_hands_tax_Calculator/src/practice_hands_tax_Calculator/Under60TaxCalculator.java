package practice_hands_tax_Calculator;

public class Under60TaxCalculator extends AbstractTaxCalculator {
	private static TaxSlab[] UNDER_60_TAX_SLABS = {
		new TaxSlab(0.0, 250000.0, 0),
		new TaxSlab(250000.0, 500000.0, 5),
		new TaxSlab(500000.0, 1000000.0, 20),
		new TaxSlab(1000000.0, Double.MAX_VALUE, 30)
	};
	
	public Under60TaxCalculator(double annualIncome) {
		super(annualIncome);
		this.taxSlabs = UNDER_60_TAX_SLABS;
	}
	
	
}