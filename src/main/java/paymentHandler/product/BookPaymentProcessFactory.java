package paymentHandler.product;

import model.OrderDetails;
import paymentHandler.PaymentProcessHandler;

public class BookPaymentProcessFactory extends ProductPaymentProcessFactory implements PaymentProcessHandler {
    @Override
    public void processPayment(OrderDetails orderDetails) {
        generateCommissionPaymentToAgent();
        System.out.println("Duplicate packing slip for the royalty department created");
    }
}
