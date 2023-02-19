package com.example.EcommerseApi.addressRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EcommerseApi.addressModel.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{

}
