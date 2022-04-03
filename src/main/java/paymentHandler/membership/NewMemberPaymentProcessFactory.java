package paymentHandler.membership;

import model.OrderDetails;
import paymentHandler.PaymentProcessHandler;
import paymentHandler.product.ProductPaymentProcessFactory;

public class NewMemberPaymentProcessFactory  extends MembershipPaymentProcessFactory implements PaymentProcessHandler {

    @Override
    public void processPayment(OrderDetails orderDetails) {
        notifyOwner(orderDetails);
        System.out.println("Activate new member");
    }
}
