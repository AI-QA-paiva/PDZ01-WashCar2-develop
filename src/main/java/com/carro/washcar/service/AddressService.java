package com.carro.washcar.service;

import com.carro.washcar.model.AddressModel;
import com.carro.washcar.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;


    public AddressModel registerNewAddress(AddressModel addressModel) {
        return addressRepository.save(addressModel);

    }
}
