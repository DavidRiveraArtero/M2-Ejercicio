
public class Employee extends Usuario {
	// ATRIBUTO SUELDO PARA GUARDAR EL SUELDO FINAL DESPUÉS DE LAS REDUCCIONES
	
	
	
	// CONSTRUCTORES

	public Employee() {
		super();
		cobrar();
	}

	public Employee(Integer telefono, String nombre, String dNI, String sexo, String email, String cuenta,double salarios, double salario) {
		super(telefono, nombre,dNI, sexo,email,cuenta,salarios);
		cobrar();
		
	}
	public Employee(int telefono,String dni ) {
		super(telefono,dni);
	}

	
	
	// METODO COBRAR QUE EN EMPLOYEE REDUCE UN 15% SU SUELDO MENSUAL
	
	public void cobrar() {
		this.SalarioBrutoMensual=salarios*0.95;
		SueldoBrutoAnual();
		SueldoNetoMensual();
		SueldoNetoAnual();
		
	}
	
	public void SalarioBrutoAnual() {
		this.SalarioBrutoAnual=12*this.SalarioBrutoMensual;
	}
	
	public void SalarioNetAnual() {
		this.SalarioNetoAnual = 12*this.SalarioNetoMensual;
	}
	
	public void SalarioBrutoMensual() {
		this.SalarioNetoMensual =this.SalarioBrutoMensual*0.98; 
	}
}
