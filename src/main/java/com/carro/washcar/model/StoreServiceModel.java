package com.carro.washcar.model;

import com.carro.washcar.enums.ServiceType;

import javax.persistence.*;

@Entity
@Table(name = "storeService")
public class StoreServiceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStoreService;
    private ServiceType jobService;
    private String timeService;
    private Double costProducts;


}
