package com.testapp.billingservice.entities;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name = "fullOrder", types = Bill.class)
public interface FullOrderProjection {
    Long getId();

    Date getBillingDate();

    Long getCustomerId();

    List<ProductItem> getProductItems();
}
