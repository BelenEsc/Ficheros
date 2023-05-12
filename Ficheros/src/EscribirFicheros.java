import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheros {

	public static void main(String[] args) {
Escribir escribir = new Escribir();
escribir.escribir();
	}

}

class Escribir {

	public void escribir() {

		String frase = "esto es una prueba de \nescritura 2";
		String path = System.getProperty("user.dir");
		
	
		try {
		FileWriter escritura = new FileWriter(path + "\\escribiendo.txt");
		BufferedWriter miBuffer = new BufferedWriter(escritura);
		miBuffer.write(frase);
		miBuffer.close();
		
		//		for (int i = 0; i<frase.length();i++) {
//			escritura.write(frase.charAt(i));
//			
//		}
		
		
		
		} catch (IOException e) {
			System.out.println("no hay path");
		}
	}

}