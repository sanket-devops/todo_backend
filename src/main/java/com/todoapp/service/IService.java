package com.todoapp.service;

public interface IService<T> {
    T save(T entity);

    T findById(Long id);

    Long deleteById(Long id);

    Long disableById(Long id);
}
