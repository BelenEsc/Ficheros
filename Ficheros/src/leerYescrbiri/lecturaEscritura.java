package leerYescrbiri;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lecturaEscritura {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		int conteoByte = 0;
		int[] arrayBytes = new int[861];
		try {
			FileInputStream leerImagen = new FileInputStream(path+"\\azul.gif");
			boolean fin = false;

			while (!fin)/* fin == false) */ {

				int byteEntrada = leerImagen.read();
				if (byteEntrada != -1) {
					arrayBytes[conteoByte] = byteEntrada;
					System.out.println(arrayBytes[conteoByte]);
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

		try

		{
			FileOutputStream copiarImagen = new FileOutputStream(
					path+"\\azul_copia.gif");
			for (int x : arrayBytes) {
				copiarImagen.write(x);
			} 
			copiarImagen.close();
		} catch (IOException e) {
			System.out.println("no se puede copiar");
		}

	}

}
