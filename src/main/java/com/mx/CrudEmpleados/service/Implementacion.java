package com.mx.CrudEmpleados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmpleados.dao.EmpladosDao;
import com.mx.CrudEmpleados.dominio.Empleados;

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

		for (Empleados e : dao.findAll()) {
			if (e.getNombre().equalsIgnoreCase(empleado.getNombre())
					&& e.getApp().equalsIgnoreCase(empleado.getApp())) {
				System.out.println("El empleado ya esta registrado");
			} else {
				dao.save(empleado);
				System.out.println("Se guardo el empleado");
			}
		}
	}

	@Override
	public void editar(Empleados empleado) {
		// TODO Auto-generated method stub
		dao.save(empleado);
		System.out.println("Se edito el empleado");

	}

	@Override
	public void eliminar(Empleados empleado) {
		// TODO Auto-generated method stub
		dao.delete(empleado);
		System.out.println("Se elimino el empleado");
	}

	@Override
	public Empleados buscar(Empleados empleado) {
		Empleados emplBuscar = dao.findById(empleado.getId()).orElse(null);
		return emplBuscar;
	}

	@Override
	public List<Empleados> listar() {
		// TODO Auto-generated method stub
		return (List<Empleados>) dao.findAll();
	}

}
