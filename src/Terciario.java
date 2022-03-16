import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Terciario {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int contmaquina = 0;
		int contusuario = 0;

		int dado = 0;
		int numeromaquina = 0;
		int numerousuario = 0;
		int dadomaquina[] = new int[2];
		int dadousuario[] = new int[2];
		while (contmaquina < 2 && contusuario < 2) {

			int totalusuario = 0;
			int totalmaquina = 0;

			// Inicio Obtencion de los Numeros de los Dados de la Maquina

			for (int i = 0; i < dadomaquina.length; i++) {
				dado = r.nextInt(6) + 1;
				dadomaquina[i] = dado;
				totalmaquina = totalmaquina + dadomaquina[i];
			}

			System.out.println("Primer dado: " + dadomaquina[0] + " | Segundo dado: " + dadomaquina[1]
					+ " | El total de la maquina es: " + totalmaquina + "\n");

			// -------------------------------------------------------------------

			System.out.print("Pulsa ENTER para hacer una tirada de dados\n");
			sc.nextLine();

			// Obtencion de los Numeros de los Dados del Usuario

			for (int i = 0; i < dadousuario.length; i++) {
				dado = r.nextInt(6) + 1;
				dadousuario[i] = dado;
				totalusuario = totalusuario + dadousuario[i];
			}
			System.out.println("Primer dado: " + dadousuario[0] + " | Segundo dado: " + dadousuario[1]
					+ " | El total del usuario es: " + totalusuario + "\n");

			System.out.println("El total de esta tirada del usuario es: " + totalusuario + "\n");

			// -------------------------------------------------------------------
			// Comparacion Resultados Totales de Usuario y Maquina para obtener quien es el
			// ganador de cada Ronda y darle puntuacion

			if (totalmaquina > totalusuario) {

				contmaquina++;
				contusuario = 0;
				System.out.println(
						"La Ronda la ha ganado la Maquina\n______________________________________\n______________________________________\n");

			}

			else if (totalmaquina == totalusuario) {

				contmaquina = 0;
				contusuario = 0;
				System.out.println("Ronda Empatada");

			}

			else {

				contmaquina = 0;
				contusuario++;
				System.out.println(
						"La Ronda la ha ganado el Usuario\n______________________________________\n______________________________________"
								+ "\n");

			}

			// -------------------------------------------------------------------
			// Obtencion del Ganador Final de la Partida

			if (contmaquina >= 2) {

				System.out.println("EL GANADOR HA SIDO LA MAQUINA");

			}

			if (contusuario >= 2) {

				System.out.println("EL GANADOR HA SIDO EL USUARIO");

			}

			// -------------------------------------------------------------------

		}

	}
}
