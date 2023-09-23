package com.tinasoft.internjava.services.impl_service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinasoft.internjava.models.entities.Intern;
import com.tinasoft.internjava.repositories.InternRepository;
import com.tinasoft.internjava.repositories.LeaderRepository;
import com.tinasoft.internjava.services.i_services.InternService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
public class InternServiceImpl implements InternService {
	
	@PersistenceContext
    protected EntityManager entityManager;
	@Autowired
	LeaderServiceImpl leaderService;
	@Autowired
	InternRepository internRepo;
	@Autowired
	UserServiceIpml userService;
	
	@Override
	public List<Intern> getListInterns() {
		List<Intern> interns = internRepo.findAll();
		for(Intern intern : interns) {
			intern.setManager(leaderService.getInforLeader(intern.getLeader()));
			intern.setPositon(userService.get_role(intern.getRole()));
		}
		return interns;
	}

	@Override
	public List<Intern> getListInternsByIdLeader(int leaderId) {
		try {
			Query query = entityManager.createNativeQuery(
					"SELECT u.user_id,l.leader_id,u.address,u.dob,u.email,u.name,u.password,u.phone,u.role,u.username FROM interns l JOIN users u ON l.user_id = u.user_id WHERE l.leader_id = :id",
					Intern.class);
			query.setParameter("id", leaderId);
			List<Intern> interns = query.getResultList();
			for(Intern intern : interns) {
				intern.setManager(leaderService.getInforLeader(intern.getLeader()));
			}
			return interns;
		} catch (Exception e) {
			return null;
		}
	}


	@Override
	public Intern getInternByUserId(int id) {
		try {
			Intern intern = internRepo.findById(id).orElseThrow();
			if (intern != null) {
				intern.setManager(leaderService.getInforLeader(intern.getLeader()));
				intern.setPositon(userService.get_role(intern.getRole()));
			}
			return intern;
		} catch (Exception e) {
			return null;
		}
		
	}
}
