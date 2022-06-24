package com.process.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.process.entity.ProcessDetails;

@Repository
public interface ProcessRepo extends JpaRepository<ProcessDetails, String>{

}
