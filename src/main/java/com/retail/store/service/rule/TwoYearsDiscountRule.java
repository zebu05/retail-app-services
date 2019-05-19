package com.retail.store.service.rule;

import com.retail.store.dtos.CustomerDTO;

import java.time.LocalDateTime;

public class TwoYearsDiscountRule implements  DiscountRule
{
    @Override
    public Integer calculateCustomerDiscount(CustomerDTO customer)
    {
        return customer.getCreatedDate().isBefore(LocalDateTime.now().minusYears(2))?
                DiscountType.CUSTOMER_OVER_TWO_YEARS.getPercentage():ZERO_DISCOUNT;
    }
}
