package com.example.demo.service;


import com.example.demo.domain.Owner;
import com.example.demo.forms.OwnerForm;
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
    public Owner findOwnerById(Long id) {
        return ownerRepository.findOwnerById(id);
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
    public Owner createOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    /*public Owner loginOwner(String userName, String password){
        Owner owner = this.findOwnerByUserName(userName);
        if (owner != null && owner.getPassword().equals(password)) {
            return owner;
        }
        return null;
    }*/

    @Override
    public void deleteOwnerById(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner update(OwnerForm ownerForm) throws Exception {
        Owner owner = ownerRepository.findOwnerById(ownerForm.getId());
        owner.setId(ownerForm.getId());
        owner.setTaxRegistrationNumber(ownerForm.getTaxRegistrationNumber());
        owner.setFirstName(ownerForm.getFirstName());
        owner.setLastName(ownerForm.getLastName());
        owner.setUserName(ownerForm.getUserName());
        owner.setAddress(ownerForm.getAddress());
        owner.setEmail(ownerForm.getEmail());
        owner.setPassword(ownerForm.getPassword());
        owner.setCarBrand(ownerForm.getCarBrand());
        owner.setCarPlate(ownerForm.getCarPlate());
        owner.setUserType(ownerForm.getUserType());
        return ownerRepository.save(owner);
    }

    @Override
    public List<OwnerModel> findByTaxRegistrationNumberOrEmail(String taxRegistrationNumber, String email) {
        return ownerRepository
                .findByTaxRegistrationNumberOrEmail(taxRegistrationNumber,email)
                .stream()
                .map(owner -> mapper.mapToOwnerModel(owner))
                .collect(Collectors.toList());
    }
}
