
public class Boss extends Usuario{
	
	
	public Boss() {
		super();
		cobrar();
		
	}

	public Boss(int telefono, String dni) {
		super(telefono,dni);
		cobrar();
		
	}

	public Boss(Integer telefono, String nombre, String dNI, String sexo, String email, String cuenta,
			double salarios) {
		super(telefono,nombre,dNI,sexo,email,cuenta,salarios);
		cobrar();
		
	}
	
	public void cobrar()
	{
		if (this.salarios<8000) {
			this.salarios = 8000;
		}
		
		this.SalarioBrutoMensual +=this.salarios*1.50;
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
		this.SalarioNetoMensual=0.68*this.SalarioBrutoMensual;
		
	}

	@Override
	public String toString() {
		return "Boss [Telefono=" + Telefono + ", Nombre=" + Nombre + ", DNI=" + DNI + ", Sexo=" + Sexo + ", Email="
				+ Email + ", Cuenta=" + Cuenta + ", salarios=" + salarios 
				+ ", SalarioNetoMensual=" + SalarioNetoMensual + ", SalarioBrutoAnual=" + SalarioBrutoAnual
				+ ", SalarioBrutoMensual=" + SalarioBrutoMensual + "]";
	}


	 
	
	

}
