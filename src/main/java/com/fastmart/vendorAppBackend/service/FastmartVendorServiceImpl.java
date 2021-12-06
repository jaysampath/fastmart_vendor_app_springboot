package com.fastmart.vendorAppBackend.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fastmart.vendorAppBackend.dao.VendorItemDao;
import com.fastmart.vendorAppBackend.models.VendorItem;

@Service
@Transactional
public class FastmartVendorServiceImpl implements FastmartVendorService {
	
	@Autowired
	private VendorItemDao vendorItemDao;
	
    SimpleDateFormat sdf = new SimpleDateFormat();
	
	Logger logger = LoggerFactory.getLogger(FastmartVendorService.class);

	@Override
	public VendorItem addVendorItem(VendorItem vendorItem) {
		// TODO Auto-generated method stub
		//logger.info("inside service impl");
		vendorItem.setVendorItemId(SequenceGeneratorService.generateSequence(VendorItem.SEQUENCE_NAME));
		vendorItem.setDate(String.valueOf(sdf.format(System.currentTimeMillis())));
		VendorItem insertedItem = vendorItemDao.addVendorItem(vendorItem);
		return insertedItem;
	}


	@Override
	public List<VendorItem> getVendorItems() {
		// TODO Auto-generated method stub
		List<VendorItem> vendorItems = vendorItemDao.getVendorItems();
		return vendorItems;
	}

}
