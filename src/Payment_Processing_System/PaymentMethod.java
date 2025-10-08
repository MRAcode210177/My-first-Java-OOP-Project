package Payment_Processing_System;

public interface PaymentMethod {

    public boolean processPayment(double amount);

    public String getPaymentType();
}
