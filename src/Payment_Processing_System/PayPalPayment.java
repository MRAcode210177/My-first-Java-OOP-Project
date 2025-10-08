package Payment_Processing_System;

public class PayPalPayment implements PaymentMethod{
    private String email;

    public PayPalPayment(String email){
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {
        if(amount % 2 == 0){
            System.out.println(" PayPal Payment Successful.");
            return true;
        }else {
            System.out.println("PayPal Payment Failed: Amount must be even for this simulation.");
            return false;
        }
    }

    @Override
    public String getPaymentType() {
        return "PayPal";
    }
}
