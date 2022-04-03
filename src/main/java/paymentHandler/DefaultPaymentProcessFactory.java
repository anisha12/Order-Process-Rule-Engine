package paymentHandler;

import model.OrderDetails;

public class DefaultPaymentProcessFactory implements PaymentProcessHandler{
    @Override
    public void processPayment(OrderDetails orderDetails) {
        //TODO
        System.out.println("Default Payment Process Handler.No Action Found");
    }
}
