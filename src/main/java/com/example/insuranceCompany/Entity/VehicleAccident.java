package com.example.insuranceCompany.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class VehicleAccident {
    @Id
    @SequenceGenerator(
            name = "vehicle_accident_sequence",
            sequenceName = "vehicle_accident_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "vehicle_accident_sequence"
    )
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id",nullable = false)
    private Vehicle vehicle;
    private String report_number;
    private Date day_of_accident;
    private Double damage_cost;
    private boolean is_faulty;

    public VehicleAccident() {
    }

    public VehicleAccident(Long id, Vehicle vehicle, String report_number, Date day_of_accident, Double damage_cost, boolean is_faulty) {
        this.id = id;
        this.vehicle = vehicle;
        this.report_number = report_number;
        this.day_of_accident = day_of_accident;
        this.damage_cost = damage_cost;
        this.is_faulty = is_faulty;
    }

    public VehicleAccident(Vehicle vehicle, String report_number, Date day_of_accident, Double damage_cost, boolean is_faulty) {
        this.vehicle = vehicle;
        this.report_number = report_number;
        this.day_of_accident = day_of_accident;
        this.damage_cost = damage_cost;
        this.is_faulty = is_faulty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getReport_number() {
        return report_number;
    }

    public void setReport_number(String report_number) {
        this.report_number = report_number;
    }

    public Date getDay_of_accident() {
        return day_of_accident;
    }

    public void setDay_of_accident(Date day_of_accident) {
        this.day_of_accident = day_of_accident;
    }

    public Double getDamage_cost() {
        return damage_cost;
    }

    public void setDamage_cost(Double damage_cost) {
        this.damage_cost = damage_cost;
    }

    public boolean isIs_faulty() {
        return is_faulty;
    }

    public void setIs_faulty(boolean is_faulty) {
        this.is_faulty = is_faulty;
    }
}
