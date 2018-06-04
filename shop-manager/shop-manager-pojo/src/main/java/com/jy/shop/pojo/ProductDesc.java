package com.jy.shop.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_product_desc")
public class ProductDesc implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id// 对应product表中的id
	@Column(name = "id")
    private Long id;

	@Column(name = "product_desc")
    private String productDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }
}