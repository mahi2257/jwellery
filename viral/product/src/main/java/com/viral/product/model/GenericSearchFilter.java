package com.viral.product.model;

public class GenericSearchFilter {
	
	private float priceFrom;
	
	private float priceTo;
	
	private String model;
	
	private String type;
	
	private String regional;
	
	private String purpose;
	
	private String service;

	public float getPriceFrom() {
		return priceFrom;
	}

	public void setPriceFrom(float priceFrom) {
		this.priceFrom = priceFrom;
	}

	public float getPriceTo() {
		return priceTo;
	}

	public void setPriceTo(float priceTo) {
		this.priceTo = priceTo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
	
}
