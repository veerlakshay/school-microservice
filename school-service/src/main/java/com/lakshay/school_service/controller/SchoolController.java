package com.lakshay.school_service.controller;

import com.lakshay.school_service.entity.School;
import com.lakshay.school_service.service.SchoolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = "/school")
@RestController
public class SchoolController {
    private final SchoolService schoolService;
    public SchoolController(SchoolService schoolService){
        this.schoolService = schoolService;
    }

    @PostMapping
    public School addSchool(@RequestBody School school){
        return schoolService.addSchool(school);
    }

    @GetMapping
    public List<School> getSchools(){
        return schoolService.fetchSchool();
    }

    @GetMapping("/{id}")
    public School fetchSchoolById(@PathVariable int id){
        return schoolService.fetchSchoolById(id);
    }
}
