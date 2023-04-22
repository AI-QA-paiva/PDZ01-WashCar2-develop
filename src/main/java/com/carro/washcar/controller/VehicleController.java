package com.carro.washcar.controller;


import com.carro.washcar.model.VehicleDto;
import com.carro.washcar.model.VehicleModel;
import com.carro.washcar.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    //Qdo quero trazer um objeto, na declaração do metodo, identifico qual Classe gera o objeto
    //Na classe que assina o metodo, tem que ter Gets e Sets; assim o metodo pode bater nas variaveis que la estao.
    //aqui nao persiste no banco, pois retorno somente pega campos da model, preenche e nao salva dado em banco de dados.
    @PostMapping (path = "/completo")
    public VehicleModel postCarroNovo(@RequestBody VehicleModel carroModel){
        return carroModel;
    }

    //Abaixo, metodos que o dado fica persistindo no banco Postgres SQL

    @Autowired
    private VehicleService vehicleService;

    @PostMapping (path = "/salvando")
    public VehicleDto postCarroNovinho(@RequestBody VehicleDto vehicleDto){
        VehicleDto carro = vehicleService.postCadastro(vehicleDto);
        return carro;
    }

    @GetMapping (path = "/salvando")
    public List<VehicleModel> getCarros(){
        return vehicleService.getListaCarro();
    }

    @DeleteMapping (path = "/salvando/{id}")
    public void deletCarro(@PathVariable Long id){
        vehicleService.deleteCarro(id);

    }

}
