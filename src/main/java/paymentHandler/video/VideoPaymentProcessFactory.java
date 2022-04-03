package paymentHandler.video;

import model.OrderDetails;
import paymentHandler.PaymentProcessHandler;

public class VideoPaymentProcessFactory implements PaymentProcessHandler {
    @Override
    public void processPayment(OrderDetails orderDetails) {
        System.out.println("----Video Order Processing started-----");
        switch(orderDetails.getProductName()){
            case "Learning to Ski" :
                System.out.println("Add a free “First Aid” video to the packing slip" );
                break;
            default:
                System.out.println("No free video to the packing slip" );
        }

    }
}
