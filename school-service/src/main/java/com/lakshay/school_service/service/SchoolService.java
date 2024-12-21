package com.lakshay.school_service.service;

import com.lakshay.school_service.entity.School;
import com.lakshay.school_service.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;
    public SchoolService(SchoolRepository schoolRepository){
        this.schoolRepository = schoolRepository;
    }
    public School addSchool(School school){
        return schoolRepository.save(school);
    }

    public List<School> fetchSchool(){
        return schoolRepository.findAll();
    }

    public School fetchSchoolById(int id) {
        return schoolRepository.findById(id).orElse(null);
    }
}
