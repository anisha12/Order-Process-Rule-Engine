package paymentHandler.membership;

import model.OrderDetails;
import paymentHandler.PaymentProcessHandler;

public class UpgradeMemberPaymentProcessFactory extends MembershipPaymentProcessFactory implements PaymentProcessHandler {
    @Override
    public void processPayment(OrderDetails orderDetails) {

        notifyOwner(orderDetails);
        System.out.println("Apply Upgrade");
    }
}
