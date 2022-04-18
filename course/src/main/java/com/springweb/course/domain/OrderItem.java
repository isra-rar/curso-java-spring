package com.springweb.course.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springweb.course.domain.pk.OrdemItemPK;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

    @EmbeddedId
    private OrdemItemPK id = new OrdemItemPK();

    private Integer quatity;
    private Double price;

    public OrderItem(Order order, Product product, Integer quatity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quatity = quatity;
        this.price = price;
    }

    public Double getSubTotal() {
        return price * quatity;
    }

    @JsonIgnore
    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product order) {
        id.setProduct(order);
    }

    public Integer getQuatity() {
        return quatity;
    }

    public void setQuatity(Integer quatity) {
        this.quatity = quatity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}