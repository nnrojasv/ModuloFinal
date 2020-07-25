package com.m5d5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5d5.dao.Accidentes;
import com.m5d5.dao.AccidenteRepositorio;

@Service
public class AccidenteServImpl implements IAccidenteServicio {

	@Autowired 
	AccidenteRepositorio daoacc;

	@Override
	public List<Accidentes> getAllAccidente() {
		// TODO Auto-generated method stub
		return (List<Accidentes>) daoacc.findAll();
	}

	@Override
	public Accidentes getAccidenteById(int accidenteId) {
		// TODO Auto-generated method stub
		return daoacc.findOne(accidenteId);
	}

	public void addAccidente(Accidentes accidente) {
		// TODO Auto-generated method stub
		daoacc.save(accidente);
	}

	@Override
	public void updateAccidente(Accidentes accidente) {
		// TODO Auto-generated method stub
		daoacc.save(accidente);
	}

	@Override
	public void deleteAccidente(int accidenteId) {
		// TODO Auto-generated method stub
		daoacc.delete(accidenteId);
	}

	
}
