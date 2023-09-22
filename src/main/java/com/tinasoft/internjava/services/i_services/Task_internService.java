package com.tinasoft.internjava.services.i_services;

import com.tinasoft.internjava.models.entities.Task_intern;

import java.util.List;

public interface Task_internService {
    public abstract void save(Task_intern task_intern);
    public abstract void update(int id,Task_intern task_intern);
    public abstract void delete(int id);
    public abstract List<Task_intern> get_task_interns();
    public abstract Task_intern get_task_intern(int id);
}
