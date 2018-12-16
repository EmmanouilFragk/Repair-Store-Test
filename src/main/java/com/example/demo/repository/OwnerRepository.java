package com.example.demo.repository;

import com.example.demo.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OwnerRepository extends JpaRepository <Owner, Long> {

    List<Owner> findAll();

    Optional<Owner> findOwnerByEmail(String email);

    Optional<Owner> findOwnerById(Long id);

    Optional<Owner> findOwnerByTaxRegistrationNumber(String tax_reg_num);

    List<Owner> findByTaxRegistrationNumberOrEmail(String taxRegistrationNumber, String email);

    void deleteById(Long id);

}
