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
		
		Partido partidonuevo = new Partido(pais1, pais2,90,2,3);
		
		ArrayList<Partido> partidos = new ArrayList <Partido>();
		
		partidos.add(partidonuevo);
		
		
		
		
		
		
		
		return partidonuevo;
		
		
		
		
		
		
		
		
	
	}
	
}
