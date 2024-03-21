package org.example.myapp.repository;

import org.example.myapp.model.CodeBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeBookRepository extends JpaRepository<CodeBook, Integer> {

}