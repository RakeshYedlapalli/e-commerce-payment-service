package com.endtoend.paymentgateway.service.paymentservice.repository;

import com.endtoend.paymentgateway.service.paymentservice.model.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, Long> {
}
