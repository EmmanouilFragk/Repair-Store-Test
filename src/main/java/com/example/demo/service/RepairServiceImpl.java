package com.example.demo.service;

import com.example.demo.domain.Repair;
import com.example.demo.domain.Owner;
import com.example.demo.mappers.RepairToRepairModelMapper;
import com.example.demo.models.MixedModel;
import com.example.demo.models.RepairModel;
import com.example.demo.models.OwnerModel;
import com.example.demo.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class RepairServiceImpl implements RepairService {

    @Autowired
    private RepairRepository repairRepository;

    @Autowired
    private RepairToRepairModelMapper mapper;

    @Override
    public List<RepairModel> findAll() {
        return repairRepository
                .findAll()
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findByTaxRegistrationNumberOrCarPlateOrDayOfRepair(MixedModel mixedModel){
        return repairRepository
                .findByTaxRegistrationNumberOrCarPlateOrDayOfRepair(mixedModel.getDayOfRepair(), mixedModel.getTaxRegistrationNumber(), mixedModel.getCarPlate())
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }
}
