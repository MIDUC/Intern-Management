package com.tinasoft.internjava.services.impl_service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinasoft.internjava.models.entities.Task_intern;
import com.tinasoft.internjava.repositories.Task_internRepository;
import com.tinasoft.internjava.services.i_services.Task_internService;

import java.util.List;
@Service
public class Task_internServiceImpl implements Task_internService {
    @Autowired
    private Task_internRepository task_internRepository;
    @Override
    public void save(Task_intern task_intern) {
        task_internRepository.save(task_intern);
    }

    @Override
    public void update(int id, Task_intern task_intern) {
        Task_intern task_intern_old = task_internRepository.findById(id).orElseThrow();
        task_intern_old.setIntern_id(task_intern.getIntern_id());
        task_intern_old.setTask_id(task_intern.getTask_id());
        task_intern_old.setDateline(task_intern.getDateline());
        task_intern_old.setEvaluate(task_intern.getEvaluate());
        task_internRepository.save(task_intern_old);
    }

    @Override
    public void delete(int id) {
        task_internRepository.deleteById(id);
    }

    @Override
    public List<Task_intern> get_task_interns() {
        return task_internRepository.findAll();
    }

    @Override
    public Task_intern get_task_intern(int id) {
        return task_internRepository.findById(id).orElseThrow();
    }
}
