package com.fastmart.vendorAppBackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "vendor_item")
@NoArgsConstructor
@Data
@Getter
@Setter
public class VendorItem {

	@Transient
	public final static String SEQUENCE_NAME = "vendor_item_seq";

	@Id
	@Indexed
	private long vendorItemId;

	private String itemName;

	private int itemPrice;

	private String itemCategory;

	private String itemSubCategory;

	private String itemManufacturer;

	private String sellingUnit;

	private int itemStock;

	private double itemRating;

	private int numRatings;

	private long vendorId;

	private String vendorName;

	private String date;

	public VendorItem(String itemName, int itemPrice, String itemCategory, String itemSubCategory,
			String itemManufacturer, String sellingUnit, int itemStock, double itemRating, int numRatings,
			long vendorId, String vendorName, String date) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemCategory = itemCategory;
		this.itemSubCategory = itemSubCategory;
		this.itemManufacturer = itemManufacturer;
		this.sellingUnit = sellingUnit;
		this.itemStock = itemStock;
		this.itemRating = itemRating;
		this.numRatings = numRatings;
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.date = date;
	}

	public long getVendorItemId() {
		return vendorItemId;
	}

	public void setVendorItemId(long vendorItemId) {
		this.vendorItemId = vendorItemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemSubCategory() {
		return itemSubCategory;
	}

	public void setItemSubCategory(String itemSubCategory) {
		this.itemSubCategory = itemSubCategory;
	}

	public String getItemManufacturer() {
		return itemManufacturer;
	}

	public void setItemManufacturer(String itemManufacturer) {
		this.itemManufacturer = itemManufacturer;
	}

	public int getItemStock() {
		return itemStock;
	}

	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

	public double getItemRating() {
		return itemRating;
	}

	public void setItemRating(double itemRating) {
		this.itemRating = itemRating;
	}

	public int getNumRatings() {
		return numRatings;
	}

	public void setNumRatings(int numRatings) {
		this.numRatings = numRatings;
	}

	public long getVendorId() {
		return vendorId;
	}

	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSellingUnit() {
		return sellingUnit;
	}

	public void setSellingUnit(String sellingUnit) {
		this.sellingUnit = sellingUnit;
	}

}
