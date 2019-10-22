package com.todoapp.service.impl;

import com.todoapp.model.entity.ToDo;
import com.todoapp.repository.ToDoRepository;
import com.todoapp.service.ToDoService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ToDoServiceImpl implements ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }


    @Override
    public ToDo save(ToDo todo) {
        todo.setCreated_at(new Date());
        return toDoRepository.save(todo);
    }

    @Override
    public ToDo findById(Long id) {
        Optional<ToDo> todo = toDoRepository.findById(id);
        return todo.orElse(null);
    }

    @Override
    @Transactional
    public Long deleteById(Long id) {
        toDoRepository.deleteById(id);
        return id;
    }

    @Override
    public Long disableById(Long id) {
        return null;
    }

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }
}
