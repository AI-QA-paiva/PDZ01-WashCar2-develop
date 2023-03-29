package com.carro.washcar.model;

import javax.persistence.*;

@Entity
@Table(name="client")
public class ClientModel extends PersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String clientType;
    private int dots;

    public ClientModel(Long idCliente, String name, String taxipayerRegister, String idtCard, String gender, String dateBirth, String citizenShip, String placeOfBirth, String clientType, int dots) {
        super(name, taxipayerRegister, idtCard, gender, dateBirth, citizenShip, placeOfBirth);
        this.idCliente = idCliente;
        this.clientType = clientType;
        this.dots = dots;
    }

    public Long getIdCliente(){
        return idCliente;
    }
    public void setIdCliente(Long idCliente){
        this.idCliente =idCliente;
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
