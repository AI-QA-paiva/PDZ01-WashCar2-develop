package com.carro.washcar.controller;

import com.carro.washcar.model.AddressModel;
import com.carro.washcar.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping (path = "/todos")
    public List<AddressModel> queryAllAddress(){
        return addressService.fetchAddresses();
    }

    @GetMapping(path = "{id}")
    public Optional<AddressModel> queryOnlyAddress(@PathVariable Long id){
        return addressService.fetchOnlyAddress(id);
    }

    @PutMapping (path = "/atualizando/{idOnly}")
    public AddressModel updateAddress (@RequestBody AddressModel addressModel, @PathVariable Long idOnly){
        addressModel.setIdAddress(idOnly);
        return addressService.putOnlyAddress(addressModel);
    }

    @DeleteMapping (path = "{check}")
    public void deleteAddress(@PathVariable Long check){
        addressService.deleteAddressOn(check);

    }



}
