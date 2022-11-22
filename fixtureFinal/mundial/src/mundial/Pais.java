package mundial;

public class Pais {

	private int id_pais;
	private String nombre;
	private boolean estado;
	private String grupo;

	public Pais(int id_pais, String nombre, boolean estado, String grupo) {
		super();
		this.id_pais = id_pais;
		this.nombre = nombre;
		this.estado = estado;
		this.grupo = grupo;
	}

	public int getId_pais() {
		return id_pais;
	}

	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Pais [id_pais=" + id_pais + ", nombre=" + nombre + ", estado=" + estado + ", grupo=" + grupo + "]";
	}

}
