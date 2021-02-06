package com.example.insuranceCompany.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Customer {
    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    private Long id;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private String personal_number;
    private Date birthday;

    @ManyToOne
    @JoinColumn(name="address_id",nullable = false)
    private Address address;

    public Customer() {
    }

    public Customer(Long id, String first_name, String last_name, String email, String personal_number, Date birthday, Address address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.personal_number = personal_number;
        this.birthday = birthday;
        this.address = address;
    }

    public Customer(String first_name, String last_name, String email, String personal_number, Date birthday, Address address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.personal_number = personal_number;
        this.birthday = birthday;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonal_number() {
        return personal_number;
    }

    public void setPersonal_number(String personal_number) {
        this.personal_number = personal_number;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
