package com.imfe.ejemploservices.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.imfe.ejercicioservices.model.Hamburguesa;

@Service
public class HamburguesaService {
	
	/*Creamos un método el cual si no le paso ningun número de burger
	 envia al metodo service de abajo el numero 1
	Este método me devuelve un arrayList de la clase Hamburguesa*/
	public List<Hamburguesa> service(){
		
		return this.service(1);
		
		
	}
	
	//Hacemos un método que me crea x hamburguesas
	public List<Hamburguesa> service (int numero){
		
		List<Hamburguesa> listaBurger= new ArrayList <Hamburguesa>();
		
		//Creamos tantas burger como me pidan
		for(int i=0; i<=numero; i++) {
			
			//Creamos el objeto directamente al añadir el contenido al array
			listaBurger.add(new Hamburguesa (i+"->"));
		}
		
		return listaBurger;
		
	}
	
	
	
	

}
