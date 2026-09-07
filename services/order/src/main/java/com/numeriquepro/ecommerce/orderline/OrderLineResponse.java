package com.numeriquepro.ecommerce.orderline;

public record OrderLineResponse(
        Integer id,
        double quantity
) { }