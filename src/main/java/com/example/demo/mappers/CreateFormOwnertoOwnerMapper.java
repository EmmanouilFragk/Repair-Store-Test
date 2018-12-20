package com.example.demo.mappers;


import com.example.demo.domain.Owner;
import com.example.demo.forms.CreateFormOwner;
import com.example.demo.models.OwnerModel;
import org.springframework.stereotype.Component;

@Component
public class CreateFormOwnertoOwnerMapper {
    public OwnerModel mapToOwnerModel(CreateFormOwner createFormOwner) {
        OwnerModel ownerModel = new OwnerModel(createFormOwner.getTaxRegNum(),createFormOwner.getUserFirstName(),createFormOwner.getUserLastName(),createFormOwner.getAddress(),createFormOwner.getEmail(),createFormOwner.getPassword(),createFormOwner.getCarBrand(),createFormOwner.getCarPlate(),createFormOwner.getPassword());
        /*ownerModel.setTaxRegistrationNumber(createFormOwner.getTaxRegNum());
        ownerModel.setFirstName(createFormOwner.getUserFirstName());
        ownerModel.setLastName(createFormOwner.getUserLastName());
        ownerModel.setAddress(createFormOwner.getAddress());
        ownerModel.setCarBrand(createFormOwner.getCarBrand());
        ownerModel.setCarPlate(createFormOwner.getCarPlate());
        ownerModel.setEmail(createFormOwner.getEmail());
        ownerModel.setPassword(createFormOwner.getPassword());*/

        return ownerModel;
    }

}
