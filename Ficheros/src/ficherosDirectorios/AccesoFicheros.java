package ficherosDirectorios;

import java.io.File;

public class AccesoFicheros {

	public static void main(String[] args) {
		
		
		File path2 = new File("C:\\Users\\belen\\Desktop\\input_Java"); //para segurar la compatibilidad de este path con otros sistemas, poner File.separator en vez de // 
		System.out.println(path2.getAbsolutePath());
		System.out.println(path2.exists());

		String[] lista = path2.list();
		for (String x : lista) {
			File path3 = new File(path2, x);
			System.out.print(x + " " + path3.isDirectory());
			System.out.println();

			if (path3.isDirectory()) {

				String[] adentro = path3.list();
				for (int i = 0; i < adentro.length; i++) {

					System.out.println("\t" + adentro[i]);
				}
			}
		}
	}
}
