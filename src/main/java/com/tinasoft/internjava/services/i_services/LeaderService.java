package com.tinasoft.internjava.services.i_services;

import com.tinasoft.internjava.models.entities.Leader;
import com.tinasoft.internjava.models.entities.User;

import java.util.List;

public interface LeaderService {
    public abstract void save(Leader leader) ;
    public abstract List<Leader> fillAll() ;
    public abstract Leader fillLeader(int user_id);
    public abstract Leader getInforLeader(int user_id);
}
