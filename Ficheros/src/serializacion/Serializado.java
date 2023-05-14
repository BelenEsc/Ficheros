package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializado {

	public static void main(String[] args) {

		Administrador jefe = new Administrador("Juan", 800000, 2005, 12, 15);
		jefe.setIncentivo(5000);

		Empleado[] personal = new Empleado[3];
		personal[0] = jefe;
		personal[1] = new Empleado("Ana", 250000, 2008, 10, 1);
		personal[2] = new Empleado("Luis", 300000, 2012, 9, 15);

		String path = System.getProperty("user.dir");

		try {
			ObjectOutputStream archivoSalida = new ObjectOutputStream(
					new FileOutputStream(path + "\\archivoSalida.xlsx"));
			archivoSalida.writeObject(personal);
			archivoSalida.close();

		} catch (Exception e) {
		}

		try {

			ObjectInputStream archivoEntrada = new ObjectInputStream(
					new FileInputStream(path + "\\archivoSalida.xlsx"));
			Empleado[] personal2 = (Empleado[]) archivoEntrada.readObject();
			archivoEntrada.close();

			for (Empleado i : personal2) {
				System.out.println(i);
			}
		} catch (Exception e) {

		}

	}

}

/*
 * para serializar primero hay q ver a quien queremos serializar, o sea de quien
 * queremos guardar la informacion. en nuestro caso son los elementos de la
 * clase Empleado. Por lo tanto ir a la clase empleado e implementar la clase
 * serilaizar
 */
class Empleado implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3097507348219370429L;
	String nombre;
	double sueldos;
	Date fecha;

	public Empleado(String nombre, double sueldos, int anioComienzo, int mesComienzo, int diaComienzo) {
		this.nombre = nombre;
		this.sueldos = sueldos;
		GregorianCalendar calendario = new GregorianCalendar(anioComienzo, mesComienzo - 1, diaComienzo);
		fecha = calendario.getTime();

	}

	public String getNombre() {
		return nombre;
	}

	public double getsueldos() {
		return sueldos;
	}

	public Date getFecha() {
		return fecha;
	}

	public void subirsueldos(double porcentaje) {
		double aumento = sueldos * porcentaje / 100;
		sueldos = sueldos + aumento;

	}

	public String toString() {
		return "Nombre de empleado: " + nombre + ", sueldos: " + sueldos + ", fecha de contrato" + fecha;
	}

}

class Administrador extends Empleado {

	private static final long serialVersionUID = -6083664472994585814L;
	double incentivo;

	public Administrador(String nombre, int ingresoAnual, int anioComienzo, int mesComienzo, int diaComienzo) {
		super(nombre, ingresoAnual, anioComienzo, mesComienzo, diaComienzo);
		incentivo = 0;
	}

	public double getsueldos() {
		double sueldosBase = super.getsueldos();
		double sueldosFinal = sueldosBase + incentivo;
		return sueldosFinal;
	}

	public void setIncentivo(double d) {
		incentivo = d;
	}

	public String toString() {
		return "Nombre de empleado: " + nombre + ", sueldos: " + sueldos + ", fecha de contrato" + fecha
				+ ", su incentivo es " + incentivo + ", por lo tanto su sueldos final es " + getsueldos();

	}

}