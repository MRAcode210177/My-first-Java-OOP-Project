package Payment_Processing_System;

public class CreditCardPayment implements PaymentMethod{
    private String cardNumber;

    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.printf(" Attempting Credit Card payment (Card ending in: %s) for $%.2f...\n",
                cardNumber.substring(cardNumber.length() - 4), amount);

        //double amount1 = amount;
        if(amount < 1000.0){
            System.out.println(" Credit Card Payment Successful.");
            return true;
        }else {
            System.out.println(" Credit Card Payment Failed: Amount limit exceeded ($1000).");
            return false;
        }
    }

    @Override
    public String getPaymentType() {
        return "Credit Card";
    }
}
