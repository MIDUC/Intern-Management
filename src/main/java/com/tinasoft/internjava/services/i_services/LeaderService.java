package com.tinasoft.internjava.services.i_services;

import com.tinasoft.internjava.models.entities.Leader;

import java.util.List;

public interface LeaderService {
    public abstract void save(Leader leader) ;
    public abstract List<Leader> fillAll() ;
}
