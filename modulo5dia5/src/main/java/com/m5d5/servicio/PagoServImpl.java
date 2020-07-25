package com.m5d5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5d5.dao.Pago;
import com.m5d5.dao.PagoRepositorio;


@Service
public class PagoServImpl implements IPagoServicio {

	@Autowired 
	PagoRepositorio daopa;

	@Override
	public List<Pago> getAllPago() {
		// TODO Auto-generated method stub
		return (List<Pago>) daopa.findAll();
	}

	@Override
	public Pago getPagoById(int pagoId) {
		// TODO Auto-generated method stub
		return daopa.findOne(pagoId);
	}

	public void addPago(Pago pago) {
		// TODO Auto-generated method stub
		daopa.save(pago);
	}

	@Override
	public void updatePago(Pago pago) {
		// TODO Auto-generated method stub
		daopa.save(pago);
	}

	@Override
	public void deletePago(int pagoId) {
		// TODO Auto-generated method stub
		daopa.delete(pagoId);
	}

	
}
