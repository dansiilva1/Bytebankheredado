
public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("4448291169");
		diego.setSalario(2000);
		
		System.out.println(diego.getNombre());
		System.out.println(diego.getSalario());
		
		System.out.println(diego.getBonificacion());
		
	}
}
