package payment_processing_system;

public class CashPayment extends Payment {

	private double cashReceived;

	CashPayment() {

	}

	CashPayment(int paymentId, double amount, Customer customer, double cashReceived) {
		super(paymentId, amount, customer);
		this.cashReceived = cashReceived;
	}

	@Override
	void processPayment() {
		super.processPayment();
		if (cashReceived >= amount) {
			System.out.println("Payment Successful");
			super.paymentStatus = "SUCCESS";
		} else {
			System.out.println("Payment Failed");
			super.paymentStatus = "FAILED";
		}
	}

	double calculateChange() {
		double change = cashReceived - amount;
		return change;
	}

	@Override
	void displayPaymentDetils() {
		super.displayPaymentDetils();
		System.out.println("Cash Received          : " + cashReceived);
		System.out.println("Change                 : " + this.calculateChange());
	}

	double getCashReceived() {
		return cashReceived;
	}

	void setCashReceived(double cashReceived) {
		this.cashReceived = cashReceived;
	}

}
