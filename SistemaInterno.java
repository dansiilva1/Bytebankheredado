
public class SistemaInterno {

	private String clave = "AluraCursosOnline1";
	
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}
		else {
			System.out.println("Error en Login");
			return false;
		}
		}
	
	
		
	
}
