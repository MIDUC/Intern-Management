package com.tinasoft.internjava.controllers;

import com.tinasoft.internjava.models.entities.Task;
import com.tinasoft.internjava.services.i_services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tasks")
@CrossOrigin
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping("")
    public List<Task> getTasks(){
        return taskService.get_tasks();
    }
    @GetMapping("/{id}")
    public Task getTask(@PathVariable Integer id){
        return taskService.get_task(id);
    }
    @PostMapping("")
    public void save(@RequestBody Task task){
        taskService.save(task);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Task task,@PathVariable Integer id){
        taskService.update(id,task);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        taskService.delete(id);
    }
}
