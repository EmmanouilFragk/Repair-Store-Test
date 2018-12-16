package com.example.demo.service;


import com.example.demo.domain.Owner;
import com.example.demo.models.OwnerModel;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    Optional<Owner> findOwnerById(Long id);

    List<OwnerModel> findAll();

    List<OwnerModel> findByTaxRegistrationNumberOrEmail(String taxRegistrationNumber, String email);

    Optional<Owner> findOwnerByEmail(String email);
}
