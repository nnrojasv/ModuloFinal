package com.m5d5.servicio;

import java.util.List;

import com.m5d5.dao.Accidentes;






public interface IAccidenteServicio {

	 List<Accidentes> getAllAccidente();
	 Accidentes getAccidenteById(int accidenteId);
	 void addAccidente(Accidentes acc);
	 void updateAccidente(Accidentes acc);
	 void deleteAccidente(int AccidenteId);
	
}
