package com.tinasoft.internjava.services.impl_service;

import com.tinasoft.internjava.models.entities.Member;
import com.tinasoft.internjava.repositories.MemberRepository;
import com.tinasoft.internjava.services.i_services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceIpml implements MemberService {
    @Autowired
    private MemberRepository repository;
    @Override
    public Member findById(int Id) {
        return repository.findById(Id).orElseThrow();
    }
}
