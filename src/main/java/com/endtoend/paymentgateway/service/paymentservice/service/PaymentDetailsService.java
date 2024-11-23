package com.endtoend.paymentgateway.service.paymentservice.service;

import com.endtoend.paymentgateway.service.paymentservice.model.PaymentDetails;
import com.endtoend.paymentgateway.service.paymentservice.repository.PaymentDetailsRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentDetailsService {

    private final PaymentDetailsRepository paymentDetailsRepository;

    @Autowired
    public PaymentDetailsService(PaymentDetailsRepository paymentDetailsRepository) {
        this.paymentDetailsRepository = paymentDetailsRepository;
    }

    public PaymentDetails savePaymentDetails(PaymentDetails paymentDetails) {
        return paymentDetailsRepository.save(paymentDetails);
    }

    public List<PaymentDetails> getAllPaymentDetails() {
        return paymentDetailsRepository.findAll();
    }

    public Optional<PaymentDetails> getPaymentDetailsById(Long id) {
        return paymentDetailsRepository.findById(id);
    }

    public void deletePaymentDetailsById(Long id) {
        paymentDetailsRepository.deleteById(id);
    }
}
