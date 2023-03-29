package com.carro.washcar.model;

public class VehicleDto {
//objeto de trafegar dados

    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private String placa;


    public VehicleDto(){

    }

    public VehicleDto(String marca, String modelo, String ano, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    //metodo para construtor para converter dados da entidade pra Dto
    public VehicleDto(VehicleModel vehicleModel) {
        marca = vehicleModel.getMarca();
        modelo = vehicleModel.getModelo();
        ano = vehicleModel.getAno();
        cor = vehicleModel.getCor();
        placa = vehicleModel.getPlaca();
    }

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
