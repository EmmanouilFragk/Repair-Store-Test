package com.example.demo.mappers;

import com.example.demo.domain.Owner;
import com.example.demo.forms.OwnerForm;
import org.springframework.stereotype.Component;

@Component
public class OwnerFormToOwnerMapper {
    public Owner  convertOwner (OwnerForm ownerForm) {
        return new Owner(ownerForm.getTaxRegistrationNumber(), ownerForm.getFirstName(), ownerForm.getLastName(),
                ownerForm.getUserName(), ownerForm.getAddress(), ownerForm.getEmail(), ownerForm.getPassword(),
                ownerForm.getCarBrand(), ownerForm.getCarPlate(), ownerForm.getUserType());
    }

    /*public Owner updateOwner(OwnerForm ownerForm, Owner owner) {
        owner.setTaxRegistrationNumber(ownerForm.getTaxRegistrationNumber());
        owner.setFirstName(ownerForm.getFirstName());
        owner.setLastName(ownerForm.getLastName());
        owner.setUserName(ownerForm.getUserName());
        owner.setAddress(ownerForm.getAddress());
        owner.setEmail(ownerForm.getEmail());
        owner.setPassword(ownerForm.getPassword());
        owner.setCarBrand(ownerForm.getCarBrand());
        ownerForm.setCarPlate(ownerForm.getCarPlate());
        owner.setUserType(ownerForm.getUserType());
        return owner;
    }*/
}
