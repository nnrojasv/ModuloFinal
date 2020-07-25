package com.m5d5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5d5.dao.Empleado;
import com.m5d5.dao.EmpleadoRepositorio;

@Service
public class EmpleadoServImpl implements IEmpleadoServicio {

	@Autowired 
	EmpleadoRepositorio daoemp;

	@Override
	public List<Empleado> getAllEmpleado() {
		// TODO Auto-generated method stub
		return (List<Empleado>) daoemp.findAll();
	}

	@Override
	public Empleado getEmpleadoById(int empleadoId) {
		// TODO Auto-generated method stub
		return daoemp.findOne(empleadoId);
	}

	public void addEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		daoemp.save(empleado);
	}

	@Override
	public void updateEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		daoemp.save(empleado);
	}

	@Override
	public void deleteEmpleado(int empleadoId) {
		// TODO Auto-generated method stub
		daoemp.delete(empleadoId);
	}

	@Override
	public List<Empleado> getEmpleadoByNombre(String empleadoNombre) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
