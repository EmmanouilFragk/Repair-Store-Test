package com.example.demo.service;


import com.example.demo.domain.Owner;
import com.example.demo.models.OwnerModel;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    Owner findOwnerByUserName(String userName);

    List<OwnerModel> findAll();

    Optional<Owner> findOwnerByEmail(String email);


}
