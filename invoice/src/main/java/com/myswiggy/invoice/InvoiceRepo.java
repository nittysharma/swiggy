package com.myswiggy.invoice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepo extends JpaRepository<InvoiceMaster, Integer> {
    InvoiceMaster findByOrderId(Integer orderId);
}
