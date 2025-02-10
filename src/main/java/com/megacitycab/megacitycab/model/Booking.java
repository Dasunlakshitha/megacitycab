package com.megacitycab.megacitycab.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderNumber;
    private String destination;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
