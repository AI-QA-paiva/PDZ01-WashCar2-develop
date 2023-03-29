package com.carro.washcar.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class AddressModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAddress;
    private String address;
    private String addressNumber;
    private String district;
    private String zipCode;
    private String addressAdjunct;
    private String city;
    private String state;
    private String country;
    private String phone;
    private String email;

    public AddressModel(Long idAddress, String address, String addressNumber, String district, String zipCode, String addressAdjunct, String city, String state, String country, String phone, String email) {
        this.idAddress = idAddress;
        this.address = address;
        this.addressNumber = addressNumber;
        this.district = district;
        this.zipCode = zipCode;
        this.addressAdjunct = addressAdjunct;
        this.city = city;
        this.state = state;
        this.country = country;
        this.phone = phone;
        this.email = email;
    }




    public Long getIdAddress(){
        return idAddress;
    }
    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressNumber() {
        return addressNumber;
    }
    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }

    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddressAdjunct() {
        return addressAdjunct;
    }
    public void setAddressAdjunct(String addressAdjunct) {
        this.addressAdjunct = addressAdjunct;
    }

    public String getCity(){ return city; }
    public void setCity(String city){ this.city = city; }

    public String getState(){ return state; }
    public void setState(String state) { this.state = state; }

    public String getCountry(){ return country; }
    public void setCountry(String country) { this.country = country; }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
