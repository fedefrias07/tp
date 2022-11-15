package mundial;


import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {	
		
		
		//CREO LISTA DE EQUIPOS
		
		ArrayList<Pais> equipos = new ArrayList <Pais>();
		
		
		equipos.add(new Pais ("Qatar",2,false,"A"));
		equipos.add(new Pais ("Ecuador",3,false,"A"));
		equipos.add(new Pais ("Senegal",1,false,"A"));
		equipos.add(new Pais ("Paises Bajos",5,false,"A"));
		
		equipos.add(new Pais ("Inglaterra",2,false,"B"));
		equipos.add(new Pais ("Iran",3,false,"B"));
		equipos.add(new Pais ("Usa",1,false,"B"));
		equipos.add(new Pais ("Gales",5,false,"B"));
		
		equipos.add(new Pais ("Argentina",2,false,"C"));
		equipos.add(new Pais ("Arabia Saudita",3,false,"C"));
		equipos.add(new Pais ("Mexico",1,false,"C"));
		equipos.add(new Pais ("Polonia",5,false,"C"));
		
		equipos.add(new Pais ("Francia",2,false,"D"));
		equipos.add(new Pais ("Australia",3,false,"D"));
		equipos.add(new Pais ("Dinamarca",1,false,"D"));
		equipos.add(new Pais ("Tunez",5,false,"D"));
		
		equipos.add(new Pais ("España",2,false,"E"));
		equipos.add(new Pais ("Costa Rica",3,false,"E"));
		equipos.add(new Pais ("Alemania",1,false,"E"));
		equipos.add(new Pais ("Japon",5,false,"E"));
		
		equipos.add(new Pais ("Belgica",2,false,"F"));
		equipos.add(new Pais ("Canada",3,false,"F"));
		equipos.add(new Pais ("Marruecos",1,false,"F"));
		equipos.add(new Pais ("Croacia",5,false,"F"));
		
		equipos.add(new Pais ("Brazil",2,false,"G"));
		equipos.add(new Pais ("Serbia",3,false,"G"));
		equipos.add(new Pais ("Suiza",1,false,"G"));
		equipos.add(new Pais ("Camerun",5,false,"G"));
		
		equipos.add(new Pais ("Portugal",2,false,"H"));
		equipos.add(new Pais ("Ghana",3,false,"H"));
		equipos.add(new Pais ("Uruguay",1,false,"H"));
		equipos.add(new Pais ("Corea del Sur",5,false,"H"));
		
		
		Encargado encargado = new Encargado(001,"Juan");
		
		
		for (int i = 0; i < equipos.size(); i++) {
			
			encargado.cargarPartido(equipos.get(i), equipos.get(i+1));
			encargado.cargarPartido(equipos.get(i+2), equipos.get(i+3));
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
			
		
		
		
		
		
		
		
		
		
		
		//DEFINO QUIEN PASA
		
		
		//String nombre=JOptionPane.showInputDialog("Ingresar 1er calificado");
		//String nombre2=JOptionPane.showInputDialog("Ingresar 2do calificado");
		
		
		
	
		
	
		
		
	
		
			
			
	
				
				
				
			
		
		
		
		
		
		//MOSTRAR LISTA CON FOR
		
		//for (int i = 0; i < grupo_a.size(); i++) {
		//	System.out.println(grupo_a.get(i).getNombre());
		//}
		
		
		//MOSTRAR LISTA CON FOREACH
		
		//for (Pais equipo : grupo_a) {
		//	System.out.println(equipo.getNombre());
		//}
		
	
		
		//ELIMINAR DESCALIFICADOS
		
		//for (int i = 0; i < grupo_a.size(); i++) {
			
		//	if (grupo_a.get(i).isEstado() == true) {
		//		System.out.println(grupo_a.get(i).getNombre() + " paso a octavos");
		//	} else {
		//		System.out.println(grupo_a.get(i).getNombre() + " fue eliminado");
		//	}
		//}
		
		
	
	}

}
