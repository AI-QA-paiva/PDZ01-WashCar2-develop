package com.carro.washcar.repository;

import com.carro.washcar.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//lembrar que nome da classe model, deve seguir mesma descrição das classe; "CarroObjetoModel", CarroObjetoService, CarroObjetoController,...
@Repository
public interface VehicleRepository extends JpaRepository<VehicleModel, Long>{

}
