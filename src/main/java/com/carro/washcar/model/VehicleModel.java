package com.carro.washcar.model;

import javax.persistence.*;


@Entity
@Table (name = "caranga")

public class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarro;
    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private String placa;



    public VehicleModel(Long idCarro, String marca, String modelo, String ano, String cor, String placa) {
        this.idCarro = idCarro;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    public VehicleModel(){

    }


    public Long getIdCarro() {
        return idCarro;
    }

    //Postman nao precisa ter o Set de idCarro ativo; na resposta precisa que o getIcarro esteja ativo para mostrar sequnciamento do Id
//    public void setIdCarro(){
//        this.idCarro = idCarro;
//    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
