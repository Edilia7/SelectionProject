package com.SelectionProject.SelectionProject.repository;

import com.SelectionProject.SelectionProject.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findById(long id);
}
