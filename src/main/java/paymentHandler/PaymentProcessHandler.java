package paymentHandler;

import model.OrderDetails;

public interface PaymentProcessHandler {
    public void processPayment(OrderDetails orderDetails);
}
