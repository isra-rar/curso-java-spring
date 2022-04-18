package com.springweb.course.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.springweb.course.enums.OrderStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
    private Instant moment;
    
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @OneToMany(mappedBy = "id.order")
    private List<OrderItem> items = new ArrayList<>();

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    public Order(Integer id, Instant moment, OrderStatus orderStatus, User client) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public Double getTotal() {
        return items.stream()
        .map(x -> x.getPrice())
        .reduce(0.0, Double::sum);
    }
}