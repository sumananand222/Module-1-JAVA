package com.cg.service;

import com.cg.bean.Invoice;
import com.cg.dao.*;

public class InvoiceServiceImpl implements InvoiceService{
	InvoiceRepo dao= new InvoiceRepoImpl();
	public int calculateInvoice(Invoice bean) {
		return dao.saveInvoice(bean);
		
	}
}
