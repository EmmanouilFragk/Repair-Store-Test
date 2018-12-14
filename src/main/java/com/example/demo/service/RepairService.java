package com.example.demo.service;

import com.example.demo.models.RepairModel;

import java.time.LocalDate;
import java.util.List;

public interface RepairService {

    List<RepairModel> findAll();
}
