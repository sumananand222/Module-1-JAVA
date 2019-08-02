package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.bean.*;

public class InvoiceRepoImpl implements InvoiceRepo {
	public static Map<Integer,Invoice> invoicemap=new HashMap<Integer,Invoice>();
	public int saveInvoice(Invoice bean) {
		invoicemap.put(bean.getId(),bean);
		return 1;
	}
}
