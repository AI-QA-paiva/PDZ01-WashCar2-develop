package com.carro.washcar.model;

public abstract class PersonModel {

    private String name,taxipayerRegister,idtCard,gender,dateBirth,citizenShip,placeOfBirth;

    //construtor

    public PersonModel(String name, String taxipayerRegister, String idtCard, String gender, String dateBirth, String citizenShip, String placeOfBirth){
        this.name = name;
        this.taxipayerRegister =taxipayerRegister;
        this.idtCard = idtCard;
        this.gender = gender;
        this.dateBirth = dateBirth;
        this.citizenShip = citizenShip;
        this.placeOfBirth = placeOfBirth;

    }

    //get(vazio) and set(recebe parametro)

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getTaxipayerRegister(){
        return taxipayerRegister;
    }
    public void setTaxipayerRegister(String taxipayerRegister){
        this.taxipayerRegister =taxipayerRegister;
    }

    public String getIdtCard(){
        return idtCard;
    }
    public void setIdtCard(String idtCard){
        this.idtCard =idtCard;
    }

    public String getGender(){
        return gender = gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getDateBirth(){
        return dateBirth;
    }
    public void setDateBirth(String dateBirth){
        this.dateBirth = dateBirth;
    }

    public String getCitizenShip(){
        return citizenShip;
    }
    public void setCitizenShip(String citizenShip){
        this.citizenShip =citizenShip;
    }

    public String getPlaceOfBirth(){
        return placeOfBirth;
    }
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

}
