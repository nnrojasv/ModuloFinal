package com.m5d5.servicio;

import java.util.List;

import com.m5d5.dao.Pago;


public interface IPagoServicio {

	 List<Pago> getAllPago();
	 Pago getPagoById(int pagoId);
	 void addPago(Pago pago);
	 void updatePago(Pago pago);
	 void deletePago(int pagoId);
	
}
