package com.example.demo.service;


import com.example.demo.domain.Owner;
import com.example.demo.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public Optional<Owner> findOwnerById(Long id) {
        return ownerRepository.findOwnerById(id);
    }

    @Override
    public List<Owner> getAllOwnersByAddress(String address) {
        return ownerRepository.getAllOwnersByAddress(address);
    }

    @Override
    public Optional<Owner> findOwnerByEmail(String email) {
        return ownerRepository.findOwnerByEmail(email);
    }

}
