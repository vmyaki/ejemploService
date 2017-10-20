package com.imfe.ejercicioservices.controllers;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imfe.ejemploservices.services.HamburguesaService;
import com.imfe.ejercicioservices.model.Hamburguesa;



@Controller
public class HomeController {
	
	@RequestMapping(value="/")
		public String home () {
			return "index";
		}
	
	@RequestMapping(value="/dame")
	public String consulta(Model model ,@RequestParam("numero") Integer numero) {
		
		//Creamos un servicio
		HamburguesaService rdo = new HamburguesaService();
		
		//Llamamos al metodo service y metemos en un array el resultado
		
		/*En el caso de quere solo una burger ejecutamos esto
		List<Hamburguesa> lista=rdo.service();*/
		
		//Si le pasamos un numero me creará tantas burger como le digamos
		 List<Hamburguesa> lista=rdo.service(numero);
		
		//Madamos al index dentro de la variable 'resultado' la lista de burger
		model.addAttribute("resultado", lista);
		
		return "index";
		
	}
	
	
	
}




