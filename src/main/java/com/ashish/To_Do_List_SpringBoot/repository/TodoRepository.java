package com.ashish.To_Do_List_SpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<com.ashish.To_Do_List_SpringBoot.model.Todo, Long>{
	List<com.ashish.To_Do_List_SpringBoot.model.Todo> findByUserName(String user);
}
