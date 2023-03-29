package com.carro.washcar.repository;

import com.carro.washcar.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository <AddressModel, Long>{

}
