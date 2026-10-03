package payment_processing_system;

public class Payment {

	protected int paymentId;
	protected double amount;
	protected String paymentStatus;
	protected Customer customer;

	Payment() {

	}

	Payment(int paymentId, double amount, Customer customer) {
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentStatus = "PENDING";
		this.customer = customer;
	}

	void processPayment() {
		System.out.println("Payment Processing");
	}

	void displayPaymentDetils() {
		System.out.println("Payment ID                 : " + paymentId);
		System.out.println("Amount                     : " + amount);
		System.out.println("Status                     : " + paymentStatus);
		System.out.println("Customer                   : " + customer.getCustomerName());
	}

	public int getPaymentId() {
		return paymentId;
	}

	public double getAmount() {
		return amount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
