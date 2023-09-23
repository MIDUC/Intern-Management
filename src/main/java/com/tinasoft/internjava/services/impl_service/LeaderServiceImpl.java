package com.tinasoft.internjava.services.impl_service;

import com.tinasoft.internjava.models.entities.Leader;
import com.tinasoft.internjava.models.entities.User;
import com.tinasoft.internjava.repositories.LeaderRepository;
import com.tinasoft.internjava.services.i_services.LeaderService;
import com.tinasoft.internjava.services.i_services.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderServiceImpl implements LeaderService {

    @Autowired
    LeaderRepository repository;
    @Autowired
    UserService userService;
    @PersistenceContext
    protected EntityManager entityManager;
    public void save(Leader leader){
        repository.save(leader);
    }
    @Override
    public List<Leader> fillAll(){
    	List<Leader> leaders = repository.findAll();
    	for(Leader leader : leaders) {
    		leader.setPositon(userService.get_role(leader.getRole()));
    	}
        return leaders;
    }

    @Override
    public Leader fillLeader(int user_id) {
//        Leader leader = repository.findById(leader_id).orElseThrow();
    	try {
			Query query = entityManager.createNativeQuery(
					"SELECT u.user_id,u.address,u.dob,u.email,u.name,u.password,u.phone,u.role,u.username FROM leaders l JOIN users u ON l.user_id = u.user_id WHERE u.user_id = :id",
					Leader.class);
			query.setParameter("id", user_id);
			Leader leader = (Leader) query.getSingleResult();
			leader.setPositon(userService.get_role(leader.getRole()));
			return leader;
		} catch (Exception e) {
			return null;
		}
    }
	@Override
	public Leader getInforLeader(int user_id) {
		Query query =  entityManager.createNativeQuery("SELECT u.user_id,u.email,u.name FROM leaders l JOIN users u ON l.user_id = u.user_id WHERE u.user_id = :id",Object.class);
        query.setParameter("id", user_id);
        Object[] result = (Object[]) query.getSingleResult();
        Leader leader = new Leader();
        leader.setId(Integer.parseInt(result[0].toString()));
        leader.setName(result[2].toString());
        leader.setEmail(result[1].toString());
        return leader;
	}

}
