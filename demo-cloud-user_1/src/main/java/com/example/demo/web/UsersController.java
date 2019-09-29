package com.example.demo.web;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UsersMapper;
import com.example.demo.entity.Users;
import com.example.demo.serviceImpl.UsersService;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@MapperScan("com.example.demo.dao")
public class UsersController {

	@Autowired
	UsersService usersService;
	


	 @RequestMapping("/")
	 public String index() {
		 return "forward:index.html"; 
		 } 

	
	
	@ResponseBody
	@PostMapping("all")
	public List<Users> findAllUsers(int pageIndex) {		
		return usersService.findAllUsers((pageIndex-1)*5);
	}
	
	@ResponseBody
	@PostMapping("users")
	public Users findIdUsers(String id) {
		return usersService.findIdUsers(id);
		}
	
	@ResponseBody
	@PostMapping("sex")
	public List<Users> findSexUsers(String sex,int pageIndex,int pagesize) {
		return usersService.findSexUsers(sex,pageIndex,pagesize);
	}
	
	@ResponseBody
	@PostMapping("major")
	public List<Users> findMajorUsers(String major,int pageIndex,int pagesize){
		return usersService.findMajorUsers(major, pageIndex, pagesize);
	}
	
	@ResponseBody
	@PostMapping("insert")
	public String insert(Users users) {
		return usersService.insert(users);
	}
	
	@ResponseBody
	@PutMapping("update")
	public String update(Users users) {
		return usersService.update(users);
	}
	
	@ResponseBody
	@DeleteMapping("delete")
	public String delete(String id) {
		return	usersService.delete(id);
	}
	
	@ResponseBody
	@RequestMapping("allSum")
	public Integer sumAllUsers() {
		return usersService.SumAllUsers();
	}
	
	@ResponseBody
	@RequestMapping("sexSum")
	public Integer sumSexUsers(String sex) {
		return usersService.SumSexUsers(sex);
	}
	
	@ResponseBody
	@RequestMapping("majorSum")
	public Integer sumMajorUsers(String major) {
		return usersService.SumMajorUsers(major);
	}
	
	
	
}
