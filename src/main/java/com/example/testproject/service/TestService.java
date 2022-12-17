package com.example.testproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testproject.Entity.TestEntity;
import com.example.testproject.dto.ContentsForm;
import com.example.testproject.repository.TestRepository;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<TestEntity> getAll(){
        return testRepository.findAll();
    }

    public void addContents(ContentsForm contentsForm) {
        TestEntity testEntity = formToEntity(contentsForm);
		testRepository.save(testEntity);
	}

    private TestEntity formToEntity(ContentsForm contentsForm) {
        TestEntity testEntity = new TestEntity();
        testEntity.setContent1(contentsForm.getContent1());
        testEntity.setContent2(contentsForm.getContent2());
        testEntity.setContent3(contentsForm.getContent3());

        return testEntity;
    }

}
