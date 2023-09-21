package com.tinasoft.internjava.repositories;

import com.tinasoft.internjava.models.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {

}
