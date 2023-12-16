package com.Centum1.Sharathcars.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//these above annotations are required when we work with lombook
public class SharathcarRequest {
    @NotNull(message ="carcode should be blank")
    public String carcode;
    @NotBlank
    public String carname;
    @NotBlank
    public String carmodel;
    @NotBlank
    public String caryear;
    @NotBlank
    public String carcolour;
    @NotBlank
    public String carvin;
    @NotBlank
    public String carowner;
    @NotEmpty
    public String state;
    @Pattern(regexp ="^\\d{10}$",message="invaild mobile number entered")
    public String mobilenumber;
    @Min(100000)
    @Max(10000000)
    public String price;
    @NotBlank
    public String details;
    public SharathcarRequest(){

    }
    public SharathcarRequest(String carcode, String carname, String carmodel, String caryear, String carcolour, String carvin, String carowner, String state, String mobilenumber, String price, String details) {
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
