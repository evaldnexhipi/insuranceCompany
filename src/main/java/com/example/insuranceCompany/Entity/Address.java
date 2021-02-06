package com.example.insuranceCompany.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Address {
    @Id
    @SequenceGenerator(
            name = "address_sequence",
            sequenceName = "address_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name="address_id")
    private Long id;
    private String street;
    private String city;
    private int zip_code;
    @OneToMany(mappedBy = "address")
    private Set<Customer> customers;
    @OneToMany(mappedBy = "address")
    private Set<Property> properties;

    public Address(){}

    public Address(Long id, String street, String city, int zip_code, Set<Customer> customers, Set<Property> properties) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.zip_code = zip_code;
        this.customers = customers;
        this.properties = properties;
    }

    public Address(String street, String city, int zip_code, Set<Customer> customers, Set<Property> properties) {
        this.street = street;
        this.city = city;
        this.zip_code = zip_code;
        this.customers = customers;
        this.properties = properties;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zip_code=" + zip_code +
                '}';
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Set<Property> getProperties() {
        return properties;
    }

    public void setProperties(Set<Property> properties) {
        this.properties = properties;
    }

}
