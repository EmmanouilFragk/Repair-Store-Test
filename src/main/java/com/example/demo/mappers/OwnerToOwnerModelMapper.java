package com.example.demo.mappers;

import com.example.demo.domain.Owner;
import com.example.demo.models.OwnerModel;
import org.springframework.stereotype.Component;

@Component
public class OwnerToOwnerModelMapper {
    public OwnerModel mapToOwnerModel(Owner owner) {
       OwnerModel ownerModel = new OwnerModel(owner.getTaxRegistrationNumber(), owner.getFirstName(), owner.getLastName(), owner.getAddress(), owner.getEmail(), owner.getPassword(), owner.getCarBrand(), owner.getCarPlate(), owner.getUserType(), owner.getId());
        return ownerModel;
    }
}
