package com.example.demo.repository;

import com.example.demo.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OwnerRepository extends JpaRepository <Owner, Long> {

    Optional<Owner> findOwnerByEmail(String email);

    Owner findOwnerByUserName(String userName);

    Optional<Owner> findOwnerByTaxRegistrationNumber(String tax_reg_num);

    void deleteById(Long id);

}
