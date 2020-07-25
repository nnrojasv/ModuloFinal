package com.m5d5.servicio;

import java.util.List;

import com.m5d5.dao.Capacitaciones;


public interface ICapacitacionServicio {

	 List<Capacitaciones> getAllCapacitacion();
	 Capacitaciones getCapacitacionById(int capacitacionId);
	 void addCapacitacion(Capacitaciones cap);
	 void updateCapacitacion(Capacitaciones cap);
	 void deleteCapacitacion(int capacitacionId);
	
}
