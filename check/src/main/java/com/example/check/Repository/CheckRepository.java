package com.example.check.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.check.Model.CheckModel;

@Repository
public interface CheckRepository extends JpaRepository<CheckModel, Integer> {

}
