package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public class Garage extends Receiver{

	@Override
	public void aumentar() {
		System.out.println("La puerta del garage no puede aumentar");
	}

	@Override
	public void disminuir() {
		System.out.println("La puerta del garage no puede disminuir");
	}

	@Override
	public void abrir() {
		System.out.println("La puerta del garage se esta abriendo...");
	}

	@Override
	public void cerrar() {
		System.out.println("La puerta del garage se esta cerrando...");
	}

	@Override
	public void encender() {
		System.out.println("La puerta del garage no puede encenderse");
	}

	@Override
	public void apagar() {
		System.out.println("La puerta del garage no puede apagarse");
	}
	    
}
