package com.example.EcommerseApi.addressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcommerseApi.addressModel.Address;
import com.example.EcommerseApi.addressRepository.AddressRepository;

@Service
public class AddressService {

	@Autowired
    private AddressRepository addressRepository;

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }
}
