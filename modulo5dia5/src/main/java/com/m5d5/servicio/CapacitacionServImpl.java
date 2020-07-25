package com.m5d5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5d5.dao.Capacitaciones;
import com.m5d5.dao.CapacitacionRepositorio;

@Service
public class CapacitacionServImpl implements ICapacitacionServicio {

	@Autowired 
	CapacitacionRepositorio daocap;

	@Override
	public List<Capacitaciones> getAllCapacitacion() {
		// TODO Auto-generated method stub
		return (List<Capacitaciones>) daocap.findAll();
	}

	@Override
	public Capacitaciones getCapacitacionById(int capacitacionId) {
		// TODO Auto-generated method stub
		return daocap.findOne(capacitacionId);
	}

	public void addCapacitacion(Capacitaciones capacitacion) {
		// TODO Auto-generated method stub
		daocap.save(capacitacion);
	}

	@Override
	public void updateCapacitacion(Capacitaciones capacitacion) {
		// TODO Auto-generated method stub
		daocap.save(capacitacion);
	}

	@Override
	public void deleteCapacitacion(int capacitacionId) {
		// TODO Auto-generated method stub
		daocap.delete(capacitacionId);
	}

	
}
