package com.mx.CrudEmpleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudEmpleados.dominio.Empleados;
import com.mx.CrudEmpleados.service.Implementacion;

@RestController // indica que es una web service de tipo REST
@RequestMapping(path="Api/WebService") // mapea la peticion anivel de clase 
@CrossOrigin("*") // la cabecera del cors --> seguridad para que no me blque los navegadores cuando consuma la WS
public class WebService {
	
	
	@Autowired
	Implementacion imp;
	/*
	 * Metodo: Listar 
	 * method: GET 
	 * url: url del servidor + el path de clase + el valor del recuros 
	 * URL: http://localhost:9001/Api/WebService/listar
	 * contentType: aplicattion/json 
	 * data: json 
	 * */	
	@GetMapping(value="listar")
	public List<Empleados> listar(){		
		var lista = imp.listar();		
		return lista;
		
	}
	
	/*
	 * Metodo: guardar
	 * method: POST
	 * url: url del servidor + el path de clase + el valor del recuros 
	 * URL: http://localhost:9001/Api/WebService/guardar
	 * contentType: aplicattion/json 
	 * data: json 
	 * @RequestBody -> convierte un objeto en formato JSON 
	 * */
	@PostMapping(value="guardar")
	public void guardar(@RequestBody Empleados emplado){				
		imp.guardar(emplado);
	}

	/*
	 * Metodo: editar
	 * method: POST 
	 * url: url del servidor + el path de clase + el valor del recuros 
	 * URL: http://localhost:9001/Api/WebService/editar
	 * contentType: aplicattion/json 
	 * data: json 
	 * @RequestBody -> convierte un objeto en formato JSON 
	 * */
	@PostMapping(value="editar")
	public void editar(@RequestBody Empleados emplado){				
		imp.editar(emplado);
	}
	
	/*
	 * Metodo: eliminar
	 * method: POST 
	 * url: url del servidor + el path de clase + el valor del recuros 
	 * URL: http://localhost:9001/Api/WebService/eliminar
	 * contentType: aplicattion/json 
	 * data: json 
	 * @RequestBody -> convierte un objeto en formato JSON 
	 * */
	@PostMapping(value="eliminar")
	public void eliminar(@RequestBody Empleados emplado){				
		imp.eliminar(emplado);
	}
	/*
	 * Metodo: buscar
	 * method: POST 
	 * url: url del servidor + el path de clase + el valor del recuros 
	 * URL: http://localhost:9001/Api/WebService/buscar
	 * contentType: aplicattion/json 
	 * data: json 
	 * @RequestBody -> convierte un objeto en formato JSON 
	 * */
	@PostMapping(value="buscar")
	public Empleados buscar(@RequestBody Empleados emplado){
		return imp.buscar(emplado);				
		
	}
	
	
	
}
