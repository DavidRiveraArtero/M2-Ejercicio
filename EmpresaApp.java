import java.util.ArrayList;
import javax.swing.JOptionPane;
public class EmpresaApp {

	public static void main(String[] args) {
		int eleccion=0;
		ArrayList<Usuario> lista = new ArrayList<>();
		rellenaPlantilla(lista);
		String cadena = "Elija una accion:\n1 - Listar Plantilla\n2 - Agregar Usuario\n3 - Implementar bonus\n0 - Salir";
		do {
			eleccion=Integer.parseInt(JOptionPane.showInputDialog(cadena));
			switch(eleccion) {
			case 0:
				break;
			case 1:
				for(int i=0;i<lista.size();i++) {
					System.out.println(lista.get(i));
				}
				System.out.println("");
				break;
			case 2:
				String tipo = JOptionPane.showInputDialog("Que tipo de usuario desea agregar\nTipos disponibles: Volunteer, Junior, Mid, Senior, Manager y Boss");
				agregarUsuario(lista, tipo);
			case 3:
				bonus(lista);
				break;
			default:
				JOptionPane.showMessageDialog(null, "No existe esa opcion");
				break;
			}
		}while(eleccion!=0);	
		
	}

	public static void bonus(ArrayList<Usuario> lista) {
		
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i) instanceof Volunteer== false) {
				lista.get(i).setSalarioBrutoAnual(lista.get(i).getSalarioBrutoAnual()*1.1);
			}
		}
	}
	
	public static void rellenaPlantilla(ArrayList<Usuario> lista) {
		// Creamos la plantilla
		
		Boss jefe = new Boss(625527616,"Pedro","48770517D","H","pedro@gmail.com","ES678646747",80000);
		Manager encargado = new Manager(624525616,"Juan","48740617D","H","Juan@gmail.com","ES678646747",5000);
		Volunteer voluntari = new Volunteer(624525616,"Maria","48740617D","M","Maria@gmail.com","ES678646747", 0.5);
		Junior junior = new Junior(624525616,"Jose","48740617D","H","Jose@gmail.com","ES678646747", 2465);
		Mid mid = new Mid(624525616,"Juan","48740617D","H","Juan@gmail.com","ES678646747", 2000000);
		Senior sen = new Senior(624525616,"Juan","48740617D","H","Juan@gmail.com","ES678646747", 2465);
			
		lista.add(jefe);
		lista.add(encargado);
		lista.add(voluntari);
		lista.add(junior);
		lista.add(mid);
		lista.add(sen);
	}
	
	public static void agregarUsuario(ArrayList<Usuario> lista, String tipo) {
		String nombre = JOptionPane.showInputDialog("Introduzca el nombre del usuario");
		String dni = JOptionPane.showInputDialog("Introduzca el dni del usuario");
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de telefono"));
		String sexo = JOptionPane.showInputDialog("Introduzca el sexo del usuario");
		String mail = JOptionPane.showInputDialog("Introduzca el mail del usuario");
		String cuenta = JOptionPane.showInputDialog("Introduzca la cuenta bancaria del usuario");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el salario base del usuario"));
		switch(tipo.toLowerCase()) {
		case "boss":
			Boss jefe = new Boss(num, nombre, dni, sexo, mail, cuenta, salario);
			lista.add(jefe);
			break;
		case "manager":
			Manager man = new Manager(num, nombre, dni, sexo, mail, cuenta, salario);
			lista.add(man);
			break;
		case "senior":
			Senior sen = new Senior(num, nombre, dni, sexo, mail, cuenta, salario);
			lista.add(sen);
			break;
		case "mid":
			Mid mid = new Mid(num, nombre, dni, sexo, mail, cuenta, salario);
			lista.add(mid);
			break;
		case "junior":
			Junior jun = new Junior(num, nombre, dni, sexo, mail, cuenta, salario);
			lista.add(jun);
			break;
		case "volunteer":
			Volunteer volun = new Volunteer(num, nombre, dni, sexo, mail, cuenta, salario);
			lista.add(volun);
			break;
		default:
			JOptionPane.showMessageDialog(null, "No has introducido un rol existente");
		}
	}
}
