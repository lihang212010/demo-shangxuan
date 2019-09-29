package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Users;

public interface UsersIService {

	List<Users> findAllUsers(Integer pageIndex);
	Users findIdUsers(String id); 
	List<Users> findSexUsers(String sex,Integer pageIndex,Integer pagesize);
	List<Users> findMajorUsers(String major,Integer pageIndex,Integer pagesize);
	String insert(Users users);
	String update(Users users);
	String delete(String id);
	Integer SumAllUsers();
	Integer SumSexUsers(String sex);
	Integer SumMajorUsers(String major);
	
	
}
