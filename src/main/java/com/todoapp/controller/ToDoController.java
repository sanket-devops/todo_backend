package com.todoapp.controller;

import com.todoapp.model.entity.ToDo;
import com.todoapp.service.ToDoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/toDo")
public class ToDoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }


    @ApiOperation(value = "create Note History", notes = "create Note History")
    @ApiResponses(value = {@ApiResponse(code = 401, message = "INVALID_TOKEN")})
    @PostMapping()
    public ToDo create(@RequestBody ToDo todo) {
        return toDoService.save(todo);
    }

    @ApiOperation(value = "create Note History", notes = "create Note History")
    @ApiResponses(value = {@ApiResponse(code = 401, message = "INVALID_TOKEN")})
    @GetMapping()
    public List<ToDo> getAll() {
        return toDoService.findAll();
    }

    @ApiOperation(value = "create Note History", notes = "create Note History")
    @ApiResponses(value = {@ApiResponse(code = 401, message = "INVALID_TOKEN")})
    @GetMapping("/{id}")
    public ToDo getById(@PathVariable Long id) {
        ToDo todo = toDoService.findById(id);
        return todo;
    }

    @ApiOperation(value = "create Note History", notes = "create Note History")
    @ApiResponses(value = {@ApiResponse(code = 401, message = "INVALID_TOKEN")})
    @PutMapping()
    public ToDo put(@RequestBody ToDo todo) {
        return toDoService.save(todo);
    }

    @ApiOperation(value = "create Note History", notes = "create Note History")
    @ApiResponses(value = {@ApiResponse(code = 401, message = "INVALID_TOKEN")})
    @DeleteMapping("/{id}")
    public Long delete(@PathVariable Long id) {
        return toDoService.deleteById(id);
    }


}
