package com.carro.washcar.model;

import javax.persistence.*;

@Entity
@Table(name="client")
public class ClientModel extends PersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String taxipayerRegister;
    private String clientType;
    private int dots;

    public ClientModel(String name, String dateBirth, String email, String gender, String identityCard, String citizenShip, String placeOfBirth, Long idCliente, String taxipayerRegister, String clientType, int dots) {
        super(name, dateBirth, email, gender, identityCard, citizenShip, placeOfBirth);
        this.idCliente = idCliente;
        this.taxipayerRegister = taxipayerRegister;
        this.clientType = clientType;
        this.dots = dots;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getTaxipayerRegister() {
        return taxipayerRegister;
    }

    public void setTaxipayerRegister(String taxipayerRegister) {
        this.taxipayerRegister = taxipayerRegister;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public int getDots() {
        return dots;
    }

    public void setDots(int dots) {
        this.dots = dots;
    }
}
