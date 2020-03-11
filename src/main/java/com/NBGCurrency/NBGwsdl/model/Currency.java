package com.NBGCurrency.NBGwsdl.model;

import javax.persistence.*;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "USD")
    private String USD;
    @Column(name = "EUR")
    private String EUR;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUSD() {
        return USD;
    }
    public void setUSD(String USD) {
        this.USD = USD;
    }
    public String getEUR() {
        return EUR;
    }
    public void setEUR(String EUR) {
        this.EUR = EUR;
    }
}
