
public class Manager extends Usuario {

	
	
	
	public Manager() {
		super();
		cobrar();
	}
	
	public Manager(Integer telefono, String nombre, String dNI, String sexo, String email, String cuenta,double salarios) {
		super(telefono, nombre,dNI, sexo,email,cuenta,salarios);
		cobrar();
		
	}
	
	public Manager(int telefono, String dNI) {
		super(telefono,dNI);
		cobrar();
	}
	
	
	//Metodo cobra un 10% más
	
	public void cobrar() {
		if(this.salarios<3000) {
			this.salarios=3000;
		}else if (this.salarios > 5000) {
			this.salarios = 5000;
		}
		super.cobrar();
		this.SalarioBrutoMensual += salarios*1.10;
		SueldoBrutoAnual();
		SueldoNetoAnual();
		SueldoNetoMensual();
		
		
	}
	
	public void SueldoBrutoAnual() {
		this.SalarioBrutoAnual=12*this.SalarioBrutoMensual;
		
	}
	
	public void SueldoNetoAnual() {
		this.SalarioNetoAnual=12*this.SalarioNetoMensual;
		
	}
	
	public void SueldoNetoMensual() {
		this.SalarioNetoMensual=0.74*this.SalarioBrutoMensual;
		
	}
	
	public String toString() {
		return "Manager [Telefono=" + Telefono + ", Nombre=" + Nombre + ", DNI=" + DNI + ", Sexo=" + Sexo + ", Email="
				+ Email + ", Cuenta=" + Cuenta + ", salarios=" + salarios 
				+ ", SalarioNetoMensual=" + SalarioNetoMensual + ", SalarioBrutoAnual=" + SalarioBrutoAnual
				+ ", SalarioBrutoMensual=" + SalarioBrutoMensual + "]";
	}

	
	

	

	
	
	
	
}
