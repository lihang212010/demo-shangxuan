package com.example.demo.serviceImpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UsersMapper;
import com.example.demo.entity.Users;
import com.example.demo.service.UsersIService;

@Service
public class UsersService implements UsersIService {

	@Autowired
	UsersMapper usersMapper;
	
	@Override
	public List<Users> findAllUsers(Integer pageIndex) {	
		return usersMapper.findAllUsers(pageIndex);
	}

	@Override
	public Users findIdUsers(String id) {
		return usersMapper.findIdUsers(id);
	}

	@Override
	public List<Users> findSexUsers(String sex,Integer pageIndex,Integer pagesize) {
		return usersMapper.findSexUsers(sex,(pageIndex-1)*pagesize,pagesize);
	}

	@Override
	public List<Users> findMajorUsers(String major,Integer pageIndex,Integer pagesize) {
		return usersMapper.findMajorUsers(major,(pageIndex-1)*pagesize,pagesize);
	}

	@Override
	public String insert(Users users) {
		try {
			usersMapper.insert(users);
			return "successed";
		} catch (Exception e) {	
			return "failed";
		}
         

	}

	@Override
	public String update(Users users) {
	try {
		usersMapper.update(users);
		return "successed";
	} catch (Exception e) {
		System.out.print(e);
		return "failed";
	}
	}

	@Override
	public String delete(String id) {
	try {
		int i=usersMapper.delete(id);
		if(i>=1) {
		return "successed";}
		else {
			return "id不存在";
			}
	} catch (Exception e) {
		return "failed";
	}
	}

	@Override
	public Integer SumAllUsers() {
		return usersMapper.SumAllUsers();
	}

	@Override
	public Integer SumSexUsers(String sex) {
   return usersMapper.SumSexUsers(sex);
	}

	@Override
	public Integer SumMajorUsers(String major) {
      return usersMapper.SumMajorUsers(major);
	}

}
