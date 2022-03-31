package com.myswiggy.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService{
    @Autowired
    InvoiceRepo invoiceRepo;

    @Override
    @Transactional
    public InvoiceMaster addInvoice(InvoiceMaster invoiceMaster) {
        return invoiceRepo.save(invoiceMaster);
    }

    @Override
    public InvoiceMaster updateInvoice(InvoiceMaster invoiceMaster) {
        return invoiceRepo.save(invoiceMaster);
    }

    @Override
    public InvoiceMaster getInvoiceByOrderId(Integer orderId) {
        return invoiceRepo.findByOrderId(orderId);
    }

    @Override
    public InvoiceMaster getInvoiceByInvoiceNo(Integer invoiceNo) {
        return invoiceRepo.getById(invoiceNo);
    }

    @Override
    public List<InvoiceMaster> getInvoice() {
        return this.invoiceRepo.findAll();
    }
}
