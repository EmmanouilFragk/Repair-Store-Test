package com.example.demo.service;

import com.example.demo.domain.Owner;
import com.example.demo.domain.Repair;
import com.example.demo.models.RepairModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface RepairService {

    List<RepairModel> findAll();
    List<Repair> findRepairByOwnerId(Long id);
    List<RepairModel> findTop10ByFinishDayOfRepairAfter(LocalDateTime date);
    void deleteRepairById(Long id);
    //List<RepairModel> findRepairOrderByDescription();
}
