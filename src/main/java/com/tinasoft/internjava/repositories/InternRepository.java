package com.tinasoft.internjava.repositories;

import com.tinasoft.internjava.models.entities.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternRepository extends JpaRepository<Intern,Integer> {
}
