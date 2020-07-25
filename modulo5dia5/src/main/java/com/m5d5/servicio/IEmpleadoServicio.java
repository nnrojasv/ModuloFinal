package com.m5d5.servicio;

import java.util.List;

import com.m5d5.dao.Empleado;


public interface IEmpleadoServicio {

	 List<Empleado> getAllEmpleado();
	 Empleado getEmpleadoById(int empleadoId);
	 void addEmpleado(Empleado emp);
	 void updateEmpleado(Empleado emp);
	 void deleteEmpleado(int empleadoId);
	 List<Empleado> getEmpleadoByNombre(String empleadoNombre);
}
