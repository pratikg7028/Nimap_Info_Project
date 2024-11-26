package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false) // Foreign Key
    private Category category; // Many-to-One relationship
}
