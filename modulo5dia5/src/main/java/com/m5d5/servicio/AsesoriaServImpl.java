package com.m5d5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5d5.dao.Asesoria;
import com.m5d5.dao.AsesoriaRepositorio;




@Service
public class AsesoriaServImpl implements IAsesoriaServicio {

	@Autowired 
	AsesoriaRepositorio daoas;

	@Override
	public List<Asesoria> getAllAsesoria() {
		// TODO Auto-generated method stub
		return (List<Asesoria>) daoas.findAll();
	}

	@Override
	public Asesoria getAsesoriaById(int asesoriaId) {
		// TODO Auto-generated method stub
		return daoas.findOne(asesoriaId);
	}

	public void addAsesoria(Asesoria asesoria) {
		// TODO Auto-generated method stub
		daoas.save(asesoria);
	}

	@Override
	public void updateAsesoria(Asesoria asesoria) {
		// TODO Auto-generated method stub
		daoas.save(asesoria);
	}

	@Override
	public void deleteAsesoria(int asesoriaId) {
		// TODO Auto-generated method stub
		daoas.delete(asesoriaId);
	}



	

	
}
