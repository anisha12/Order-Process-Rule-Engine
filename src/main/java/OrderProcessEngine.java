import model.OrderDetails;
import model.OrderType;
import paymentHandler.PaymentProcessHandler;

import java.util.Scanner;

public class OrderProcessEngine {
    public static void main(String[] args) {
        //User Input feature  for orderDetails

 /*       Scanner input = new Scanner(System.in);
        String orderType = input.nextLine();
        String productName = input.nextLine();
        OrderDetails orderDetails = OrderDetails.builder().orderType(OrderType.valueOf(orderType))
                                                        .productName(productName).build();
        PaymentProcessHandler paymentHandler = paymentHandlerFactory.createPaymentHandler(orderDetails);

                                                        */
        //Test Data SetUp
        OrderDetails bookOrderDetails = OrderDetails.builder().orderType(OrderType.BOOK).productName("BOOK1").build();
        OrderDetails physicalProductOrderDetails = OrderDetails.builder().orderType(OrderType.PHYSICAL_PRODUCT).productName("PRODCT1").build();
        OrderDetails addMemberShip = OrderDetails.builder().orderType(OrderType.NEW_MEMBERSHIP).productName("NEW").build();
        OrderDetails upgradeMemberShip = OrderDetails.builder().orderType(OrderType.UPGRADE_MEMBERSHIP).productName("UPGRADE").build();
        OrderDetails videoOrderDetails = OrderDetails.builder().orderType(OrderType.VIDEO)
                .productName("Learning to Ski").build();

      PaymentHandlerFactory.createPaymentHandler(bookOrderDetails).processPayment(bookOrderDetails);
      PaymentHandlerFactory.createPaymentHandler(physicalProductOrderDetails).processPayment(physicalProductOrderDetails);
      PaymentHandlerFactory.createPaymentHandler(addMemberShip).processPayment(addMemberShip);
      PaymentHandlerFactory.createPaymentHandler(upgradeMemberShip).processPayment(upgradeMemberShip);
      PaymentHandlerFactory.createPaymentHandler(videoOrderDetails).processPayment(videoOrderDetails);
    }
}
