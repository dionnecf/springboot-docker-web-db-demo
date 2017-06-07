package com.dionnecondorfarrell.docker.controller;

import com.dionnecondorfarrell.docker.model.ToDoItem;
import com.dionnecondorfarrell.docker.repository.ToDoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Dionne on 04/06/2017.
 */
@RestController
@RequestMapping("/")
public class ToDoController {

    @Autowired
    private ToDoJpaRepository toDoJpaRepository;

    @GetMapping("/todos")
    public List<ToDoItem> getToDoItems(){
        return toDoJpaRepository.findAll();
    }

    @PostMapping("/todo")
    public ToDoItem createToDoItem(@RequestBody ToDoItem toDoItem){
        return toDoJpaRepository.save(toDoItem);
    }

    @GetMapping("/todo/{id}")
    public ToDoItem find(@PathVariable final Long id){
        return toDoJpaRepository.findOne(id);
    }


}
