package com.mx.CrudEmpleados.dominio.exception;

import lombok.Data;

@Data
public class MiExcepcion extends RuntimeException{
 
    public MiExcepcion(String mensaje) {
        super(mensaje); // Mensaje de error
       
    }



}
