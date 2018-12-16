package com.example.demo.service;


import com.example.demo.domain.Owner;
import com.example.demo.mappers.OwnerToOwnerModelMapper;
import com.example.demo.models.OwnerModel;
import com.example.demo.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private OwnerToOwnerModelMapper mapper;

    @Override
    public Optional<Owner> findOwnerById(Long id) {
        return ownerRepository.findOwnerById(id);
    }

    @Override
    public Optional<Owner> findOwnerByEmail(String email) {
        return ownerRepository.findOwnerByEmail(email);
    }

    @Override
    public List<OwnerModel> findAll() {
        return ownerRepository
                .findAll()
                .stream()
                .map(owner -> mapper.mapToOwnerModel(owner))
                .collect(Collectors.toList());
    }

    @Override
    public List<OwnerModel> findByTaxRegistrationNumberOrEmail(String taxRegistrationNumber, String email){
        return ownerRepository
                .findByTaxRegistrationNumberOrEmail(taxRegistrationNumber, email)
                .stream()
                .map(owner -> mapper.mapToOwnerModel(owner))
                .collect(Collectors.toList());
    }
}
