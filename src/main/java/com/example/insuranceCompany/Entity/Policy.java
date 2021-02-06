package com.example.insuranceCompany.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Policy {
    @Id
    @SequenceGenerator(
            name = "policy_sequence",
            sequenceName = "policy_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "policy_sequence"
    )
    private Long id;
    @Column(nullable = false)
    private Double coverage;
    @Column(nullable = false)
    private Double term_payment;
    private Double risk_factor;
    private Date date_of_issue;
    @Column(columnDefinition = "VARCHAR(8) CHECK (status IN ('ok','expired','dangered'))")
    private String status;

    public Policy() {
    }

    public Policy(Long id, Double coverage, Double term_payment, Double risk_factor, Date date_of_issue, String status) {
        this.id = id;
        this.coverage = coverage;
        this.term_payment = term_payment;
        this.risk_factor = risk_factor;
        this.date_of_issue = date_of_issue;
        this.status = status;
    }

    public Policy(Double coverage, Double term_payment, Double risk_factor, Date date_of_issue, String status) {
        this.coverage = coverage;
        this.term_payment = term_payment;
        this.risk_factor = risk_factor;
        this.date_of_issue = date_of_issue;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCoverage() {
        return coverage;
    }

    public void setCoverage(Double coverage) {
        this.coverage = coverage;
    }

    public Double getTerm_payment() {
        return term_payment;
    }

    public void setTerm_payment(Double term_payment) {
        this.term_payment = term_payment;
    }

    public Double getRisk_factor() {
        return risk_factor;
    }

    public void setRisk_factor(Double risk_factor) {
        this.risk_factor = risk_factor;
    }

    public Date getDate_of_issue() {
        return date_of_issue;
    }

    public void setDate_of_issue(Date date_of_issue) {
        this.date_of_issue = date_of_issue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
