package org.example.myapp.repository;

import org.example.myapp.model.Code;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeRepository extends JpaRepository<Code, Integer> {
}
