package com.example.demo.repository;

import com.example.demo.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OwnerRepository extends JpaRepository <Owner, Long> {

    Optional<Owner> findOwnerByEmail(String email);

    Optional<Owner> findOwnerById(Long id);

    List<Owner> getAllOwnersByAddress(String address);

    void deleteById(Long id);

}
