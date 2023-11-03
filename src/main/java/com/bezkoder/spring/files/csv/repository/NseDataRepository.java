package com.bezkoder.spring.files.csv.repository;

import com.bezkoder.spring.files.csv.model.NseData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NseDataRepository extends JpaRepository<NseData,String> {
}
