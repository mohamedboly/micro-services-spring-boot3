package com.numeriquepro.ecommerce.kafka;

import com.numeriquepro.ecommerce.customer.CustomerResponse;
import com.numeriquepro.ecommerce.order.PaymentMethod;
import com.numeriquepro.ecommerce.product.PurchaseResponse;

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