package com.cg.dao;

import com.cg.bean.Invoice;

public interface InvoiceRepo {
	int saveInvoice(Invoice bean);
}
