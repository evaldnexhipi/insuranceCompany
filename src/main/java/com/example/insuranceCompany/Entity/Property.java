package com.example.insuranceCompany.Entity;

import javax.persistence.*;

@Entity
@Table
public class Property {
    @Id
    @SequenceGenerator(
            name = "property_sequence",
            sequenceName = "property_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "property_sequence"
    )
    private Long id;
    @Column(nullable = false)
    private Double cost;
    @Column(nullable = false)
    private Double surface;
    @Column(columnDefinition = "VARCHAR(10) CHECK (type IN ('apartment','house','office','storage'))")
    private String type;
    @ManyToOne
    @JoinColumn(name="address_id",nullable = false)
    private Address address;

    public Property() {
    }

    public Property(Long id, Double cost, Double surface, String type, Address address) {
        this.id = id;
        this.cost = cost;
        this.surface = surface;
        this.type = type;
        this.address = address;
    }

    public Property(Double cost, Double surface, String type, Address address) {
        this.cost = cost;
        this.surface = surface;
        this.type = type;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
