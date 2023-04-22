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

    //O idcarro é a primaryKey, e o Set de idCarro criado automaticamente pelo comando Alt+insert como ativo não é necessário;
    //o idCarro é gerado automaticamente pelo proprio Spring, assim, não deve poder ser setado;
    // Apenas pode se consultar e basta que o método getIcarro esteja ativo, assim mostrará os dados

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
