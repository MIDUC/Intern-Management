package com.tinasoft.internjava.services;

import com.tinasoft.internjava.models.entities.Leader;
import com.tinasoft.internjava.repositories.LeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderService {

    @Autowired
    LeaderRepository repository;

    public void save(Leader leader){
        repository.save(leader);
    }

    public List<Leader> fillAll(){
        return repository.findAll();
    }
}
