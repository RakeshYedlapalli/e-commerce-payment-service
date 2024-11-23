package com.endtoend.paymentgateway.service.paymentservice.controller;

import com.endtoend.paymentgateway.service.paymentservice.model.PaymentDetails;
import com.endtoend.paymentgateway.service.paymentservice.request.PaymentDetailsRequest;
import com.endtoend.paymentgateway.service.paymentservice.request.Section;
import com.endtoend.paymentgateway.service.paymentservice.service.PaymentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/payment")
@CrossOrigin
public class PaymentDetailsController {


    private final PaymentDetailsService paymentDetailsService;

    @Autowired
    public PaymentDetailsController(PaymentDetailsService paymentDetailsService) {
        this.paymentDetailsService = paymentDetailsService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> savePaymentDetails(@RequestBody PaymentDetailsRequest request) {
        // Map PaymentDetailsRequest to PaymentDetails entity
        PaymentDetails paymentDetails = new PaymentDetails(
                request.getCardHolderName(),
                request.getCardNumber(),
                request.getCvv(),
                request.getExpiryDate()
        );

        // Save PaymentDetails using the service
        PaymentDetails savedPaymentDetails = paymentDetailsService.savePaymentDetails(paymentDetails);

        if (savedPaymentDetails != null) {
            return new ResponseEntity<>("Payment details saved successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Failed to save payment details", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/saveCreds")
    public ResponseEntity<String> saveeee(@RequestBody Section request) {
        // Map PaymentDetailsRequest to PaymentDetails entity
        return new ResponseEntity<>("dsajfsdfadfj", HttpStatus.OK);
//        System.out.println(request);
//        return null;
    }



}
