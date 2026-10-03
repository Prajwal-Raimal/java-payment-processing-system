package payment_processing_system;

public class UPIPayment extends Payment {

	private String upiId;

	UPIPayment() {

	}

	UPIPayment(int paymentId, double amount, Customer customer, String upiId) {
		super(paymentId, amount, customer);
		this.upiId = upiId;
	}

	@Override
	void processPayment() {
		super.processPayment();
		System.out.println("UPI Payment Processing....");
		System.out.println("UPI Payment Successful");
		super.paymentStatus = "SUCCESS";
	}

	@Override
	void displayPaymentDetils() {
		super.displayPaymentDetils();
		System.out.println("UPI ID                     : " + upiId);
	}

	String getUpiID() {
		return upiId;
	}

	void setUpiID(String upiId) {
		this.upiId = upiId;
	}

}
