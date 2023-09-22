package com.tinasoft.internjava.services.impl_service;

import com.tinasoft.internjava.models.entities.Task;
import com.tinasoft.internjava.repositories.TaskRepository;
import com.tinasoft.internjava.services.i_services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository repository;
    @Override
    public void save(Task task) {
        repository.save(task);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Integer id, Task task) {
        Task task_old = get_task(id);
        task_old.setName(task.getName());
        task_old.setDescription(task.getDescription());
        task_old.setDate(task.getDate());
        task_old.setStatus(task.getStatus());
        task_old.setLeader_id(task.getLeader_id());
        repository.save(task_old);
    }

    @Override
    public Task get_task(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Task> get_tasks() {
        return repository.findAll();
    }
}
