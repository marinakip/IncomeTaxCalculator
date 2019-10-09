package datamodel;

import java.util.ArrayList;

public abstract class Taxpayer {
	private String name;
	private int taxRegistrationNumber;
	private int income;
	private ArrayList<Receipt> receipts;
	private double basicTax;
	private double taxIncrease;
	
	public Taxpayer(String name, int taxRegistrationNumber, int income, ArrayList<Receipt> receipts){
		this.setName(name);
		this.setTaxRegistrationNumber(taxRegistrationNumber);
		this.setIncome(income);
		this.setReceipts(receipts);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTaxRegistrationNumber() {
		return taxRegistrationNumber;
	}

	public void setTaxRegistrationNumber(int taxRegistrationNumber) {
		this.taxRegistrationNumber = taxRegistrationNumber;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public ArrayList<Receipt> getReceipts() {
		return receipts;
	}

	public void setReceipts(ArrayList<Receipt> receipts) {
		this.receipts = receipts;
	}
	

	public double getBasicTax() {
		return basicTax;
	}

	public void setBasicTax(double basicTax) {
		this.basicTax = basicTax;
	}
	
	public double getTaxIncrease() {
		return taxIncrease;
	}

	public void setTaxIncrease(double taxIncrease) {
		this.taxIncrease = taxIncrease;
	}

	public abstract void computeBasicTax();
	
	public void computeTaxIncreaseOrDecrease(){
		int totalReceiptsAmount = computeTotalReceiptsGathered();
		
		if(totalReceiptsAmount >= getIncome() && totalReceiptsAmount <  0.20 * getIncome())
			setTaxIncrease(getBasicTax() + 0.05 * getBasicTax());
		else if(totalReceiptsAmount >=  0.20 * getIncome() && totalReceiptsAmount <  0.40 * getIncome())
			setTaxIncrease(getBasicTax() - 0.05 * getBasicTax());
		else if(totalReceiptsAmount >=  0.40 * getIncome() && totalReceiptsAmount <  0.60 * getIncome())
			setTaxIncrease(getBasicTax() - 0.10 * getBasicTax());
		else if(totalReceiptsAmount >=  0.60 * getIncome())
			setTaxIncrease(getBasicTax() - 0.15 * getBasicTax());
		
	}
	
	public int computeTotalReceiptsGathered(){
		ArrayList<Receipt> receipts = getReceipts();
		int totalReceiptsAmount = 0;
				
		for(int i = 0; i < receipts.size(); i++){
			totalReceiptsAmount += receipts.get(i).getAmount();
		}
		
		return totalReceiptsAmount;
	}

	
	
	
	
	
}
