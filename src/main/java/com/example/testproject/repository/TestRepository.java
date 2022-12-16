package com.example.testproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testproject.Entity.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {
    
}
