package mundial;

public class Partido {

	private  Pais pais1;
	private  Pais pais2;
	private double duracion;
	private int goles1;
	private int goles2;
	//private int totgoles1;
	//private int totgoles2;
	
	
	//,int totgoles1, int totgoles2

	public Partido(Pais pais1, Pais pais2, double duracion, int goles1, int goles2) {
		super();
		this.pais1 = pais1;
		this.pais2 = pais2;
		this.duracion = duracion;
		this.goles1 = goles1;
		this.goles2 = goles2;
		//this.totgoles1 = totgoles1;
		//this.totgoles2 = totgoles2;
	}

	public Pais getPais1() {
		return pais1;
	}

	public void setPais1(Pais pais1) {
		this.pais1 = pais1;
	}

	public Pais getPais2() {
		return pais2;
	}

	public void setPais2(Pais pais2) {
		this.pais2 = pais2;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getGoles1() {
		return goles1;
	}

	public void setGoles1(int goles1) {
		this.goles1 = goles1;
	}

	public int getGoles2() {
		return goles2;
	}

	public void setGoles2(int goles2) {
		this.goles2 = goles2;
	}
	
	
	

	//public int getTotgoles1() {
		//return totgoles1;
	//}

	//public void setTotgoles1(int totgoles1) {
	//	this.totgoles1 = totgoles1;
	//}

	//public int getTotgoles2() {
	//	return totgoles2;
	//}

	//public void setTotgoles2(int totgoles2) {
	//	this.totgoles2 = totgoles2;
	//}

	@Override
	public String toString() {
		return "Partido [pais1=" + pais1 + ", pais2=" + pais2 + ", duracion=" + duracion + ", goles1=" + goles1
				+ ", goles2=" + goles2 + "]";
	}
	
	

	
	
	
	
	
	
	
	
}
