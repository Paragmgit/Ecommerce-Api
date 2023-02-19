package com.example.EcommerseApi.addressModel;

import com.example.EcommerseApi.userModel.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="User_tbl")
public class Address {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="landmark")
    private String landmark;
    
    @Column(name = "phone_number")
    private String phoneNumber;
    
    @Column(name="zipcode")
    private String zipcode;
    
    @Column(name="state")
    private String state;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
