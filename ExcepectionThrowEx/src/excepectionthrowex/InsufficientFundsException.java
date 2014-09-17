package excepectionthrowex;
class InsufficientFundsException extends Exception{
	private BankAccount ba;
	private double dWithdrawalAmount;
	InsufficientFundsException(BankAccount ba, double dAmount) {
		super("Insufficient funds in the account");
		this.ba=ba;
		dWithdrawalAmount=dAmount;
	}

	public String toString(){
		StringBuffer sb=new StringBuffer();
		sb.append("Insufficient funds in account\n");
		sb.append("Account Id is " +ba.Id());
		sb.append("\nBalance was " + ba.Balance());
		sb.append("\nWithdrawal was "+ dWithdrawalAmount);
		return sb.toString();
	}

}