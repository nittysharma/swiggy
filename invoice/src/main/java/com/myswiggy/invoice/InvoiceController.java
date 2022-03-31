package com.myswiggy.invoice;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;
    @Autowired
    ModelMapper modelMapper;
    @PostMapping("/invoice")
    InvoicePojo addInvoice(@RequestBody InvoicePojo invoicePojo){
        return convertToPojo(invoiceService.addInvoice(convertTOEntity(invoicePojo)));
    }
    @PutMapping("/invoice")
    InvoicePojo updateInvoice(@RequestBody InvoicePojo invoicePojo){
        return  convertToPojo(invoiceService.updateInvoice(convertTOEntity(invoicePojo)));
    }
    @GetMapping("/invoiceByorderId/{orderId}")
    InvoicePojo getInvoiceByOrderId(@PathVariable("orderId") Integer orderId){
        return convertToPojo(invoiceService.getInvoiceByOrderId(orderId));
    }
    @GetMapping("/invoicebyinvoiceId/{invoiceNo}")
    InvoicePojo getInvoiceByInvoiceNo(@PathVariable("invoiceNo") Integer invoiceNo){
        return convertToPojo(invoiceService.getInvoiceByInvoiceNo(invoiceNo));
    }

    @GetMapping("/invoice")
    List<InvoicePojo> getInvoices(){
        return  invoiceService.getInvoice().stream().map(this::convertToPojo).collect(Collectors.toList());
    }

    InvoicePojo convertToPojo(InvoiceMaster invoiceMaster){
        return modelMapper.map(invoiceMaster,InvoicePojo.class);
    }

    InvoiceMaster convertTOEntity(InvoicePojo invoicePojo){
        return modelMapper.map(invoicePojo,InvoiceMaster.class);
    }
}