package org.yassine.order.kafka;



import org.yassine.order.customer.CustomerResponse;
import org.yassine.order.order.PaymentMethod;
import org.yassine.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
