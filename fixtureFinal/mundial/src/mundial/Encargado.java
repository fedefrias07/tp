package mundial;

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

		int goles1 = (int) (Math.random() * 10);
		int goles2 = (int) (Math.random() * 10);
		int tiempo = (int) (Math.random() * 10 + 92);

		Partido partidonuevo = new Partido(pais1, pais2, tiempo, goles1, goles2);

		if (goles1 > goles2) {
			System.out.println(partidonuevo.getPais1().getNombre() + " vs " + partidonuevo.getPais2().getNombre()
					+ "\nDuracion de partido: " + partidonuevo.getDuracion() + "\nResultado:\n"
					+ partidonuevo.getPais1().getNombre() + " " + partidonuevo.getGoles1() + "\n"
					+ partidonuevo.getPais2().getNombre() + " " + partidonuevo.getGoles2() + "\n-> GANO "
					+ partidonuevo.getPais1().getNombre() + "\n");

		} else {
			System.out.println(partidonuevo.getPais1().getNombre() + " vs " + partidonuevo.getPais2().getNombre()
					+ "\nDuracion de partido: " + partidonuevo.getDuracion() + "\nResultado:\n"
					+ partidonuevo.getPais1().getNombre() + " " + partidonuevo.getGoles1() + "\n"
					+ partidonuevo.getPais2().getNombre() + " " + partidonuevo.getGoles2() + "\n-> GANO "
					+ partidonuevo.getPais2().getNombre() + "\n");

		}

		return partidonuevo;

	}

}
