package com.carro.washcar.repository;

import com.carro.washcar.model.StoreServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreServiceRepository extends JpaRepository<StoreServiceModel, Long> {
}
