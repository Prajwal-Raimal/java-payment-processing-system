package payment_processing_system;

public class Transaction {

	private String transactionId;
	private int paymentId;
	private double amount;
	private String paymentmethod;
	private String transactionDate;

	Transaction() {

	}

	Transaction(String transactionId, int paymentId, double amount, String paymentmethod, String transactionDate) {
		this.transactionId = transactionId;
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentmethod = paymentmethod;
		this.transactionDate = transactionDate;
	}

	void displayTransaction() {
		System.out.println("Tranaction ID                : " + transactionId);
		System.out.println("Payment ID                   : " + paymentId);
		System.out.println("Amount                       : " + amount);
		System.out.println("Payment Method               : " + paymentmethod);
		System.out.println("Transaction Date             : " + transactionDate);
	}

	String generateTransactionId() {
		return transactionId;
	}

	String getTransactionId() {
		return transactionId;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public double getAmount() {
		return amount;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

}
