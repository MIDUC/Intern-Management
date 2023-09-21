package com.tinasoft.internjava.services.impl_service;

import com.tinasoft.internjava.models.entities.Leader;
import com.tinasoft.internjava.models.entities.Member;
import com.tinasoft.internjava.repositories.LeaderRepository;
import com.tinasoft.internjava.repositories.MemberRepository;
import com.tinasoft.internjava.services.i_services.LeaderService;
import com.tinasoft.internjava.services.i_services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderServiceImpl implements LeaderService {

    @Autowired
    LeaderRepository repository;
    @Autowired
    MemberService memberService;
    @Override
    public void save(Leader leader){
        repository.save(leader);
    }
    @Override
    public List<Leader> fillAll(){
        return repository.findAll();
    }

    @Override
    public Member fillLeader(int leader_id) {
        Leader leader = repository.findById(leader_id).orElseThrow();
        return memberService.findById(leader_id);
    }

}
