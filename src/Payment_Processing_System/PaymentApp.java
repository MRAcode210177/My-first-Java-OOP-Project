package Payment_Processing_System;

public class PaymentApp {
    public static void main(String[] args){
        Transaction t = new Transaction();

        //1.Successful Credit Card Transaction
        PaymentMethod card = new CreditCardPayment("1234567890123456");
        t.execute(card,550.00);


        // 2. Failed PayPal Transaction (Odd amount)
        PaymentMethod paypal = new PayPalPayment("user@example.com");
        t.execute(paypal, 105.99);

        // 3. Failed Credit Card Transaction (Amount too high)
        t.execute(card, 1200.00);
    }
}
