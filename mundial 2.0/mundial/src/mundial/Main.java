package mundial;


import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {	
		
		//CREO LISTA DE EQUIPOS
		
		
		
		ArrayList<Pais> grupo_a = new ArrayList <Pais>();
		
		grupo_a.add(new Pais ("Qatar",2,false,"A"));
		grupo_a.add(new Pais ("Ecuador",3,false,"A"));
		grupo_a.add(new Pais ("Senegal",1,false,"A"));
		grupo_a.add(new Pais ("Paises Bajos",5,false,"A"));
		
		//encargado.modificarResultado(grupo_a.get(0));
		
		//LOS MUESTRO
		
		System.out.println("GRUPO A \n");
		
		
		for (Pais equipo : grupo_a) {
			System.out.println(equipo.getNombre());
		}
		
		System.out.println(" ");
		
		Encargado encargado = new Encargado(001,"Juan");
		
		
		
		
		
		
		
		
		
		//DEFINO QUIEN PASA
		
		
		String nombre=JOptionPane.showInputDialog("Ingresar 1er calificado");
		String nombre2=JOptionPane.showInputDialog("Ingresar 2do calificado");
		
		
		for (Pais equipo : grupo_a) {
			
			
			if (equipo.getNombre().equalsIgnoreCase(nombre) || equipo.getNombre().equalsIgnoreCase(nombre2)) {
				equipo.setEstado(true);
			} else {
				equipo.setEstado(false);
			}
			
		}
		
		
		for (int i = 0; i < grupo_a.size(); i++) {
			
			if (grupo_a.get(i).isEstado() == true) {
				System.out.println(grupo_a.get(i).getNombre() + " pasa a Octavos");
			} else {
				System.out.println(grupo_a.get(i).getNombre() + " fue eliminado"); 	
				
			}
		
		}
	
		
	
		
		
		ArrayList<Pais> grupo_b = new ArrayList <Pais>();
		
		grupo_b.add(new Pais ("Inglaterra",2,false,"B"));
		grupo_b.add(new Pais ("Iran",3,false,"B"));
		grupo_b.add(new Pais ("Usa",1,false,"B"));
		grupo_b.add(new Pais ("Gales",5,false,"B"));
		
			
			
		//LOS MUESTRO
		
		    	System.out.println("\nGRUPO B \n");
				
				
				for (Pais equipo : grupo_b) {
					System.out.println(equipo.getNombre());
				}
				
				System.out.println(" ");
				
				
				//DEFINO QUIEN PASA
				
				
				String nombre3=JOptionPane.showInputDialog("Ingresar 1er calificado");
				String nombre4=JOptionPane.showInputDialog("Ingresar 2do calificado");
				
				
				for (Pais equipo : grupo_b) {
					
					
					if (equipo.getNombre().equalsIgnoreCase(nombre3) || equipo.getNombre().equalsIgnoreCase(nombre4)) {
						equipo.setEstado(true);
					} else {
						equipo.setEstado(false);
					}
					
				}
				
				
				for (int i = 0; i < grupo_b.size(); i++) {
					
					if (grupo_b.get(i).isEstado() == true) {
						System.out.println(grupo_b.get(i).getNombre() + " pasa a Octavos");
					} else {
						System.out.println(grupo_b.get(i).getNombre() + " fue eliminado"); 	
						
					}
				
				}
			
		
		
		
		
		
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
