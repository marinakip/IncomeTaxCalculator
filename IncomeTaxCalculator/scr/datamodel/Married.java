package datamodel;

import java.util.ArrayList;

public class Married extends Taxpayer {

	public Married(String name, int taxRegistrationNumber, int income, ArrayList<Receipt> receipts) {
		super(name, taxRegistrationNumber, income, receipts);
	}

	@Override
	public void computeBasicTax() {
		if(getIncome() >= 0 && getIncome() < 36080)
			setBasicTax(0.0535 * getIncome());
		else if(getIncome() >= 36080 && getIncome() < 90000)
			setBasicTax(1930.28 + 0.0705 * (getIncome() - 36080));
		else if((getIncome() >= 90000 && getIncome() < 143350))
			setBasicTax(5731.64 + 0.0705 * (getIncome() - 90000));
		else if((getIncome() >= 143350 && getIncome() < 254240))
				setBasicTax(9492.82 + 0.0785 * (getIncome() - 143350));
		else if(getIncome() >= 254240)
			setBasicTax(18197.69 + 0.0985 * (getIncome()-254240));	
			
	}

}
