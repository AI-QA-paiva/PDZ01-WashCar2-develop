package com.carro.washcar.repository;

import com.carro.washcar.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository <AddressModel, Long>{

    Optional<AddressModel>findByEmail(String email);

}
