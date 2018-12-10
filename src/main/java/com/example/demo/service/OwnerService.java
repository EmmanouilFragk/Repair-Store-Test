package com.example.demo.service;


import com.example.demo.domain.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    Optional<Owner> findOwnerById(Long id);

    List<Owner> getAllOwnersByAddress(String address);

    Optional<Owner> findOwnerByEmail(String email);
}
