
public class ControlBonificacion {


	private double suma;
	
	public double registrarSalario(Funcionario funcionario){
		this.suma = funcionario.getBonificacion() +this.suma;
		
		System.out.println("La suma actual es: " + this.suma);
		
		return this.suma;
	}
}
