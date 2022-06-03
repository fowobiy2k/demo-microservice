package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Tester;

@Repository
public interface TesterRepository extends JpaRepository<Tester, Integer> {

}
