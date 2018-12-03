package com.ramesh.model;

public class Product {
    public String productName;
    public int productId;
    public String description;
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Product(String productName, int productId, String description) {
        super();
        this.productName = productName;
        this.productId = productId;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Product [productName=" + productName + ", productId=" + productId + ", description=" + description
                + "]";
    }
}
