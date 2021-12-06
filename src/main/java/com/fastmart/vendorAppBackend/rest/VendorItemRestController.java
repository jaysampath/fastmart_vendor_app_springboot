package com.fastmart.vendorAppBackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fastmart.vendorAppBackend.models.VendorItem;
import com.fastmart.vendorAppBackend.service.FastmartVendorService;

@RestController
@CrossOrigin
@RequestMapping("/vendorItems")
public class VendorItemRestController {
	
	@Autowired
	private FastmartVendorService fastmartVendorService;
	
	@GetMapping("/items")
	public List<VendorItem> getVendorItems(){
		List<VendorItem> vendorItems = fastmartVendorService.getVendorItems();
		return vendorItems;
	}
	
	
	@PostMapping("/add")
	public VendorItem addNewVendorItem(@RequestBody VendorItem vendorItem) {
		VendorItem newItem = fastmartVendorService.addVendorItem(vendorItem);
		return newItem;
	}
	
	
	
}
