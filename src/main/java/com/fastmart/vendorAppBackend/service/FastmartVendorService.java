package com.fastmart.vendorAppBackend.service;

import java.util.List;

import com.fastmart.vendorAppBackend.models.VendorItem;

public interface FastmartVendorService {
	
public VendorItem addVendorItem(VendorItem vendorItem);
	
	public List<VendorItem> getVendorItems();

}
