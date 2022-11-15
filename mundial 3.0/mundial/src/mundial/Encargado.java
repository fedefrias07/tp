package mundial;

import java.util.ArrayList;
import java.util.Scanner;

public class Encargado {
	private int id_encargado;
	private String nombre;
	
	public Encargado(int id_encargado, String nombre) {
		super();
		this.id_encargado = id_encargado;
		this.nombre = nombre;
	}

	public int getId_encargado() {
		return id_encargado;
	}

	public void setId_encargado(int id_encargado) {
		this.id_encargado = id_encargado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	@Override
	public String toString() {
		return "Encargado [id_encargado=" + id_encargado + ", nombre=" + nombre + "]";
	}
	
	
	public Partido cargarPartido(Pais pais1, Pais pais2) {
		
		
		int GOLES1 = (int)(Math.random()*10);
		int GOLES2 = (int)(Math.random()*10);
		Partido partidonuevo = new Partido(pais1, pais2,90,GOLES1,GOLES2);
		
		
		System.out.println(partidonuevo.getPais1().getNombre() + " vs " + partidonuevo.getPais2().getNombre() +
				"\nDuracion de partido: " + partidonuevo.getDuracion() + 
				"\nResultado:\n" + partidonuevo.getPais1().getNombre() + " " + partidonuevo.getGoles1() + "\n" +
				partidonuevo.getPais2().getNombre() + " " + partidonuevo.getGoles2() + "\n");
		
		
		
		
		
		
		
		
		
		
		//ArrayList<Partido> partidos = new ArrayList <Partido>();
		
		
		//partidos.add(new Partido(pais1, pais2,90,2,3));
		//partidos.add(new Partido(pais1, pais2,120,10,1));
		
		
		//for (int i = 0; i < partidos.size(); i++) {
			
		//	System.out.println(partidos.get(i).getPais1().getNombre() + " vs " + partidos.get(i).getPais2().getNombre() +
		//			"\nDuracion de partido: " + partidos.get(i).getDuracion() + 
		//			"\nResultado:\n" + 
		//			partidos.get(i).getPais1().getNombre() + " " + partidos.get(i).getGoles1() + "\n" +
		//			partidos.get(i).getPais2().getNombre() + " " + partidos.get(i).getGoles2() + "\n");
		//	i++;
		//}
		
		
		
		
		
		
		return partidonuevo;
		
	
		
		
	
	}
	
}
