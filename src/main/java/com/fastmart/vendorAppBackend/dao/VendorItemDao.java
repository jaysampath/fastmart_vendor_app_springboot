package com.fastmart.vendorAppBackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fastmart.vendorAppBackend.models.VendorItem;

@Repository
public interface VendorItemDao {
	
	public VendorItem addVendorItem(VendorItem vendorItem);
	
	public List<VendorItem> getVendorItems();
	

}
