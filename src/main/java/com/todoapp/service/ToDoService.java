package com.todoapp.service;

import com.todoapp.model.entity.ToDo;

import java.util.List;

public interface ToDoService extends IService<ToDo> {

    ToDo save(ToDo todo);

    List<ToDo> findAll();
}
