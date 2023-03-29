package com.carro.washcar.model;

import com.carro.washcar.enums.SeniorityEmployeeEnums;
import com.carro.washcar.enums.StatusEmployeeEnums;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeModel extends PersonModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String workCard;
    private String reservistCard;
    private String bankAccount;
    private String son;
    private String wifeName;
    private String motherName;
    private String profession;
    private String schoolLevel;
    private StatusEmployeeEnums statusJob;
    private SeniorityEmployeeEnums seniorityJob;

    public EmployeeModel(Long idClient, String name, String taxipayerRegister, String idtCard, String gender, String dateBirth, String citizenShip, String placeOfBirth, String workCard, String reservistCard, String bankAccount, String son, String wifeName, String motherName, String profession, String schoolLevel, StatusEmployeeEnums statusJob, SeniorityEmployeeEnums seniorityJob) {
        super(name, taxipayerRegister, idtCard, gender, dateBirth, citizenShip, placeOfBirth);
        this.idClient = idClient;
        this.workCard = workCard;
        this.reservistCard = reservistCard;
        this.bankAccount = bankAccount;
        this.son = son;
        this.wifeName = wifeName;
        this.motherName = motherName;
        this.profession = profession;
        this.schoolLevel = schoolLevel;
        this.statusJob = statusJob;
        this.seniorityJob = seniorityJob;
    }

//    public SeniorityEmployeeEnums gerPassword (SeniorityEmployeeEnums seniorityJob){
//
//        if(seniorityJob == SeniorityEmployeeEnums.ADMIN || seniorityJob == SeniorityEmployeeEnums.MANAGER || seniorityJob == SeniorityEmployeeEnums.SUPERVISOR){
//            String login;
//            String passoword;
//        }else {
//            return ("You are not allowed to create login and password");
//        }
//        return null;
//    }



    public Long getIdClient(){
        return idClient;
    }
    public void setIdClient(Long idClient){
        this.idClient = idClient;
    }

    public String getWorkCard() {
        return workCard;
    }
    public void setWorkCard(String workCard) {
        this.workCard = workCard;
    }

    public String getReservistCard() {
        return reservistCard;
    }
    public void setReservistCard(String reservistCard) {
        this.reservistCard = reservistCard;
    }

    public String getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getSons() {
        return son;
    }
    public void setSons(String sons) {
        this.son = sons;
    }

    public String getWifeName() {
        return wifeName;
    }
    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public String getMotherName() {
        return motherName;
    }
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSchoolLevel() {
        return schoolLevel;
    }
    public void setSchoolLevel(String schoolLevel) {
        this.schoolLevel = schoolLevel;
    }

    public StatusEmployeeEnums getStatusJob() {
        return statusJob;
    }
    public void setStatusJob(StatusEmployeeEnums statusJob) {
        this.statusJob = statusJob;
    }

    public SeniorityEmployeeEnums getSeniorityJob() {
        return seniorityJob;
    }
    public void setSeniorityJob(SeniorityEmployeeEnums seniorityJob) {
        this.seniorityJob = seniorityJob;
    }
}
