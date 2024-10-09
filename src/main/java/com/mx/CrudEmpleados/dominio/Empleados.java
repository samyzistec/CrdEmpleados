package com.mx.CrudEmpleados.dominio;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/* Lombok permite el ahorro de codigo repetitivo 
 * se traba con anotaciones 
 * 
 * */

@Entity  // reprenta una entidad de la base de datos
@Table(name="EMPLEADOS_JULIO24")// nombre de la base de datos 
@NoArgsConstructor // contructor vacio 
@AllArgsConstructor // contructor con parametros 
@ToString // tosptring 
@Getter
@Setter
@Data // encapsula tostring y ensulamiento 
public class Empleados {
	
	/*CREATE TABLE EMPLEADOS_JULIO24(
ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(50),
APP NVARCHAR2(50),
FECHA_NACIMIENTO DATE,
EDAD NUMBER,
DEPARTAMENTO NVARCHAR2(50),
FECHA_INGRESO DATE,
ANTIGUEDAD NUMBER,
SUELDO NUMBER
);
	 * 
	 * Mapeo de una base de datos relacional 
	 * ORM --> Object Relational Mapping 
	 * 
	 * 2.0.11 hacia bajo lo maneja javax 
	 * 3.o.1 hacia arriba lo maneja la libreria de jakarta 
	 * */
	
	@Id
	@Column(name="ID", columnDefinition = "NUMBER")
	int id;
	
	@Column(name="NOMBRE", columnDefinition = "NVARCHAR2(50)", length = 50)
	String nombre;
	
	@Column(name="APP", columnDefinition = "NVARCHAR2(50)", length = 50)
	String app;
	
	@Column(name="FECHA_NACIMIENTO", columnDefinition = "DATE")
	@JsonFormat(pattern = "dd/MM/yyyy", timezone = "America/Mexico_City")
	Date fechaNacimiento;
	
	@Column(name="EDAD", columnDefinition = "NUMBER")
	int edad;
	
	@Column(name="DEPARTAMENTO", columnDefinition = "NVARCHAR2(50)", length = 50)
	String departamento;
	
	@Column(name="FECHA_INGRESO", columnDefinition = "DATE")
	@JsonFormat(pattern = "dd/MM/yyyy", timezone = "America/Mexico_City")
	Date fechaIngreso;
	
	@Column(name="ANTIGUEDAD", columnDefinition = "NUMBER")
	int antiguedad;
	
	@Column(name="SUELDO", columnDefinition = "NUMBER")
	double sueldo;
	

// encapsulamiento 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	

}
