package com.example.demo.service;

import com.example.demo.domain.Owner;
import com.example.demo.domain.Repair;
import com.example.demo.models.RepairModel;

import java.time.LocalDate;
import java.util.List;

public interface RepairService {

    List<RepairModel> findAll();
    List<Repair> findRepairByOwnerId(Long id);
    //List<Repair> findTop10ByDayOfRepair(LocalDate date);
    //List<RepairModel> findRepairOrderByDescription();
}
