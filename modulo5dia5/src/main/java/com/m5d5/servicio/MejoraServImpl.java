package com.m5d5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5d5.dao.Mejoras;
import com.m5d5.dao.MejoraRepositorio;




@Service
public class MejoraServImpl implements IMejoraServicio {

	@Autowired 
	MejoraRepositorio daomej;

	@Override
	public List<Mejoras> getAllMejora() {
		// TODO Auto-generated method stub
		return (List<Mejoras>) daomej.findAll();
	}

	@Override
	public Mejoras getMejoraById(int mejoraId) {
		// TODO Auto-generated method stub
		return daomej.findOne(mejoraId);
	}

	public void addMejora(Mejoras mej) {
		// TODO Auto-generated method stub
		daomej.save(mej);
	}

	@Override
	public void updateMejora(Mejoras mejora) {
		// TODO Auto-generated method stub
		daomej.save(mejora);
	}

	@Override
	public void deleteMejora(int mejId) {
		// TODO Auto-generated method stub
		daomej.delete(mejId);
	}


}
