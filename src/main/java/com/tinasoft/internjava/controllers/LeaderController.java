package com.tinasoft.internjava.controllers;

import com.tinasoft.internjava.models.entities.Leader;
import com.tinasoft.internjava.services.i_services.LeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/leaders")
public class LeaderController {
    @Autowired
    private LeaderService service;
    @GetMapping("")
    public List<Leader> leaders(){
        return service.fillAll();
    }
}
