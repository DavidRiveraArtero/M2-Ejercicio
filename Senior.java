
public class Senior extends Employee {
	//constructores
	
		public Senior() {
			super();
			cobrar();
		}

		public Senior(int telefono,String dni) {
			super(telefono,dni);
			cobrar();
		}

		public Senior(Integer telefono, String nombre, String dNI, String sexo, String email, String cuenta,double salarios) {
			super(telefono, nombre,dNI, sexo,email,cuenta,salarios, salarios);
			cobrar();
		}
		
		public void cobrar() //metodo que modifica el sueldo a partir de un porcentaje y comprueba que el sueldo final este entre el intervalo que debe 
		{
			super.cobrar();
			if (this.salarios < 2700) {
				this.salarios=2700;
			}else if (this.salarios > 4000) {
				this.salarios=4000;
			}
			this.SalarioBrutoMensual +=this.salarios*1.50;
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
			this.SalarioBrutoMensual = this.SalarioNetoMensual*0.76;
		}
		
		@Override
		public String toString() {
			return "Senior [Telefono=" + Telefono + ", Nombre=" + Nombre + ", DNI=" + DNI + ", Sexo=" + Sexo + ", Email="
					+ Email + ", Cuenta=" + Cuenta + ", salarios=" + salarios 
					+ ", SalarioNetoMensual=" + SalarioNetoMensual + ", SalarioBrutoAnual=" + SalarioBrutoAnual
					+ ", SalarioBrutoMensual=" + SalarioBrutoMensual + "]";
		}
}
