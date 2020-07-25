package com.m5d5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5d5.dao.Visitas;
import com.m5d5.dao.VisitaRepositorio;

@Service
public class VisitaServImpl implements IVisitaServicio {

	@Autowired 
	VisitaRepositorio daovis;

	

	@Override
	public Visitas getVisitaById(int visitaId) {
		// TODO Auto-generated method stub
		return daovis.findOne(visitaId);
	}

	@Override
	public void addVisita(Visitas vis) {
		daovis.save(vis);
		
	}

	@Override
	public void updateVisita(Visitas vis) {
		daovis.save(vis);
		
	}

	@Override
	public void deleteVisita(int visitaId) {
		daovis.delete(visitaId);
		
	}

	@Override
	public List<Visitas> getAllVisita() {
		// TODO Auto-generated method stub
		return (List<Visitas>) daovis.findAll();
	}


}
