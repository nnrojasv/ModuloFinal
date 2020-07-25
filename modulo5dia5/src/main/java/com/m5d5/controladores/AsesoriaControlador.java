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

import com.m5d5.dao.Asesoria;
import com.m5d5.servicio.IAsesoriaServicio;
 

@Controller
public class AsesoriaControlador {

	@Autowired
	IAsesoriaServicio daoas;
	
	static Logger log = Logger.getLogger(AsesoriaControlador.class.getName());
	
    @RequestMapping("/asform")    
    public String showform(Model m){    
        m.addAttribute("command", new Asesoria());  
        log.info("Ingreso a formulario de creación de asesoria");
        return "asform";
    } 

    @RequestMapping(value="/saveas",method = RequestMethod.POST)    
    public String save(@ModelAttribute("as") Asesoria as){    
        daoas.addAsesoria(as);
        log.info("Asesoria creado: " + as.toString());
        return "redirect:/viewas";
    }
    
    @RequestMapping("/viewas")    
    public String viewcli(Model m){    
        List<Asesoria> list=daoas.getAllAsesoria();
        m.addAttribute("listas",list);
        log.info("Listado de asesoria");
        return "viewas";
    }
    
    @RequestMapping(value="/editas/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Asesoria as=daoas.getAsesoriaById(id);
        m.addAttribute("command",as);
        log.info("Ingreso a edición de asesoria");
        return "aseditform";
    }

    @RequestMapping(value="/editsaveas",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("as") Asesoria as){
        daoas.updateAsesoria(as);
        log.info("Procesando edición de asesoria");
        return "redirect:/viewas";
    }

    @RequestMapping(value="/deleteas/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        daoas.deleteAsesoria(id);  
        log.debug("DEBUG - Asesoria eliminado");
        return "redirect:/viewas";
    }
    
}
