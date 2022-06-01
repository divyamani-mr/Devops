package com.example.scholardevopstest.repositories;

import com.example.scholardevopstest.entities.Scholar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScholarRepository extends JpaRepository<Scholar,String> {
}
