package services;

public class UsaInterestService2 implements InterestService {
	
	double interestRate;
	
	public UsaInterestService2() {		
	}

	public UsaInterestService2(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	
}
