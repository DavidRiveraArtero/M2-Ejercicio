
public class Junior extends Employee{
	
	public Junior() {
		cobrar();
	}
	
	public Junior(int telefono, String dni) {
		super(telefono, dni);
		cobrar();
	}
	
	public Junior(Integer telefono, String nombre, String dNI, String sexo, String email, String cuenta, double salarios) {
		cobrar();
	}
	
	public void comprobarPrecio() {
		
		if (this.salarios > 1600) {
			this.salarios = 1600;
		}else if (this.salarios < 900) {
			this.salarios= 900;
		}
		super.cobrar();
		this.SalarioBrutoMensual+=this.salarios*0.85;
		SueldoBrutoAnual();
		SueldoNetoMensual();
		SueldoNetoAnual();
		
	}
	public void SalarioBrutoAnual() {
		this.SalarioBrutoAnual = 12*this.SalarioBrutoMensual;
	}
	
	public void SalarioNetoAnual() {
		this.SalarioNetoAnual=12*this.SalarioNetoMensual;
	}
	
	public void SalarioBrutoMensual() {
		this.SalarioBrutoMensual = this.SalarioNetoMensual*0.98;
	}

	@Override
	public String toString() {
		return "Junior [Telefono=" + Telefono + ", Nombre=" + Nombre + ", DNI=" + DNI + ", Sexo=" + Sexo + ", Email="
				+ Email + ", Cuenta=" + Cuenta + ", salarios=" + salarios + ", SalarioNetoMensual=" + SalarioNetoMensual
				+ ", SalarioBrutoAnual=" + SalarioBrutoAnual + ", SalarioBrutoMensual=" + SalarioBrutoMensual + "]";
	}
	
	
}
