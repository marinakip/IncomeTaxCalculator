package datamodel;

import java.util.ArrayList;

public class Single extends Taxpayer {

	public Single(String name, int taxRegistrationNumber, int income, ArrayList<Receipt> receipts) {
		super(name, taxRegistrationNumber, income, receipts);
	}

	@Override
	public void computeBasicTax() {
		if(getIncome()>=0 && getIncome()<24680)
			setBasicTax(0.0535 * getIncome());
		else if(getIncome()>=24680 && getIncome()<81080)
			setBasicTax(1320.38 + 0.0705 * (getIncome()-24680));
		else if((getIncome()>=81080 && getIncome()<90000))
			setBasicTax(5296.58 + 0.0705 * (getIncome()-81080));
		else if((getIncome()>=90000 && getIncome()<152540))
				setBasicTax(5996.80 + 0.0785 * (getIncome()-90000));
		else if(getIncome()>=152540)
			setBasicTax(10906.19 + 0.0985 * (getIncome()-152540));	
		
	}

}
