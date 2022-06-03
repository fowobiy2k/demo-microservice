package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Auditor;

@Repository
public interface AuditorRepository extends JpaRepository<Auditor, Integer> {

}
