package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Repair;
import com.example.demo.domain.Owner;
import org.springframework.data.jpa.repository.Query;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


public interface RepairRepository extends JpaRepository <Repair, Long> {


    List<Repair> findAll();

    @Query(value = "SELECT r.* FROM OWNER u INNER JOIN REPAIRS r ON u.owner_id = r.owner_id WHERE r.dayofrepair = ?1 OR u.tax_reg_num = ?2 OR u.car_plate = ?3", nativeQuery = true)
    List<Repair> findByTaxRegistrationNumberOrCarPlateOrDayOfRepair(LocalDate dayOfRepair, String taxRegistrationNumber, String carPlate);
}
