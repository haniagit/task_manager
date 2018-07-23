package com.example.Spring.dao;

import com.example.Spring.model.Task;

import java.util.List;

public interface TaskDao {

    List<Task> findAll();
    void add (Task task);
    Task findById(int id);
    void deleteById(int id);

    List<Task> finished();
    List<Task> unfinished();

    void update(Task task);
}
