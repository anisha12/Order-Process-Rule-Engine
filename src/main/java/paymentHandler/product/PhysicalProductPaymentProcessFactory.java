package paymentHandler.product;

import model.OrderDetails;
import paymentHandler.PaymentProcessHandler;

public class PhysicalProductPaymentProcessFactory extends ProductPaymentProcessFactory implements PaymentProcessHandler {


    @Override
    public void processPayment(OrderDetails orderDetails) {
        generateCommissionPaymentToAgent();

        System.out.println("Packing slip for shipping Generated");
    }
}
