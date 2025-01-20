package com.mx.CrudEmpleados.service;

import java.util.List;

import com.mx.CrudEmpleados.dominio.dto.Empleados;

public interface Metodos {
	
	
	public void guardar(Empleados empleado);
	public void editar(Empleados empleado);
	public void eliminar(Empleados empleado);
	
	public Empleados buscar(Empleados empleado);
	public List<Empleados> listar();

}
