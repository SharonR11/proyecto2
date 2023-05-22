package com.example.proyecto.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.entity.Alumno;
import com.example.proyecto.service.impl.ServiceImplAlumno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping("/alumno")
@CrossOrigin(origins="*")//tambien se puede usar localhost
public class ControllerAlumno {
	@Autowired
	@Qualifier("alumnoServiceImpl")
	private ServiceImplAlumno alumnoService;
	
	@GetMapping(path="/list/",produces= {"application/json"})
	public List<Alumno> listAlumno(){
		return alumnoService.listAllAlumno();
		
	}
}
