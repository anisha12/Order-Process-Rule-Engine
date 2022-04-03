package paymentHandler.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class ProductPaymentProcessFactory {
    protected void generateCommissionPaymentToAgent(){
        System.out.println("-----Product/Book Order processing started-----");
        System.out.println("Commission Payment Generated to Agent");
    }
}
