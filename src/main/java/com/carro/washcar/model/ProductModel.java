package com.carro.washcar.model;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "product")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    private String nameProduct;
    private Double quantity;
    private BigDecimal productCost;
    private Double supplyPoint;
    private String typeStorage;
    private String dueDate;


    public ProductModel(Long idProduct, String nameProduct, Double quantity, BigDecimal productCost, Double supplyPoint, String typeStorage, String dueDate) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.productCost = productCost;
        this.supplyPoint = supplyPoint;
        this.typeStorage = typeStorage;
        this.dueDate = dueDate;
    }

    public Long getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getQuantity() {
        return quantity;
    }
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getProductCost() {
        return productCost;
    }
    public void setProductCost(BigDecimal productCost) {
        this.productCost = productCost;
    }

    public Double getSupplyPoint() {
        return supplyPoint;
    }
    public void setSupplyPoint(Double supplyPoint) {
        this.supplyPoint = supplyPoint;
    }

    public String getTypeStorage() {
        return typeStorage;
    }
    public void setTypeStorage(String typeStorage) {
        this.typeStorage = typeStorage;
    }

    public String getDueDate() {
        return dueDate;
    }
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
