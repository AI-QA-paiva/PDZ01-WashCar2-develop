package com.carro.washcar.service;


import com.carro.washcar.model.VehicleDto;
import com.carro.washcar.model.VehicleModel;
import com.carro.washcar.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;


    public VehicleDto postCadastro(VehicleDto vehicleDto) {
        VehicleModel model=new VehicleModel();
        //o model ta vazio
        //preciso salvar ele no banco de dados
        //como eu vou preencher o model com os dados que eu estou recebendo como parametro no metodo
        model.setAno(vehicleDto.getAno());
        model.setCor(vehicleDto.getCor());
        model.setPlaca(vehicleDto.getPlaca());
        model.setModelo(vehicleDto.getModelo());
        model.setMarca(vehicleDto.getMarca());
        vehicleRepository.save(model);


        /// no parametro é um DTO que passo, entao tenho que retornar DTO?
        return vehicleDto;
    }

    public List<VehicleModel> getListaCarro() {
        return vehicleRepository.findAll(); //para esse metodo findall trazer a relação, na model deve ter um contrutor vazio obrigatoriamente
    }


    public void deleteCarro(Long id) {
        vehicleRepository.deleteById(id);
    }
}
