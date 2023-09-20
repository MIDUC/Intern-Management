package com.tinasoft.internjava.repositories;

import com.tinasoft.internjava.models.entities.Leader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderRepository extends JpaRepository<Leader,Integer> {
}
