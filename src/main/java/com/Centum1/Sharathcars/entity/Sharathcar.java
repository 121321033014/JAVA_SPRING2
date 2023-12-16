package com.Centum1.Sharathcars.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//these above annotations are required when we work with lombook
@Entity
@Table(name="ResalesCarsList")

public class Sharathcar {
    @Id
    @GeneratedValue
    public int id;
    public String carcode;
    public String carname;
    public String carmodel;
    public String caryear;
    public String carcolour;
    public String carvin;
    public String carowner;
    public String state;
    public String mobilenumber;
    public String price;
    public String details;
    public Sharathcar(){

    }

    public Sharathcar(int id, String carcode, String carname, String carmodel, String caryear, String carcolour, String carvin, String carowner, String state, String mobilenumber, String price, String details) {
        this.id = id;
        this.carcode = carcode;
        this.carname = carname;
        this.carmodel = carmodel;
        this.caryear = caryear;
        this.carcolour = carcolour;
        this.carvin = carvin;
        this.carowner = carowner;
        this.state = state;
        this.mobilenumber = mobilenumber;
        this.price = price;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarcode() {
        return carcode;
    }

    public void setCarcode(String carcode) {
        this.carcode = carcode;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getCaryear() {
        return caryear;
    }

    public void setCaryear(String caryear) {
        this.caryear = caryear;
    }

    public String getCarcolour() {
        return carcolour;
    }

    public void setCarcolour(String carcolour) {
        this.carcolour = carcolour;
    }

    public String getCarvin() {
        return carvin;
    }

    public void setCarvin(String carvin) {
        this.carvin = carvin;
    }

    public String getCarowner() {
        return carowner;
    }

    public void setCarowner(String carowner) {
        this.carowner = carowner;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
