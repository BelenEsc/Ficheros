package ficherosDirectorios;

import java.io.File;

public class Eliminando {

	public static void main(String[] args) {

		File eliminar = new File(System.getProperty("user.dir") + "\\newFolder");
		eliminar.delete();

	}

}
