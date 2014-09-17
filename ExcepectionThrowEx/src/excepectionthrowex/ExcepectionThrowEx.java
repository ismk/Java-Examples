package excepectionthrowex;

import java.util.*;

public class ExcepectionThrowEx {
public static void main(String[] args) {
	try {
		BankAccount ba = new BankAccount(500.0);
		ba.Withdrawal(600.0);
		ba.Balance();
		System.out.println("Withdrawal successful");
	}
	catch (Exception e) {
		System.out.println(e.toString());

	}

    	   
}
}
