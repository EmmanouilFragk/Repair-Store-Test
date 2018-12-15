package com.example.demo.repository;
import com.example.demo.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Repair;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface RepairRepository extends JpaRepository<Repair,Long>{


    List<Repair> findAll();
    List<Repair> findRepairByOwnerId(Long id);
    //List<Repair> findTop10ByDayOfRepair(LocalDate date);
    //List<Repair> findRepairOrderByDescription();
}
