package excepectionthrowex;
class BankAccount{
	private static int aids=0;
	private int nAccountId;
	private double dBalance;

	BankAccount(double dInitialBalance){
		dBalance=dInitialBalance;
		nAccountId =++aids;
	}
	public int Id(){
		return nAccountId;
	}
	public double Balance(){
		return dBalance;
	}
	public void Withdrawal(double dAmount) throws InsufficientFundsException {
		if(dBalance<dAmount) {
			throw new InsufficientFundsException(this, dAmount);
		}
		dBalance=dAmount;
	}
}