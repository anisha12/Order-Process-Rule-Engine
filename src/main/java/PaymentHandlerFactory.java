import model.OrderDetails;
import model.OrderType;
import paymentHandler.DefaultPaymentProcessFactory;
import paymentHandler.PaymentProcessHandler;
import paymentHandler.membership.NewMemberPaymentProcessFactory;
import paymentHandler.membership.UpgradeMemberPaymentProcessFactory;
import paymentHandler.product.BookPaymentProcessFactory;
import paymentHandler.product.PhysicalProductPaymentProcessFactory;
import paymentHandler.video.VideoPaymentProcessFactory;


public class PaymentHandlerFactory {


    public static  PaymentProcessHandler createPaymentHandler(OrderDetails orderDetails) {
        if (orderDetails == null ) {
            return null;
        }
        PaymentProcessHandler paymentProcessHandler = null;
        switch (orderDetails.getOrderType().name()) {

            case "PHYSICAL_PRODUCT":
                paymentProcessHandler =  new PhysicalProductPaymentProcessFactory();
                break;
            case "BOOK":
                paymentProcessHandler =  new BookPaymentProcessFactory();
                break;
            case "NEW_MEMBERSHIP":
                paymentProcessHandler = new NewMemberPaymentProcessFactory();
                break;
            case "UPGRADE_MEMBERSHIP":
                paymentProcessHandler = new UpgradeMemberPaymentProcessFactory();
                break;
            case "VIDEO":
                paymentProcessHandler =  new VideoPaymentProcessFactory();
                break;
            default:
                paymentProcessHandler = new DefaultPaymentProcessFactory();

        }
        return paymentProcessHandler ;
    }
}
