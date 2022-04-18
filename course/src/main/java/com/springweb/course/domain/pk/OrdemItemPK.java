package com.springweb.course.domain.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.springweb.course.domain.Order;
import com.springweb.course.domain.Product;

import lombok.Data;

@Data
@Embeddable
public class OrdemItemPK implements Serializable{

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    
    
}