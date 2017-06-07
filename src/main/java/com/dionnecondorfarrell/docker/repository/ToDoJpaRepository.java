package com.dionnecondorfarrell.docker.repository;

import com.dionnecondorfarrell.docker.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Dionne on 04/06/2017.
 */
@Repository
@Transactional
public interface ToDoJpaRepository extends JpaRepository<ToDoItem,Long> {

}
