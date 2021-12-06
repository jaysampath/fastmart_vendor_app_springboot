package com.fastmart.vendorAppBackend.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.fastmart.vendorAppBackend.models.VendorItem;


@Repository
public class VendorItemDaoImpl implements VendorItemDao {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	Logger logger = LoggerFactory.getLogger(VendorItemDao.class);

	@Override
	public VendorItem addVendorItem(VendorItem vendorItem) {
		// TODO Auto-generated method stub
		//logger.info("inside dao impl");
		VendorItem newItem = mongoTemplate.save(vendorItem, "vendor_item");
		return newItem;
	}

	

	

	@Override
	public List<VendorItem> getVendorItems() {
		// TODO Auto-generated method stub
		Query query = new Query();
		List<VendorItem> vendorItems = mongoTemplate.find(query, VendorItem.class);
		return vendorItems;
	}
}
