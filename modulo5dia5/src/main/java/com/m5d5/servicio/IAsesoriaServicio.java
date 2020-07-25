package com.m5d5.servicio;

import java.util.List;

import com.m5d5.dao.Asesoria;




public interface IAsesoriaServicio {

	 List<Asesoria> getAllAsesoria();
	 Asesoria getAsesoriaById(int asesoriaId);
	 void addAsesoria(Asesoria as);
	 void updateAsesoria(Asesoria as);
	 void deleteAsesoria(int asesoriaId);


}
