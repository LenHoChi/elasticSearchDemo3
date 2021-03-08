package com.example.elactisSearchDemoDB.repository;

import com.example.elactisSearchDemoDB.model.Foods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Foods, String> {
}
