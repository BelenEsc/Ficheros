package leerYescrbiri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class lecturaEscritura {

	public static void main(String[] args) {
		int conteoByte = 0;
		int[] arrayBytes = new int [861];
		try {
			FileInputStream leerImagen = new FileInputStream(
					"C:\\Users\\belen\\git\\lernen\\/lernen\\src\\icons\\azul.gif");
			boolean fin = false;

			while (!fin)/* fin == false) */ {

				int byteEntrada = leerImagen.read();
				if (byteEntrada != -1) {
					arrayBytes [conteoByte]=byteEntrada;
					System.out.println(arrayBytes [conteoByte]);
				} else if (byteEntrada == -1) {
					fin = true;
				}
				conteoByte++;

			}

			leerImagen.close();
		} catch (IOException e) {
			System.out.println("no encontrado");

		}
		System.out.println(conteoByte);
	}

}
