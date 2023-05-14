package ficherosDirectorios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {

		File path3 = new File(System.getProperty("user.dir") + "\\newFolder");
		System.out.println(path3);
		path3.mkdir();

		
		String txt = "\\texto.txt";
		path3 = new File(path3 + txt);
		try {
			path3.createNewFile();

			System.out.println("si");
		} catch (IOException e) {
			System.out.println("no");
			e.printStackTrace();
		}

		Escribiendo accede = new Escribiendo();
		accede.escribir(path3);

	}
}

class Escribiendo {
	public Escribiendo() {

	}

	public void escribir(File ruta) {
		FileWriter archivoSalida;
		try {
			archivoSalida = new FileWriter(ruta);

			archivoSalida.write("hola como va ");

			archivoSalida.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
