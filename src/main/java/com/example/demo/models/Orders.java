package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    private Integer productId;
//    private Integer consumerId;
    private Integer quantity;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;
    @ManyToOne
    @JoinColumn(name = "consumer_id")
    private Consumers consumer;
}
