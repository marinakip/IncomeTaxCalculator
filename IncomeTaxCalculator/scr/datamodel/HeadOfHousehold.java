package datamodel;

import java.util.ArrayList;

public class HeadOfHousehold extends Taxpayer {

	public HeadOfHousehold(String name, int taxRegistrationNumber, int income, ArrayList<Receipt> receipts) {
		super(name, taxRegistrationNumber, income, receipts);
	}

	@Override
	public void computeBasicTax() {
		if(getIncome()>=0 && getIncome()<30390)
			setBasicTax(0.0535 * getIncome());
		else if(getIncome()>=30390 && getIncome()<90000)
			setBasicTax(1625.87 + 0.0705 * (getIncome()-30390));
		else if((getIncome()>=90000 && getIncome()<122110))
			setBasicTax(5828.38 + 0.0705 * (getIncome()-90000));
		else if((getIncome()>=122110 && getIncome()<203390))
				setBasicTax(8092.13 + 0.0785 * (getIncome()-122110));
		else if(getIncome()>=203390)
			setBasicTax(14472.61 + 0.0985 * (getIncome()-203390));	
		
	}
}
