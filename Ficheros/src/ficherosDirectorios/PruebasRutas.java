package ficherosDirectorios;

import java.io.File;

public class PruebasRutas {

	public static void main(String[] args) {

		File archivo = new File("");
		System.out.println(archivo.getAbsolutePath());
		System.out.println(archivo.exists());
		System.out.println(System.getProperty("user.dir"));

	}
}
