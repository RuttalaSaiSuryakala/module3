package com.example.TDSController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TDSService.TDSService;
import com.example.model.TDSModel;

import uiexception.UserNotFoundException;

@RestController
public class TDSController {
@Autowired
TDSService tdsservice;
@GetMapping("/")
public String display()
{
	return "hello";
}

@GetMapping("/getByDepartmentId/{id}")
public TDSModel getByDeptid(@PathVariable int id) {
	TDSModel TDSModel=tdsservice.getByDepartmentid(id);
	if(TDSModel==null) {
		throw new UserNotFoundException("ID not found wrong ID : "+id);
	}
	else
		return TDSModel;
}

	
}
