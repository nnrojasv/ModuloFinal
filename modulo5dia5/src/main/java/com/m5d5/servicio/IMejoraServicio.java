package com.m5d5.servicio;

import java.util.List;

import com.m5d5.dao.Mejoras;


public interface IMejoraServicio {

	 List<Mejoras> getAllMejora();
	 Mejoras getMejoraById(int mejoraId);
	 void addMejora(Mejoras mej);
	 void updateMejora(Mejoras mej);
	 void deleteMejora(int mejoraId);
	
}
