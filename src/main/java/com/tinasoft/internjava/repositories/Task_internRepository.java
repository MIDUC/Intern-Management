package com.tinasoft.internjava.repositories;

import com.tinasoft.internjava.models.entities.Task_intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Task_internRepository extends JpaRepository<Task_intern,Integer> {
}
