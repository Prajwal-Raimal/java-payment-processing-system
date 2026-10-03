package payment_processing_system;

public class PaymentService {

	Transaction transaction;

	public Transaction processPayment(Payment payment) {
		payment.processPayment();

		if (payment.getPaymentStatus().equals("SUCCESS")) {
			String paymentMethod;

			if (payment instanceof UPIPayment) {
				paymentMethod = "UPI";
			} else if (payment instanceof CardPayment) {
				paymentMethod = "Card";
			} else if (payment instanceof CashPayment) {
				paymentMethod = "Cash";
			} else {
				paymentMethod = "UNKnown";
			}

			transaction = new Transaction("TXN1001", payment.getPaymentId(), payment.getAmount(), paymentMethod,
					"03-10-2026");
			return transaction;
		}
		return null;
	}

	void showTransaction(Transaction transaction) {
		if (transaction != null) {
			transaction.displayTransaction();
		} else {
			System.out.println("Transaction was not created");
		}
	}

	void showPaymentResult(Payment payment) {
		System.out.println("Payment Status     : " + payment.getPaymentStatus());
	}
}
