package payment_processing_system;

public class CardPayment extends Payment {

	private String cardNumber;
	private String cardHolderName;

	CardPayment() {

	}

	CardPayment(int paymentId, double amount, Customer customer, String cardNumber, String cardHolderName) {
		super(paymentId, amount, customer);
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
	}

	@Override
	void processPayment() {
		super.processPayment();
		System.out.println("Card Payment Processing....");
		System.out.println("Card Payment Successful");
		super.paymentStatus = "SUCCESS";
	}

	@Override
	void displayPaymentDetils() {
		super.displayPaymentDetils();
		System.out.println("Card Holder Name       : " + cardNumber);
		System.out.println("Card Number            : " + cardHolderName);
	}

	String getCardNumber() {
		return cardNumber;
	}

	void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	String getCardHolderName() {
		return cardHolderName;
	}

	void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

}
