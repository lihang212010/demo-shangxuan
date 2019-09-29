package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.example.demo.entity.Users;

@Mapper
public interface UsersMapper {

	  List<Users> findAllUsers(Integer pageIndex);
   Users findIdUsers(String id); 
   List<Users> findSexUsers(String sex,Integer pageIndex,Integer pagesize);
   List<Users> findMajorUsers(String major,Integer pageIndex,Integer pagesize);
   void insert(Users users);
   void update(Users users);
	  int delete(String id);
	  Integer SumAllUsers();
	  Integer SumSexUsers(String sex);
	  Integer SumMajorUsers(String major);
	
}
