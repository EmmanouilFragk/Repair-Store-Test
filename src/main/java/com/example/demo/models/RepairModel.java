package com.example.demo.models;

import com.example.demo.domain.Owner;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RepairModel {
    private Long repairID;
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dayOfRepair;
    private String repairStatus;
    private String repairType;
    private Double serviceCost;
    private String plateNumber;
    private Owner owner;

    public Long getRepairID() {
        return repairID;
    }

    public void setRepairID(Long repairID) {
        this.repairID = repairID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDayOfRepair() {
        return dayOfRepair;
    }

    public void setDayOfRepair(LocalDate dayOfRepair) {
        this.dayOfRepair = dayOfRepair;
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public RepairModel(String description, LocalDate dayOfRepair, String repairStatus, String repairType, Double serviceCost, String plateNumber, Owner owner, Long repairID) {
        this.description = description;
        this.dayOfRepair = dayOfRepair;
        this.repairStatus = repairStatus;
        this.repairType = repairType;
        this.serviceCost = serviceCost;
        this.plateNumber = plateNumber;
        this.owner = owner;
        this.repairID = repairID;
    }
}
