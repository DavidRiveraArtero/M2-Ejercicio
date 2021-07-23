
public abstract class Usuario implements Cobrable  {

	protected Integer Telefono;
	
	protected String Nombre;
	
	protected String DNI;
	
	protected String Sexo;
	
	protected String Email;
	
	protected String Cuenta;
	
	protected double salarios;
	
	protected double SalarioNetoAnual;
	
	protected double SalarioNetoMensual;
	
	protected double SalarioBrutoAnual;
	
	protected double SalarioBrutoMensual;
	
	//VARIABLES
	public Usuario () {
		this.Telefono = 0;
		this.Nombre = "";
		this.DNI = "";
		this.Sexo= "";
		this.Email = "";
		this.Cuenta = "";
		this.salarios = 0;
	}


	


	public Usuario(Integer telefono, String nombre, String dNI, String sexo, String email, String cuenta,
			double salario) {
		Telefono = telefono;
		Nombre = nombre;
		DNI = dNI;
		Sexo = sexo;
		Email = email;
		Cuenta = cuenta;
		this.salarios = salario;
	}





	public Usuario(Integer telefono, String dNI) {
		Telefono = telefono;
		DNI = dNI;
	}
	
	public Integer Cobrar() {
		return Telefono;
		
	}



	// Geters y Setters


	@Override
	public void cobrar() {
		// TODO Auto-generated method stub
		
	}





	public Integer getTelefono() {
		return Telefono;
	}





	public void setTelefono(Integer telefono) {
		Telefono = telefono;
	}





	public String getNombre() {
		return Nombre;
	}





	public void setNombre(String nombre) {
		Nombre = nombre;
	}





	public String getDNI() {
		return DNI;
	}





	public void setDNI(String dNI) {
		DNI = dNI;
	}





	public String getSexo() {
		return Sexo;
	}





	public void setSexo(String sexo) {
		Sexo = sexo;
	}





	public String getEmail() {
		return Email;
	}





	public void setEmail(String email) {
		Email = email;
	}





	public String getCuenta() {
		return Cuenta;
	}





	public void setCuenta(String cuenta) {
		Cuenta = cuenta;
	}





	public double getSalarios() {
		return salarios;
	}





	public void setSalarios(double salarios) {
		this.salarios = salarios;
	}





	public double getSalarioNetoAnual() {
		return SalarioNetoAnual;
	}





	public void setSalarioNetoAnual(double salarioNetoAnual) {
		SalarioNetoAnual = salarioNetoAnual;
	}





	public double getSalarioNetoMensual() {
		return SalarioNetoMensual;
	}





	public void setSalarioNetoMensual(double salarioNetoMensual) {
		SalarioNetoMensual = salarioNetoMensual;
	}





	public double getSalarioBrutoAnual() {
		return SalarioBrutoAnual;
	}





	public void setSalarioBrutoAnual(double salarioBrutoAnual) {
		SalarioBrutoAnual = salarioBrutoAnual;
	}





	public double getSalarioBrutoMensual() {
		return SalarioBrutoMensual;
	}





	public void setSalarioBrutoMensual(double salarioBrutoMensual) {
		SalarioBrutoMensual = salarioBrutoMensual;
	}





	@Override
	public void SueldoBrutoAnual() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void SueldoNetoAnual() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void SueldoNetoMensual() {
		// TODO Auto-generated method stub
		
	}


}
