package com.carro.washcar.model;

public abstract class PersonModel {

    private String name;
    private String dateBirth;
    private String email;
    private String gender;
    private String identityCard;
    private String citizenShip;
    private String placeOfBirth;


    //construtor

    public PersonModel(String name, String dateBirth, String email, String gender, String identityCard, String citizenShip, String placeOfBirth) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.email = email;
        this.gender = gender;
        this.identityCard = identityCard;
        this.citizenShip = citizenShip;
        this.placeOfBirth = placeOfBirth;
    }

    //lembrar que get(fica vazio no parametro) and set(o parametro é inserido sendo a propria variavel de instancia)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getCitizenShip() {
        return citizenShip;
    }

    public void setCitizenShip(String citizenShip) {
        this.citizenShip = citizenShip;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
