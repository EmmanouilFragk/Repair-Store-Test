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
    public Owner findOwnerByUserName(String userName) {
        return ownerRepository.findOwnerByUserName(userName);
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
    public Owner createOrUpdateOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    public Owner loginOwner(String userName, String password){
        Owner owner = this.findOwnerByUserName(userName);
        if (owner != null && owner.getPassword().equals(password)) {
            return owner;
        }
        return null;
    }

    @Override
    public void deleteOwnerById(Long id) {
        ownerRepository.deleteById(id);
    }
}
