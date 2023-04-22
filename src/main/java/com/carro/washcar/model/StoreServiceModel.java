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
    //private List<ProductModel> productList;
    /*ideia aqui relaciona produtos que sao usados nesse serviço cadastradado
    cada serviço tem uma lista de produtos que serão usados
    TENTAR: que consiga colocar quantidade de cada produto, ex.: Sabao liquido = 50ml
        */


}
