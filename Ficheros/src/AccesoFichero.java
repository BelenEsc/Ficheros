import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeerFichero leerFichero = new LeerFichero();
		leerFichero.lee();
	}
}

class LeerFichero {
	FileReader archivo;

	public void lee() {
		String workingDir = System.getProperty("user.dir");
		try {
			archivo = new FileReader(workingDir + "\\fichero.txt"); // cargar el archivo de mi directorio
			BufferedReader miBuffer = new BufferedReader(archivo); // cargar el archivo en un buffer
			String linea = ""; // crear una linea en blanco que es donde se van a pasar las lineas del buffer
								// una por una
//			int c;
//			while ((c = archivo.read()) != -1) { // cuando la lectura de un archvio con el metodo read llega al final
//													// (del texto)
//				// devuelve un -1. por eso siempre y cuando no haya llegado al final.. do...
//
//				char letra = (char) c;
//
//				System.out.print(letra);
//			}

			while (linea != null) { // mientras la linea no sea null
				linea = miBuffer.readLine(); // recoger una linea q esta almacenada en el bufer y guardarla en la
												// variable linea
				if (linea != null) {
					System.out.println(linea); // imprir la linea
				}
			}

		} catch (IOException e) {
			System.out.println("no hay archivo");
		} finally {
			try {
				archivo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
