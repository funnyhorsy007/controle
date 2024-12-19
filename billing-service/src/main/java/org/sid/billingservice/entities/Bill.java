package org.sid.billingservice.entities;

import jakarta.persistence.*;
import org.sid.billingservice.model.Customer;

import java.util.Date;
import java.util.List;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billDate;
    private Long customerId;

    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItemList;

    @Transient // Champ non persistant
    private Customer customer;

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public List<ProductItem> getProductItemList() {
        return productItemList;
    }

    public void setProductItemList(List<ProductItem> productItemList) {
        this.productItemList = productItemList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", billDate=" + billDate +
                ", customerId=" + customerId +
                ", productItemList=" + productItemList +
                ", customer=" + customer +
                '}';
    }
}
