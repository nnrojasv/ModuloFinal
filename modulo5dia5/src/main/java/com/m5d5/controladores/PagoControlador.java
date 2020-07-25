package com.m5d5.controladores;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.m5d5.dao.Pago;
import com.m5d5.servicio.IPagoServicio;

@Controller
public class PagoControlador {

	@Autowired
	IPagoServicio daopao;

	static Logger log = Logger.getLogger(PagoControlador.class.getName());

	@RequestMapping("/pagoform")    
    public String showform(Model m){
        m.addAttribute("command", new Pago());
        log.info("Ingreso a formulario de creación de pagos");
        return "pagoform";
    } 

    @RequestMapping(value="/savepago",method = RequestMethod.POST)    
    public String save(@ModelAttribute("pago") Pago pago){
        daopao.addPago(pago);
        log.info("Pago creado: " + pago.toString());
        return "redirect:/pagoform";
    }
	

	
}
