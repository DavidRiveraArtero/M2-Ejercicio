
public class Volunteer extends Usuario{
	
	private boolean ayuda;
	// Constructores

		public Volunteer() {
			super();
			this.ayuda=false;
		}

		public Volunteer(int telefono,String dni ) {
			super(telefono,dni );
			this.ayuda=false;
		}

		public Volunteer(Integer telefono, String nombre, String dNI, String sexo, String email, String cuenta, double salarios) {
			super(telefono, nombre,dNI, sexo,email,cuenta,salarios);
			this.ayuda=false;
		}
		
		// Metodo cobrar que en el caso de Volunteer se impondra un sueldo final de 0.0 ya que no cobra
		
		public void cobrar() {
			if(this.salarios>300) {
				this.salarios=300.0;
				this.ayuda=true;
			}else if(this.salarios<=0.0) {
				// Si es negativo o cero es que no tiene ayudas y dejamos el sueldo en 0
				this.salarios=0.0;
				this.ayuda=false;
			}else {
				// Si esta entre 0 y 300 dejamos el sueldo como esta y seteamos ayuda a true
				this.ayuda=true;
			}
			
			this.SalarioBrutoMensual +=this.salarios;
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
			this.SalarioBrutoMensual = this.SalarioNetoMensual;
		}

		public boolean isAyuda() {
			return ayuda;
		}

		public void setAyuda(boolean ayuda) {
			this.ayuda = ayuda;
		}

		@Override
		public String toString() {
			return "Volunteer [Telefono=" + Telefono + ", Nombre=" + Nombre + ", DNI=" + DNI + ", Sexo=" + Sexo + ", Email="
					+ Email + ", Cuenta=" + Cuenta + ", salarios=" + salarios 
					+ ", SalarioNetoMensual=" + SalarioNetoMensual + ", SalarioBrutoAnual=" + SalarioBrutoAnual
					+ ", SalarioBrutoMensual=" + SalarioBrutoMensual + "]";
		}
		
		
}
