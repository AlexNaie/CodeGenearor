package com.tropical.codegeneratorapp.repository;

import com.tropical.codegeneratorapp.model.Code;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CodeRepository extends JpaRepository<Code, Integer> {
    Code findByCode(String code);
    List<Code> findAllByUsedTrue();
}
