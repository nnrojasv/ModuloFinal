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

import com.m5d5.dao.Accidentes;
import com.m5d5.servicio.IAccidenteServicio;


@Controller
public class AccidenteControlador {

	@Autowired
	IAccidenteServicio daoacc;
	
	static Logger log = Logger.getLogger(AccidenteControlador.class.getName());
	
    @RequestMapping("/accform")    
    public String showform(Model m){    
        m.addAttribute("command", new Accidentes());  
        log.info("Ingreso formulario de creacion de Accidente");
        return "accform";
    } 

    @RequestMapping(value="/saveacc",method = RequestMethod.POST)    
    public String save(@ModelAttribute("acc") Accidentes acc){    
        daoacc.addAccidente(acc);
        log.info("Accidente creado: " + acc.toString());
        return "redirect:/viewacc";
    }
    
    @RequestMapping("/viewacc")    
    public String viewcli(Model m){    
        List<Accidentes> list=daoacc.getAllAccidente();
        m.addAttribute("listacc",list);  
        log.info("Listado de accidentes");
        return "viewacc";
    }
    
    @RequestMapping(value="/editacc/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Accidentes acc=daoacc.getAccidenteById(id);
        m.addAttribute("command",acc);
        log.info("Ingreso a edición de accidentes");
        return "acceditform";
    }

    @RequestMapping(value="/editsaveacc",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("acc") Accidentes acc){
        daoacc.updateAccidente(acc);
        log.info("Procesando edición de accidente");
        return "redirect:/viewacc";
    }

    @RequestMapping(value="/deleteacc/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        daoacc.deleteAccidente(id);   
        log.debug("DEBUG - Accidente eliminado");
        return "redirect:/viewacc";
    }
    
}
