package com.m5d5.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.m5d5.dao.Capacitaciones;
import com.m5d5.servicio.ICapacitacionServicio;


@Controller
public class CapacitacionControlador {

	@Autowired
	ICapacitacionServicio daocap;
	
	static Logger log = Logger.getLogger(CapacitacionControlador.class.getName());
	
    @RequestMapping("/capform")    
    public String showform(Model m){    
        m.addAttribute("command", new Capacitaciones());  
        log.info("Ingreso formulario de creacion de Capacitacion");
        return "capform";
    } 

    @RequestMapping(value="/savecap",method = RequestMethod.POST)    
    public String save(@ModelAttribute("cap") Capacitaciones cap){    
        daocap.addCapacitacion(cap);
        log.info("Capacitacion creado: " + cap.toString());
        return "redirect:/viewcap";
    }
    
    @RequestMapping("/viewcap")    
    public String viewcli(Model m){    
        List<Capacitaciones> list=daocap.getAllCapacitacion();
        m.addAttribute("listcap",list);  
        log.info("Listado de capacitaciones");
        return "viewcap";
    }
    
    @RequestMapping(value="/editcap/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Capacitaciones cap=daocap.getCapacitacionById(id);
        m.addAttribute("command",cap);
        log.info("Ingreso a edición de capacitacion");
        return "capeditform";
    }

    @RequestMapping(value="/editsavecap",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("cap") Capacitaciones cap){
        daocap.updateCapacitacion(cap);
        log.info("Procesando edición de capacitacion");
        return "redirect:/viewcap";
    }

    @RequestMapping(value="/deletecap/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        daocap.deleteCapacitacion(id);  
        log.debug("DEBUG - Capacitacion eliminado");
        return "redirect:/viewcap";
    }
    
}
