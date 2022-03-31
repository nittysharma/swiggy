package com.myswiggy.invoice;

import org.springframework.stereotype.Service;

import java.util.List;

public interface InvoiceService {
   InvoiceMaster addInvoice(InvoiceMaster invoiceMaster);
   InvoiceMaster updateInvoice(InvoiceMaster invoiceMaster);
   InvoiceMaster getInvoiceByOrderId(Integer orderId);
   InvoiceMaster getInvoiceByInvoiceNo(Integer invoiceNo);

   List<InvoiceMaster> getInvoice();
}
