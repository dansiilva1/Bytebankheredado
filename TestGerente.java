
public class TestGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		//gerente.setNombre("Diego Gerente");
		//gerente.setDocumento("4448291169");
		//gerente.setSalario(5000);
		
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnline");
		
		System.out.println(gerente.getNombre());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
		
	}
}


