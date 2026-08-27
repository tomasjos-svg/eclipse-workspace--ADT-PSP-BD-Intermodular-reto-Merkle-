package com.practica.gestionempresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.gestionempresa.model.Departamento;
import com.practica.gestionempresa.model.Empleado;

public interface EmpleadoRepository
        extends JpaRepository<Empleado, Long> {

    List<Empleado> findByDepartamento(Departamento departamento);

    boolean existsByDepartamento(Departamento departamento);
}