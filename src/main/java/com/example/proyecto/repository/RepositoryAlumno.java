package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.proyecto.entity.Alumno;

@Repository("alumnoRepository")
public interface RepositoryAlumno extends CrudRepository<Alumno,String>{
	
}
