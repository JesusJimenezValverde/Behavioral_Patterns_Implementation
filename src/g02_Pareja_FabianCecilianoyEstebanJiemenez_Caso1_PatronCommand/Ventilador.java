package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public class Ventilador extends Receiver{

	@Override
	public void aumentar() {
		System.out.println("La velocidad del Ventilador esta aumentando...");
	}

	@Override
	public void disminuir() {
		System.out.println("La velocidad del Ventilador esta disminuyendo...");
	}

	@Override
	public void abrir() {
		System.out.println("El Ventilador no se puede abrir");
	}

	@Override
	public void cerrar() {
		System.out.println("El Ventilador no se puede cerrar");
	}

	@Override
	public void encender() {
		System.out.println("El Ventilador se esta encendiendo...");
	}

	@Override
	public void apagar() {
		System.out.println("El Ventilador se esta apagando...");
	}
    
}
