package paymentHandler.membership;

import model.OrderDetails;

public abstract class MembershipPaymentProcessFactory {

    public void notifyOwner(OrderDetails orderDetails){
        System.out.println("----Membership Order Processing started----");
        System.out.println(" Email the owner .The membership type is "+orderDetails.getProductName());
    }
}
