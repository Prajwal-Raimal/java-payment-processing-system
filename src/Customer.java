package payment_processing_system;

public class Customer {

	private int customerId;
	private String customerName;
	private String email;
	private String MobileNumber;

	Customer() {

	}

	Customer(int customerId, String customerName, String email, String mobileNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		MobileNumber = mobileNumber;
	}

	void displayCustomerDetials() {
		System.out.println("Customer ID           : " + customerId);
		System.out.println("Customer Name         : " + customerName);
		System.out.println("Email                 : " + email);
		System.out.println("Mobile Number         : " + MobileNumber);
	}

	void updateCustomerDetials() {
		System.out.println("Customer data updated");
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

}
