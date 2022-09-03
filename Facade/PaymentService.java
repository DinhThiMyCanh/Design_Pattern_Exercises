package Facade;

public class PaymentService {
	public void paymentByPaypal() {
		System.out.println("Payment by Paypal");
	}
	public void paymentByCreditCard() {
		System.out.println("Payment by CreditCard");
	}
	public void paymentByEbankingAccount() {
		System.out.println("Payment by EbankingAccount");
	}
	public void paymentByCash() {
		System.out.println("Payment by Cash");
	}
}
