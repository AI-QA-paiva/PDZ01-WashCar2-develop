package com.carro.washcar.controller;

import com.carro.washcar.model.AddressModel;
import com.carro.washcar.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(name = "enderecos")
public class AddressController {

    @Autowired
    private AddressService addressService;

    //cadastrar
    @PostMapping (path = "/endereco")
    public AddressModel  registerAddress (@RequestBody AddressModel addressModel){
        return addressService.registerNewAddress(addressModel);

    }
}
