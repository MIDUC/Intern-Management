package com.tinasoft.internjava.services.i_services;

import java.util.List;

import com.tinasoft.internjava.models.entities.Intern;

public interface InternService {
	public List<Intern> getListInterns();
	public List<Intern> getListInternsByIdLeader(int leaderId);
	public Intern getInternByUserId(int id);
	
}
