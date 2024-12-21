package com.lakshay.school_service.repository;

import com.lakshay.school_service.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School , Integer> {
}
