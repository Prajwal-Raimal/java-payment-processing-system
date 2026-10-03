package payment_processing_system;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer(101, "Prajwal", "prajwal@gmail.com", "9876543210");

		UPIPayment upiPayment = new UPIPayment(501, 1500.0, customer, "prajwal@upi");

		PaymentService paymentService = new PaymentService();

		System.out.println("===== CUSTOMER DETAILS =====");
		customer.displayCustomerDetials();

		System.out.println("\n===== PAYMENT PROCESSING =====");

		Transaction transaction = paymentService.processPayment(upiPayment);

		paymentService.showPaymentResult(upiPayment);

		System.out.println("\n===== PAYMENT DETAILS =====");
		upiPayment.displayPaymentDetils();

		System.out.println("\n===== TRANSACTION DETAILS =====");
		paymentService.showTransaction(transaction);
		
	}
}
