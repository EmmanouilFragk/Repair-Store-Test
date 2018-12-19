package com.example.demo.service;

import com.example.demo.domain.Owner;
import com.example.demo.domain.Repair;
import com.example.demo.mappers.RepairToRepairModelMapper;
import com.example.demo.models.RepairModel;
import com.example.demo.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
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
    public List<Repair> findRepairByOwnerId(Long id) {
        return repairRepository.findRepairByOwnerId(id);
    }

    @Override
    public List<RepairModel> findTop10ByFinishDayOfRepairAfter(LocalDateTime date) {
        return repairRepository
                .findTop10ByFinishDayOfRepairAfter(date)
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());

    }

    @Override
    public void deleteRepairById(Long id) {
        repairRepository.deleteById(id);
    }
}


//    @Override
//    public List<RepairModel> findRepairOrderByDescription() {
//        return repairRepository
//                .findRepairOrderByDescription()
//                .stream()
//                .map(repair -> mapper.mapToRepairModel(repair))
//                .collect(Collectors.toList());
//    }

