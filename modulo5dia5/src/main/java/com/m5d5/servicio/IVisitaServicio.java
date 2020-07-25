package com.m5d5.servicio;

import java.util.List;

import com.m5d5.dao.Visitas;


public interface IVisitaServicio {

	 List<Visitas> getAllVisita();
	 Visitas getVisitaById(int visitaId);
	 void addVisita(Visitas vis);
	 void updateVisita(Visitas vis);
	 void deleteVisita(int visitaId);
	
}
