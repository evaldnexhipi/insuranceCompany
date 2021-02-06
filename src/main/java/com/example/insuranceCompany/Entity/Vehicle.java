package com.example.insuranceCompany.Entity;

import javax.persistence.*;

@Entity
@Table
public class Vehicle {
    @Id
    @SequenceGenerator(
            name = "vehicle_sequence",
            sequenceName = "vehicle_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "vehicle_sequence"
    )
    private Long id;
    private String model;
    private String plate;
    private String color;
    private Integer year;
    private Integer seats;

    @OneToOne(mappedBy = "vehicle")
    private VehicleAccident vehicleAccident;

    public Vehicle() {
    }

    public Vehicle(Long id, String model, String plate, String color, Integer year, Integer seats) {
        this.id = id;
        this.model = model;
        this.plate = plate;
        this.color = color;
        this.year = year;
        this.seats = seats;
    }

    public Vehicle(String model, String plate, String color, Integer year, Integer seats) {
        this.model = model;
        this.plate = plate;
        this.color = color;
        this.year = year;
        this.seats = seats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
