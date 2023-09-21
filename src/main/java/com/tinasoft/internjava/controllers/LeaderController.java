package com.tinasoft.internjava.controllers;

import com.tinasoft.internjava.models.entities.Leader;
import com.tinasoft.internjava.models.entities.Member;
import com.tinasoft.internjava.services.i_services.LeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/leaders")
@CrossOrigin
public class LeaderController {
    @Autowired
    private LeaderService service;
    @GetMapping("")
    public List<Leader> leaders(){
        return service.fillAll();
    }
    @GetMapping("/{id}")
    public Member leader(@PathVariable int id){
        return service.fillLeader(id);
    }

}
