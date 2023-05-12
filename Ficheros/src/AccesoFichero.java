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
		
		try {
			archivo = new FileReader("C:\\Users\\andreabee90\\Documents\\Ficheros\\Ficheros\\fichero.txt");
			int c;

			while ((c = archivo.read()) != -1) { // cuando la lectura de un archvio con el metodo read llega al final
													// (del texto)
				// devuelve un -1. por eso siempre y cuando no haya llegado al final.. do...

				char letra = (char) c;

				System.out.print(letra);
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
