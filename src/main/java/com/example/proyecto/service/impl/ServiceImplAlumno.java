package com.example.proyecto.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.proyecto.entity.Alumno;
import com.example.proyecto.repository.RepositoryAlumno;
import com.example.proyecto.service.ServiceAlumno;
import jakarta.transaction.Transactional;

@Service("alumnoServiceImpl")
@Transactional
public class ServiceImplAlumno implements ServiceAlumno {
	@Autowired
	@Qualifier("alumnoRepository")
	private RepositoryAlumno repositoryAlumno;
	
	@Override
	public List<Alumno> listAllAlumno() {
		// TODO Auto-generated method stub
		return (List<Alumno>) repositoryAlumno.findAll();
	}

}
