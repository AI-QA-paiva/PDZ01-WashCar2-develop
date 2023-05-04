package com.carro.washcar.service;

import com.carro.washcar.model.AddressModel;
import com.carro.washcar.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;


    public AddressModel registerNewAddress(AddressModel addressModel) {
        return addressRepository.save(addressModel);

    }

    public List<AddressModel> fetchAddresses() {
        return addressRepository.findAll();
    }


    public Optional<AddressModel> fetchOnlyAddress(Long id) {
        return addressRepository.findById(id);
    }

    public void deleteAddressOn(Long inputId) {
        addressRepository.deleteById(inputId);
    }

    public AddressModel putOnlyAddress(AddressModel addressModel) {
        return addressRepository.save(addressModel);

    }
}
