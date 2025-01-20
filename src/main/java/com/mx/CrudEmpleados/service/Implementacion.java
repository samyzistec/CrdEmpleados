package com.mx.CrudEmpleados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmpleados.dao.EmpladosDao;
import com.mx.CrudEmpleados.dominio.dto.Empleados;
import com.mx.CrudEmpleados.dominio.exception.MiExcepcion;

@Service // indica que esta clase representa la logica de una aplicacion
public class Implementacion implements Metodos {

	/*
	 * La inyeccion de dependencias -> se utiliza el ambito singgleton --> crear una
	 * unica instancia dentro del conenetor de spring y se comparte en toda la
	 * aplicacion y de esa manera ya no estamos inicializando objetos
	 * 
	 */
	
	
	
	

	@Autowired
	EmpladosDao dao;

	@Override
	public void guardar(Empleados empleado) {
		// TODO Auto-generated method stub
try{
		for (Empleados e : dao.findAll()) {
			if (e.getNombre().equalsIgnoreCase(empleado.getNombre())
					&& e.getApp().equalsIgnoreCase(empleado.getApp())) {
				System.out.println("El empleado ya esta registrado");
			} else {
				dao.save(empleado);
				System.out.println("Se guardo el empleado");
			}
		}
	}catch(Exception e){
		throw new MiExcepcion("Error de compilacion");
	}

	}

	@Override
	public void editar(Empleados empleado) {
		// TODO Auto-generated method stub
		dao.save(empleado);
		System.out.println("Se edito el empleado");
		throw new MiExcepcion("Error de compilacion");

	}

	@Override
	public void eliminar(Empleados empleado) {
		// TODO Auto-generated method stub
		dao.delete(empleado);
		System.out.println("Se elimino el empleado");
		throw new MiExcepcion("Error de compilacion");
	}

	@Override
	public Empleados buscar(Empleados empleado) {
		try{
		Empleados emplBuscar = dao.findById(empleado.getId()).orElse(null);
		return emplBuscar;
		}catch(Exception e){
		throw new MiExcepcion("Error de compilacion");
		}
	}

	@Override
	public List<Empleados> listar() {
		// TODO Auto-generated method stub
		try{
		return (List<Empleados>) dao.findAll();
		}catch(Exception e){
			throw new MiExcepcion("Error de compilacion");
		}
	}

}
