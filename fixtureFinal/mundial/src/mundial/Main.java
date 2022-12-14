package mundial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// LISTA DE EQUIPOS

		Encargado encargado = new Encargado(001, "Juan");

		ArrayList<Pais> equipos = new ArrayList<Pais>();

		equipos.add(new Pais(1, "Qatar", false, "A"));
		equipos.add(new Pais(2, "Ecuador", false, "A"));
		equipos.add(new Pais(3, "Senegal", false, "A"));
		equipos.add(new Pais(4, "Paises Bajos", false, "A"));

		equipos.add(new Pais(5, "Inglaterra", false, "B"));
		equipos.add(new Pais(6, "Iran", false, "B"));
		equipos.add(new Pais(7, "Usa", false, "B"));
		equipos.add(new Pais(8, "Gales", false, "B"));

		equipos.add(new Pais(9, "Argentina", false, "C"));
		equipos.add(new Pais(10, "Arabia Saudita", false, "C"));
		equipos.add(new Pais(11, "Mexico", false, "C"));
		equipos.add(new Pais(12, "Polonia", false, "C"));

		equipos.add(new Pais(13, "Francia", false, "D"));
		equipos.add(new Pais(14, "Australia", false, "D"));
		equipos.add(new Pais(15, "Dinamarca", false, "D"));
		equipos.add(new Pais(16, "Tunez", false, "D"));

		equipos.add(new Pais(17, "España", false, "E"));
		equipos.add(new Pais(18, "Costa Rica", false, "E"));
		equipos.add(new Pais(19, "Alemania", false, "E"));
		equipos.add(new Pais(20, "Japon", false, "E"));

		equipos.add(new Pais(21, "Belgica", false, "F"));
		equipos.add(new Pais(22, "Canada", false, "F"));
		equipos.add(new Pais(23, "Marruecos", false, "F"));
		equipos.add(new Pais(24, "Croacia", false, "F"));

		equipos.add(new Pais(25, "Brazil", false, "G"));
		equipos.add(new Pais(26, "Serbia", false, "G"));
		equipos.add(new Pais(27, "Suiza", false, "G"));
		equipos.add(new Pais(28, "Camerun", false, "G"));

		equipos.add(new Pais(29, "Portugal", false, "H"));
		equipos.add(new Pais(30, "Ghana", false, "H"));
		equipos.add(new Pais(31, "Uruguay", false, "H"));
		equipos.add(new Pais(32, "Corea del Sur", false, "H"));

		// MENU

		Scanner entrada = new Scanner(System.in);

		boolean salir = false;
		int opcion;

		System.out.println("¡Bienvenido al fixture del mundial Qatar 2022!\n");

		while (!salir) {

			System.out.println("\n******MENU******\n");
			System.out.println("1. Ver grupos.\n");
			System.out.println("2. Fase de grupos.\n");
			System.out.println("3. Ver Octavos.\n");
			System.out.println("4. Ver Cuartos.\n");
			System.out.println("5. Ver Semifinal.\n");
			System.out.println("6. Ver Final.\n");
			System.out.println("7. Salir\n");

			try {

				System.out.println("--> Elija una opcion (1 - 7)");
				opcion = entrada.nextInt();

				switch (opcion) {
				case 1:

					Scanner entrada2 = new Scanner(System.in);

					String selec_grupo;

					System.out.println("Eliga el grupo que quiere ver (A - H)");
					selec_grupo = entrada2.next();

					switch (selec_grupo.toUpperCase()) {
					case "A":
						System.out.println("GRUPO A\n");

						for (int i = 0; i < equipos.size(); i++) {

							if (equipos.get(i).getGrupo().equals("A")) {
								System.out.println(equipos.get(i).getNombre());
							}
						}
						break;

					case "B":
						System.out.println("\nGRUPO B\n");

						for (int i = 0; i < equipos.size(); i++) {

							if (equipos.get(i).getGrupo().equals("B")) {
								System.out.println(equipos.get(i).getNombre());
							}
						}
						break;
					case "C":
						System.out.println("\nGRUPO C\n");

						for (int i = 0; i < equipos.size(); i++) {

							if (equipos.get(i).getGrupo().equals("C")) {
								System.out.println(equipos.get(i).getNombre());
							}
						}
						break;
					case "D":
						System.out.println("\nGRUPO D\n");

						for (int i = 0; i < equipos.size(); i++) {

							if (equipos.get(i).getGrupo().equals("D")) {
								System.out.println(equipos.get(i).getNombre());
							}
						}
						break;
					case "E":
						System.out.println("\nGRUPO E\n");

						for (int i = 0; i < equipos.size(); i++) {

							if (equipos.get(i).getGrupo().equals("E")) {
								System.out.println(equipos.get(i).getNombre());
							}
						}
						break;
					case "F":
						System.out.println("\nGRUPO F\n");

						for (int i = 0; i < equipos.size(); i++) {

							if (equipos.get(i).getGrupo().equals("F")) {
								System.out.println(equipos.get(i).getNombre());
							}
						}
						break;
					case "G":
						System.out.println("\nGRUPO G\n");

						for (int i = 0; i < equipos.size(); i++) {

							if (equipos.get(i).getGrupo().equals("G")) {
								System.out.println(equipos.get(i).getNombre());
							}
						}
						break;
					case "H":
						System.out.println("\nGRUPO H\n");

						for (int i = 0; i < equipos.size(); i++) {

							if (equipos.get(i).getGrupo().equals("H")) {
								System.out.println(equipos.get(i).getNombre());
							}
						}
						break;
					default:
						System.err.println("Porfavor, debe ser un caracter entre A y H.");
						break;
					}
					break;
				case 2:

					// **********VERSUS FASE DE GRUPOS**********

					System.out.println("****VERSUS DEL GRUPO A****\n");

					encargado.cargarPartido(equipos.get(0), equipos.get(1));
					encargado.cargarPartido(equipos.get(2), equipos.get(3));
					encargado.cargarPartido(equipos.get(0), equipos.get(2));
					encargado.cargarPartido(equipos.get(3), equipos.get(1));
					encargado.cargarPartido(equipos.get(3), equipos.get(0));
					encargado.cargarPartido(equipos.get(1), equipos.get(2));

					int pasana = 0;
					do {

						if (pasana == 0) {
							System.out.println("Seleccione el primer equipo que pasa a Octavos del GRUPO A.");
						} else {
							System.out.println("Seleccione el segundo equipo que pasa a Octavos del GRUPO A.");
						}

						Scanner entrada3 = new Scanner(System.in);

						String pasaA;

						pasaA = entrada3.next();

						if (pasaA.toLowerCase().equalsIgnoreCase("qatar")) {
							equipos.get(0).setEstado(true);
							pasana++;

						} else if (pasaA.toLowerCase().equalsIgnoreCase("ecuador")) {

							equipos.get(1).setEstado(true);
							pasana++;
						} else if (pasaA.toLowerCase().equalsIgnoreCase("senegal")) {

							equipos.get(2).setEstado(true);
							pasana++;
						} else if (pasaA.toLowerCase().equalsIgnoreCase("paisesbajos")) {

							equipos.get(3).setEstado(true);
							pasana++;
						} else {

						}

					} while (pasana != 2);

					// --------------------------------------------------------

					System.out.println("****VERSUS DEL GRUPO B****\n");

					encargado.cargarPartido(equipos.get(4), equipos.get(5));
					encargado.cargarPartido(equipos.get(6), equipos.get(7));
					encargado.cargarPartido(equipos.get(4), equipos.get(6));
					encargado.cargarPartido(equipos.get(7), equipos.get(5));
					encargado.cargarPartido(equipos.get(7), equipos.get(4));
					encargado.cargarPartido(equipos.get(5), equipos.get(6));

					int pasanb = 0;
					do {

						if (pasanb == 0) {
							System.out.println("Seleccione el primer equipo que pasa a Octavos del GRUPO B.");
						} else {
							System.out.println("Seleccione el segundo equipo que pasa a Octavos del GRUPO B.");
						}

						Scanner entrada3 = new Scanner(System.in);

						String pasaB;

						pasaB = entrada3.next();

						if (pasaB.toLowerCase().equalsIgnoreCase("inglaterra")) {
							equipos.get(4).setEstado(true);
							pasanb++;

						} else if (pasaB.toLowerCase().equalsIgnoreCase("iran")) {
							equipos.get(5).setEstado(true);
							pasanb++;

						} else if (pasaB.toLowerCase().equalsIgnoreCase("usa")) {
							equipos.get(6).setEstado(true);
							pasanb++;

						} else if (pasaB.toLowerCase().equalsIgnoreCase("gales")) {
							equipos.get(7).setEstado(true);
							pasanb++;

						} else {

						}

					} while (pasanb != 2);

					// --------------------------------------------------------

					System.out.println("****VERSUS DEL GRUPO C****\n");

					encargado.cargarPartido(equipos.get(8), equipos.get(9));
					encargado.cargarPartido(equipos.get(10), equipos.get(11));
					encargado.cargarPartido(equipos.get(8), equipos.get(10));
					encargado.cargarPartido(equipos.get(11), equipos.get(9));
					encargado.cargarPartido(equipos.get(11), equipos.get(8));
					encargado.cargarPartido(equipos.get(9), equipos.get(10));

					int pasanc = 0;
					do {

						if (pasanc == 0) {
							System.out.println("Seleccione el primer equipo que pasa a Octavos del GRUPO C.");
						} else {
							System.out.println("Seleccione el segundo equipo que pasa a Octavos del GRUPO C.");
						}

						Scanner entrada3 = new Scanner(System.in);

						String pasaC;

						pasaC = entrada3.next();

						if (pasaC.toLowerCase().equalsIgnoreCase("argentina")) {
							equipos.get(8).setEstado(true);
							// equipos.get(pasanc);
							pasanc++;

						} else if (pasaC.toLowerCase().equalsIgnoreCase("arabia saudita")) {
							equipos.get(9).setEstado(true);
							pasanc++;

						} else if (pasaC.toLowerCase().equalsIgnoreCase("mexico")) {
							equipos.get(10).setEstado(true);
							pasanc++;

						} else if (pasaC.toLowerCase().equalsIgnoreCase("polonia")) {
							equipos.get(11).setEstado(true);
							pasanc++;

						} else {

						}

					} while (pasanc != 2);

					// --------------------------------------------------------

					System.out.println("****VERSUS DEL GRUPO D****\n");

					encargado.cargarPartido(equipos.get(12), equipos.get(13));
					encargado.cargarPartido(equipos.get(14), equipos.get(15));
					encargado.cargarPartido(equipos.get(12), equipos.get(14));
					encargado.cargarPartido(equipos.get(15), equipos.get(13));
					encargado.cargarPartido(equipos.get(15), equipos.get(12));
					encargado.cargarPartido(equipos.get(13), equipos.get(14));

					int pasand = 0;
					do {

						if (pasand == 0) {
							System.out.println("Seleccione el primer equipo que pasa a Octavos del GRUPO D.");
						} else {
							System.out.println("Seleccione el segundo equipo que pasa a Octavos del GRUPO D.");
						}

						Scanner entrada3 = new Scanner(System.in);

						String pasaD;

						pasaD = entrada3.next();

						if (pasaD.toLowerCase().equalsIgnoreCase("francia")) {
							equipos.get(12).setEstado(true);
							pasand++;

						} else if (pasaD.toLowerCase().equalsIgnoreCase("australia")) {
							equipos.get(13).setEstado(true);
							pasand++;

						} else if (pasaD.toLowerCase().equalsIgnoreCase("dinamarca")) {
							equipos.get(14).setEstado(true);
							pasand++;

						} else if (pasaD.toLowerCase().equalsIgnoreCase("tunez")) {
							equipos.get(15).setEstado(true);
							pasand++;

						} else {

						}

					} while (pasand != 2);

					// --------------------------------------------------------

					System.out.println("****VERSUS DEL GRUPO E****\n");

					encargado.cargarPartido(equipos.get(16), equipos.get(17));
					encargado.cargarPartido(equipos.get(18), equipos.get(19));
					encargado.cargarPartido(equipos.get(16), equipos.get(18));
					encargado.cargarPartido(equipos.get(19), equipos.get(17));
					encargado.cargarPartido(equipos.get(19), equipos.get(16));
					encargado.cargarPartido(equipos.get(17), equipos.get(18));

					int pasane = 0;
					do {

						if (pasane == 0) {
							System.out.println("Seleccione el primer equipo que pasa a Octavos del GRUPO E.");
						} else {
							System.out.println("Seleccione el segundo equipo que pasa a Octavos del GRUPO E.");
						}

						Scanner entrada3 = new Scanner(System.in);

						String pasaE;

						pasaE = entrada3.next();

						if (pasaE.toLowerCase().equalsIgnoreCase("españa")) {
							equipos.get(16).setEstado(true);
							pasane++;

						} else if (pasaE.toLowerCase().equalsIgnoreCase("costa rica")) {
							equipos.get(17).setEstado(true);
							pasane++;

						} else if (pasaE.toLowerCase().equalsIgnoreCase("alemania")) {
							equipos.get(18).setEstado(true);
							pasane++;

						} else if (pasaE.toLowerCase().equalsIgnoreCase("japon")) {
							equipos.get(19).setEstado(true);
							pasane++;

						} else {

						}

					} while (pasane != 2);

					// --------------------------------------------------------

					System.out.println("****VERSUS DEL GRUPO F****\n");

					encargado.cargarPartido(equipos.get(20), equipos.get(21));
					encargado.cargarPartido(equipos.get(22), equipos.get(23));
					encargado.cargarPartido(equipos.get(20), equipos.get(22));
					encargado.cargarPartido(equipos.get(23), equipos.get(21));
					encargado.cargarPartido(equipos.get(23), equipos.get(20));
					encargado.cargarPartido(equipos.get(21), equipos.get(22));

					int pasanf = 0;
					do {

						if (pasanf == 0) {
							System.out.println("Seleccione el primer equipo que pasa a Octavos del GRUPO F.");
						} else {
							System.out.println("Seleccione el segundo equipo que pasa a Octavos del GRUPO F.");
						}

						Scanner entrada3 = new Scanner(System.in);

						String pasaF;

						pasaF = entrada3.next();

						if (pasaF.toLowerCase().equalsIgnoreCase("belgica")) {
							equipos.get(20).setEstado(true);
							pasanf++;

						} else if (pasaF.toLowerCase().equalsIgnoreCase("canada")) {
							equipos.get(21).setEstado(true);
							pasanf++;

						} else if (pasaF.toLowerCase().equalsIgnoreCase("marruecos")) {
							equipos.get(22).setEstado(true);
							pasanf++;

						} else if (pasaF.toLowerCase().equalsIgnoreCase("croacia")) {
							equipos.get(23).setEstado(true);
							pasanf++;

						} else {

						}

					} while (pasanf != 2);

					// --------------------------------------------------------

					System.out.println("****VERSUS DEL GRUPO G****\n");

					encargado.cargarPartido(equipos.get(24), equipos.get(25));
					encargado.cargarPartido(equipos.get(26), equipos.get(27));
					encargado.cargarPartido(equipos.get(24), equipos.get(26));
					encargado.cargarPartido(equipos.get(27), equipos.get(25));
					encargado.cargarPartido(equipos.get(27), equipos.get(24));
					encargado.cargarPartido(equipos.get(25), equipos.get(26));

					int pasang = 0;
					do {

						if (pasang == 0) {
							System.out.println("Seleccione el primer equipo que pasa a Octavos del GRUPO G.");
						} else {
							System.out.println("Seleccione el segundo equipo que pasa a Octavos del GRUPO G.");
						}

						Scanner entrada3 = new Scanner(System.in);

						String pasaG;

						pasaG = entrada3.next();

						if (pasaG.toLowerCase().equalsIgnoreCase("brazil")) {
							equipos.get(24).setEstado(true);
							pasang++;

						} else if (pasaG.toLowerCase().equalsIgnoreCase("serbia")) {
							equipos.get(25).setEstado(true);
							pasang++;

						} else if (pasaG.toLowerCase().equalsIgnoreCase("suiza")) {
							equipos.get(26).setEstado(true);
							pasang++;

						} else if (pasaG.toLowerCase().equalsIgnoreCase("camerun")) {
							equipos.get(27).setEstado(true);
							pasang++;

						} else {

						}

					} while (pasang != 2);

					// --------------------------------------------------------

					System.out.println("****VERSUS DEL GRUPO H****\n");

					encargado.cargarPartido(equipos.get(28), equipos.get(29));
					encargado.cargarPartido(equipos.get(30), equipos.get(31));
					encargado.cargarPartido(equipos.get(28), equipos.get(30));
					encargado.cargarPartido(equipos.get(31), equipos.get(29));
					encargado.cargarPartido(equipos.get(31), equipos.get(28));
					encargado.cargarPartido(equipos.get(29), equipos.get(30));

					int pasanh = 0;
					do {

						if (pasanh == 0) {
							System.out.println("Seleccione el primer equipo que pasa a Octavos del GRUPO H.");
						} else {
							System.out.println("Seleccione el segundo equipo que pasa a Octavos del GRUPO H.");
						}

						Scanner entrada3 = new Scanner(System.in);

						String pasaH;

						pasaH = entrada3.next();

						if (pasaH.toLowerCase().equalsIgnoreCase("portugal")) {
							equipos.get(28).setEstado(true);
							pasanh++;

						} else if (pasaH.toLowerCase().equalsIgnoreCase("ghana")) {
							equipos.get(29).setEstado(true);
							pasanh++;

						} else if (pasaH.toLowerCase().equalsIgnoreCase("uruguay")) {
							equipos.get(30).setEstado(true);
							pasanh++;

						} else if (pasaH.toLowerCase().equalsIgnoreCase("corea del sur")) {
							equipos.get(31).setEstado(true);
							pasanh++;

						} else {

						}

					} while (pasanh != 2);

					break;
				case 3:

					// **********OCTAVOS**********

					ArrayList<Pais> octavos = new ArrayList<Pais>();

					System.out.println("LOS QUE PASAN A OCTAVOS SON:\n");

					for (Pais pasaOctavos : equipos) {
						if (pasaOctavos.isEstado() == true) {
							octavos.add(pasaOctavos);
						}

					}

					for (int i = 0; i < octavos.size(); i++) {
						System.out.println(octavos.get(i).getNombre());
					}

					for (int i = 0; i < octavos.size(); i++) {
						octavos.get(i).setEstado(false);
					}

					System.out.println("---------------------------------");

					encargado.cargarPartido(octavos.get(0), octavos.get(3));

					int pasaCuartos1 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Cuartos");

						Scanner entrada3 = new Scanner(System.in);

						String pasaCuarto1;

						pasaCuarto1 = entrada3.next();

						if (pasaCuarto1.toLowerCase().equalsIgnoreCase(octavos.get(0).getNombre())) {
							octavos.get(0).setEstado(true);
							pasaCuartos1++;

						} else if (pasaCuarto1.toLowerCase().equalsIgnoreCase(octavos.get(3).getNombre())) {
							octavos.get(3).setEstado(true);
							pasaCuartos1++;
						} else {

						}

					} while (pasaCuartos1 != 1);

					System.out.println("----------------------------");

					encargado.cargarPartido(octavos.get(4), octavos.get(7));

					int pasaCuartos2 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Cuartos");

						Scanner entrada3 = new Scanner(System.in);

						String pasaCuarto2;

						pasaCuarto2 = entrada3.next();

						if (pasaCuarto2.toLowerCase().equalsIgnoreCase(octavos.get(4).getNombre())) {
							octavos.get(4).setEstado(true);
							pasaCuartos2++;

						} else if (pasaCuarto2.toLowerCase().equalsIgnoreCase(octavos.get(7).getNombre())) {
							octavos.get(7).setEstado(true);
							pasaCuartos2++;
						} else {

						}

					} while (pasaCuartos2 != 1);

					System.out.println("----------------------------");

					encargado.cargarPartido(octavos.get(8), octavos.get(11));

					int pasaCuartos3 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Cuartos");

						Scanner entrada3 = new Scanner(System.in);

						String pasaCuarto3;

						pasaCuarto3 = entrada3.next();

						if (pasaCuarto3.toLowerCase().equalsIgnoreCase(octavos.get(8).getNombre())) {
							octavos.get(8).setEstado(true);
							pasaCuartos3++;

						} else if (pasaCuarto3.toLowerCase().equalsIgnoreCase(octavos.get(11).getNombre())) {
							octavos.get(11).setEstado(true);
							pasaCuartos3++;
						} else {

						}

					} while (pasaCuartos3 != 1);

					System.out.println("----------------------------");

					encargado.cargarPartido(octavos.get(12), octavos.get(15));

					int pasaCuartos4 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Cuartos");

						Scanner entrada3 = new Scanner(System.in);

						String pasaCuarto4;

						pasaCuarto4 = entrada3.next();

						if (pasaCuarto4.toLowerCase().equalsIgnoreCase(octavos.get(12).getNombre())) {
							octavos.get(12).setEstado(true);
							pasaCuartos4++;

						} else if (pasaCuarto4.toLowerCase().equalsIgnoreCase(octavos.get(15).getNombre())) {
							octavos.get(15).setEstado(true);
							pasaCuartos4++;
						} else {

						}

					} while (pasaCuartos4 != 1);

					System.out.println("----------------------------");

					encargado.cargarPartido(octavos.get(2), octavos.get(1));

					int pasaCuartos5 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Cuartos");

						Scanner entrada3 = new Scanner(System.in);

						String pasaCuarto5;

						pasaCuarto5 = entrada3.next();

						if (pasaCuarto5.toLowerCase().equalsIgnoreCase(octavos.get(2).getNombre())) {
							octavos.get(2).setEstado(true);
							pasaCuartos5++;

						} else if (pasaCuarto5.toLowerCase().equalsIgnoreCase(octavos.get(1).getNombre())) {
							octavos.get(1).setEstado(true);
							pasaCuartos5++;
						} else {

						}

					} while (pasaCuartos5 != 1);

					System.out.println("----------------------------");

					encargado.cargarPartido(octavos.get(6), octavos.get(5));

					int pasaCuartos6 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Cuartos");

						Scanner entrada3 = new Scanner(System.in);

						String pasaCuarto6;

						pasaCuarto6 = entrada3.next();

						if (pasaCuarto6.toLowerCase().equalsIgnoreCase(octavos.get(6).getNombre())) {
							octavos.get(6).setEstado(true);
							pasaCuartos6++;

						} else if (pasaCuarto6.toLowerCase().equalsIgnoreCase(octavos.get(5).getNombre())) {
							octavos.get(5).setEstado(true);
							pasaCuartos6++;
						} else {

						}

					} while (pasaCuartos6 != 1);

					System.out.println("----------------------------");

					encargado.cargarPartido(octavos.get(10), octavos.get(9));

					int pasaCuartos7 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Cuartos");

						Scanner entrada3 = new Scanner(System.in);

						String pasaCuarto7;

						pasaCuarto7 = entrada3.next();

						if (pasaCuarto7.toLowerCase().equalsIgnoreCase(octavos.get(10).getNombre())) {
							octavos.get(10).setEstado(true);
							pasaCuartos7++;

						} else if (pasaCuarto7.toLowerCase().equalsIgnoreCase(octavos.get(9).getNombre())) {
							octavos.get(9).setEstado(true);
							pasaCuartos7++;
						} else {

						}

					} while (pasaCuartos7 != 1);

					System.out.println("----------------------------");

					encargado.cargarPartido(octavos.get(14), octavos.get(13));

					int pasaCuartos8 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Cuartos");

						Scanner entrada3 = new Scanner(System.in);

						String pasaCuarto8;

						pasaCuarto8 = entrada3.next();

						if (pasaCuarto8.toLowerCase().equalsIgnoreCase(octavos.get(14).getNombre())) {
							octavos.get(14).setEstado(true);
							pasaCuartos8++;

						} else if (pasaCuarto8.toLowerCase().equalsIgnoreCase(octavos.get(13).getNombre())) {
							octavos.get(13).setEstado(true);
							pasaCuartos8++;
						} else {

						}

					} while (pasaCuartos8 != 1);

					break;

				case 4:

					// **********CUARTOS**********

					ArrayList<Pais> cuartos = new ArrayList<Pais>();

					System.out.println("LOS QUE PASAN A CUARTOS SON:\n");

					for (Pais pasaCuartos : equipos) {
						if (pasaCuartos.isEstado() == true) {
							cuartos.add(pasaCuartos);
						}

					}

					for (int i = 0; i < cuartos.size(); i++) {
						System.out.println(cuartos.get(i).getNombre());
					}

					for (int i = 0; i < cuartos.size(); i++) {
						cuartos.get(i).setEstado(false);
					}

					System.out.println("----------------------------");

					encargado.cargarPartido(cuartos.get(0), cuartos.get(1));

					int pasaSemis1 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Semis");

						Scanner entrada3 = new Scanner(System.in);

						String pasaSemi1;

						pasaSemi1 = entrada3.next();

						if (pasaSemi1.toLowerCase().equalsIgnoreCase(cuartos.get(0).getNombre())) {
							cuartos.get(0).setEstado(true);
							pasaSemis1++;

						} else if (pasaSemi1.toLowerCase().equalsIgnoreCase(cuartos.get(1).getNombre())) {
							cuartos.get(1).setEstado(true);
							pasaSemis1++;
						} else {

						}

					} while (pasaSemis1 != 1);

					System.out.println("----------------------------");

					encargado.cargarPartido(cuartos.get(2), cuartos.get(3));

					int pasaSemis2 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Semis");

						Scanner entrada3 = new Scanner(System.in);

						String pasaSemi2;

						pasaSemi2 = entrada3.next();

						if (pasaSemi2.toLowerCase().equalsIgnoreCase(cuartos.get(2).getNombre())) {
							cuartos.get(2).setEstado(true);
							pasaSemis2++;

						} else if (pasaSemi2.toLowerCase().equalsIgnoreCase(cuartos.get(3).getNombre())) {
							cuartos.get(3).setEstado(true);
							pasaSemis2++;
						} else {

						}

					} while (pasaSemis2 != 1);

					System.out.println("----------------------------");

					encargado.cargarPartido(cuartos.get(4), cuartos.get(5));

					int pasaSemis3 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Semis");

						Scanner entrada3 = new Scanner(System.in);

						String pasaSemi3;

						pasaSemi3 = entrada3.next();

						if (pasaSemi3.toLowerCase().equalsIgnoreCase(cuartos.get(4).getNombre())) {
							cuartos.get(4).setEstado(true);
							pasaSemis3++;

						} else if (pasaSemi3.toLowerCase().equalsIgnoreCase(cuartos.get(5).getNombre())) {
							cuartos.get(5).setEstado(true);
							pasaSemis3++;
						} else {

						}

					} while (pasaSemis3 != 1);

					System.out.println("----------------------------");

					encargado.cargarPartido(cuartos.get(6), cuartos.get(7));

					int pasaSemis4 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Semis");

						Scanner entrada3 = new Scanner(System.in);

						String pasaSemi4;

						pasaSemi4 = entrada3.next();

						if (pasaSemi4.toLowerCase().equalsIgnoreCase(cuartos.get(6).getNombre())) {
							cuartos.get(6).setEstado(true);
							pasaSemis4++;

						} else if (pasaSemi4.toLowerCase().equalsIgnoreCase(cuartos.get(7).getNombre())) {
							cuartos.get(7).setEstado(true);
							pasaSemis4++;
						} else {

						}

					} while (pasaSemis4 != 1);

					break;
				case 5:

					// **********SEMIFINAL**********

					ArrayList<Pais> semis = new ArrayList<Pais>();

					System.out.println("LOS QUE PASAN A SEMIS SON:\n");

					for (Pais pasaSemis : equipos) {
						if (pasaSemis.isEstado() == true) {
							semis.add(pasaSemis);
						}

					}

					for (int i = 0; i < semis.size(); i++) {
						System.out.println(semis.get(i).getNombre());
					}

					for (int i = 0; i < semis.size(); i++) {
						semis.get(i).setEstado(false);
					}

					System.out.println("----------------------------");

					encargado.cargarPartido(semis.get(0), semis.get(1));

					int pasaFinal1 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Semis");

						Scanner entrada3 = new Scanner(System.in);

						String pasaFin1;

						pasaFin1 = entrada3.next();

						if (pasaFin1.toLowerCase().equalsIgnoreCase(semis.get(0).getNombre())) {
							semis.get(0).setEstado(true);
							pasaFinal1++;

						} else if (pasaFin1.toLowerCase().equalsIgnoreCase(semis.get(1).getNombre())) {
							semis.get(1).setEstado(true);
							pasaFinal1++;
						} else {

						}

					} while (pasaFinal1 != 1);

					System.out.println("----------------------------");

					encargado.cargarPartido(semis.get(2), semis.get(3));

					int pasaFinal2 = 0;

					do {

						System.out.println("Seleccione el equipo que pasa a Semis");

						Scanner entrada3 = new Scanner(System.in);

						String pasaFin2;

						pasaFin2 = entrada3.next();

						if (pasaFin2.toLowerCase().equalsIgnoreCase(semis.get(2).getNombre())) {
							semis.get(2).setEstado(true);
							pasaFinal2++;

						} else if (pasaFin2.toLowerCase().equalsIgnoreCase(semis.get(3).getNombre())) {
							semis.get(3).setEstado(true);
							pasaFinal2++;
						} else {

						}

					} while (pasaFinal2 != 1);

					break;

				case 6:

					// **********FINAL**********

					ArrayList<Pais> Final = new ArrayList<Pais>();

					System.out.println("LOS QUE PASAN A LA FINAL SON:\n");

					for (Pais pasaFinal : equipos) {
						if (pasaFinal.isEstado() == true) {

							Final.add(pasaFinal);
						}
					}

					for (int i = 0; i < Final.size(); i++) {
						System.out.println(Final.get(i).getNombre());
					}

					for (int i = 0; i < Final.size(); i++) {
						Final.get(i).setEstado(false);
					}

					System.out.println("----------------------------");

					encargado.cargarPartido(Final.get(0), Final.get(1));

					int lafinal = 0;

					do {

						System.out.println("Seleccione el equipo que gano el mundial!");

						Scanner entrada3 = new Scanner(System.in);

						String lafinal1;

						lafinal1 = entrada3.next();

						if (lafinal1.toLowerCase().equalsIgnoreCase(Final.get(0).getNombre())) {
							Final.get(0).setEstado(true);
							lafinal++;

						} else if (lafinal1.toLowerCase().equalsIgnoreCase(Final.get(1).getNombre())) {
							Final.get(1).setEstado(true);
							lafinal++;
						} else {

						}

					} while (lafinal != 1);

					if (Final.get(0).isEstado() == true) {
						System.out.println("EL CAMPEON DEL MUNDIAL ES: " + Final.get(0).getNombre());
					} else {
						System.out.println("EL CAMPEON DEL MUNDIAL ES: " + Final.get(1).getNombre());
					}

					break;

				case 7:
					salir = true;
					break;
				default:
					System.err.println("Porfavor, ingrese una opcion entre 1 y 4.");
					break;
				}

			} catch (InputMismatchException e) {
				System.err.println("No ingrese letras, debe que ser un numero entre 1 y 4.");
				entrada.next();
			}

		}

		System.err.println("Gracias por estar, salio del fixture exitosamente.");

	}

}
