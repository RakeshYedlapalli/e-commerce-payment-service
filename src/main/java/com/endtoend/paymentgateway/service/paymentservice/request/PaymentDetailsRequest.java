package com.endtoend.paymentgateway.service.paymentservice.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentDetailsRequest {

    private String cardHolderName;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

}
