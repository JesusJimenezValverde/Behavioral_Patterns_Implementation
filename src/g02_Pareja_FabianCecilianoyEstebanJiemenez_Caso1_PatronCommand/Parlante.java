package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public class Parlante extends Receiver{

	@Override
	public void aumentar() {
		System.out.println("El volumen del Parlante se esta aumentando...");
	}

	@Override
	public void disminuir() {
		System.out.println("El volumen del Parlante se esta disminuyendo...");
	}

	@Override
	public void abrir() {
		System.out.println("El volumen del Parlante no puede abrirse");
	}

	@Override
	public void cerrar() {
		System.out.println("El volumen del Parlante no puede cerrarse");
	}

	@Override
	public void encender() {
		System.out.println("El Parlante se esta encendiendo...");
	}

	@Override
	public void apagar() {
		System.out.println("El Parlante se esta apagando...");
	}
    
}
