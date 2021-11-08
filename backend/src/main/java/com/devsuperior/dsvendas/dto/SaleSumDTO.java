package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
   
    private static final long serialVersionUID = 1L;
    private String Sellername;
    private Double sum;
    
    public SaleSumDTO() {
    }

    public SaleSumDTO(Seller seller, Double sum) {
        Sellername = seller.getName();
        this.sum = sum;
    }

    public String getSellername() {
        return Sellername;
    }

    public void setSellername(String sellername) {
        Sellername = sellername;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    
}
