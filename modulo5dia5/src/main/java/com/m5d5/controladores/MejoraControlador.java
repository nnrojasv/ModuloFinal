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

import com.m5d5.dao.Mejoras;
import com.m5d5.servicio.IMejoraServicio;   

@Controller
public class MejoraControlador {

	@Autowired
	IMejoraServicio daomj;
	
	static Logger log = Logger.getLogger(MejoraControlador.class.getName());
	
    @RequestMapping("/mejform")    
    public String showform(Model m){    
        m.addAttribute("command", new Mejoras());
        log.info("Ingreso a formulario de creación de mejoras");
        return "mejform";
    } 

    @RequestMapping(value="/savemj",method = RequestMethod.POST)    
    public String save(@ModelAttribute("mj") Mejoras mj){    
        daomj.addMejora(mj);
        log.info("Mejora creada: " + mj.toString());
        return "redirect:/viewmej";
    }
    
    @RequestMapping("/viewmej")    
    public String viewcli(Model m){    
        List<Mejoras> list=daomj.getAllMejora();
        m.addAttribute("listmj",list);  
        log.info("Listado de mejoras");
        return "viewmej";
    }
    
    @RequestMapping(value="/editmj/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Mejoras mj=daomj.getMejoraById(id);
        m.addAttribute("command",mj);
        log.info("Ingreso a edición de mejoras");
        return "mejeditform";
    }

    @RequestMapping(value="/editsavemj",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("mj") Mejoras mj){
        daomj.updateMejora(mj);
        log.info("Procesando edición de mejoras");
        return "redirect:/viewmej";
    }

    @RequestMapping(value="/deletemj/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        daomj.deleteMejora(id); 
        log.debug("DEBUG - Mejora eliminada");
        return "redirect:/viewmej";
    }
    
}
