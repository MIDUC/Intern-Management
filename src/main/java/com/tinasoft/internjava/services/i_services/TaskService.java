package com.tinasoft.internjava.services.i_services;

import com.tinasoft.internjava.models.entities.Task;

import java.util.List;

public interface TaskService {
    public abstract void save(Task task);
    public abstract void delete(Integer id);
    public abstract void update(Integer id ,Task task);
    public abstract Task get_task(Integer id);
    public abstract List<Task> get_tasks();
}
