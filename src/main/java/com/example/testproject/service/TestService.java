package com.example.testproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testproject.Entity.TestEntity;
import com.example.testproject.repository.TestRepository;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<TestEntity> getAll(){
        return testRepository.findAll();
    }

}
