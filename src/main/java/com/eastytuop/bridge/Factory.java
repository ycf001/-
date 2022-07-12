package com.eastytuop.bridge;

/**
 * @author beck.yang
 * @date 2022/7/11 18:26
 * @description
 */
public abstract class Factory {
	public void setProduct(Product product) {
		this.product = product;
	}

	private Product product;

	public Factory(Product product){
		this.product = product;
	}

	public void producer(){
		this.product.construct();
	}
}
