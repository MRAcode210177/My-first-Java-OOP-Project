package Payment_Processing_System;

public class Transaction {

    public void execute(PaymentMethod method,double amount){
        System.out.println("\n--- Initiating Transaction ---");
        boolean success = method.processPayment(amount);

        if (success){
            System.out.println("FINAL STATUS: Payment of $%.2f completed via %s.\\n\", amount, method.getPaymentType()");
        }
        else {
            System.out.println("FINAL STATUS: Payment of $%.2f failed via %s. Please try again.\\n\", amount, method.getPaymentType()");
        }
    }
}
