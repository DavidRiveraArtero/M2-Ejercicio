
public class Mid extends Employee {

	// Constructores Heredados de Employee

	public Mid() {
		super();
		cobrar();
	}

	public Mid(int telefono, String dni) {
		super(telefono, dni);
	}

	public Mid(Integer telefono, String nombre, String dNI, String sexo, String email, String cuenta, double salarios) {
		super(telefono, nombre, dNI, sexo, email, cuenta, salarios, salarios);
		cobrar();
	}

	// Metodo cobrar que en el caso de Mid se rebaja un 10%

	public void cobrar() {

		// Ahora nos aseguramos que se cumplan un minimo y un maximo
		if (this.salarios < 1800.0) {
			// Si es menor le subimos el sueldo al valor minimo
			this.salarios = 1800.0;
		} else if (this.salarios > 2500.0) {
			this.salarios = 2500.0;
		}
		super.cobrar();
		// El metodo cobrar de Employee reduce un 5%, ahora faltaria reducir otro 5%
		this.SalarioBrutoMensual += this.salarios * 0.90;
		SueldoBrutoAnual();
		SueldoNetoMensual();
		SueldoNetoAnual();
	}
	
	public void SueldoBrutoAnual() {
		this.SalarioBrutoAnual=12*this.SalarioBrutoMensual;
		
	}
	
	public void SueldoNetoAnual() {
		this.SalarioNetoAnual=12*this.SalarioNetoMensual;
		
	}
	
	public void SueldoNetoMensual() {
		this.SalarioNetoMensual=0.85*this.SalarioBrutoMensual;
		
	}
	
	@Override
	public String toString() {
		return "Mid [Telefono=" + Telefono + ", Nombre=" + Nombre + ", DNI=" + DNI + ", Sexo=" + Sexo + ", Email="
				+ Email + ", Cuenta=" + Cuenta + ", salarios=" + salarios 
				+ ", SalarioNetoMensual=" + SalarioNetoMensual + ", SalarioBrutoAnual=" + SalarioBrutoAnual
				+ ", SalarioBrutoMensual=" + SalarioBrutoMensual + "]";
	}

}
