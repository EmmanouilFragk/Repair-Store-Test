package com.example.demo.service;

import com.example.demo.domain.Repair;
import com.example.demo.models.RepairModel;
import com.example.demo.models.MixedModel;

import java.time.LocalDate;
import java.util.List;

public interface RepairService {

    List<RepairModel> findAll();

    List<RepairModel> findByTaxRegistrationNumberOrCarPlateOrDayOfRepair(MixedModel mixedModel);
}
