package mundial;

public class Pais {
	//Nombre del pa�s, goles hechos hasta la fecha, 
		//calificado/descalificado, su grupo y su resultado en cada partido(Array de 8 posiciones,
		
		private String nombre;
		private int goles;
		private boolean estado;
		private String grupo;
		public Pais(String nombre, int goles, boolean estado, String grupo) {
			super();
			this.nombre = nombre;
			this.goles = goles;
			this.estado = estado;
			this.grupo = grupo;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getGoles() {
			return goles;
		}
		public void setGoles(int goles) {
			this.goles = goles;
		}
		public boolean isEstado() {
			return estado;
		}
		public void setEstado(boolean estado) {
			this.estado = estado;
		}
		public String getGrupo() {
			return grupo;
		}
		public void setGrupo(String grupo) {
			this.grupo = grupo;
		}
		@Override
		public String toString() {
			return "Pais [nombre=" + nombre + ", goles=" + goles + ", estado=" + estado + ", grupo=" + grupo + "]";
		}
	
		
		
		public void mostrarGrupos() {
			
			System.out.println(getNombre() + " vs " + getNombre() + "\n");
			
			
		}
	
	
}