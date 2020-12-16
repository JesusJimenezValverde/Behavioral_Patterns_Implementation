package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public class AC extends Receiver{

	@Override
	public void aumentar() {
		System.out.println("La temperatura del Aire Acondicionado esta aumentando...");
	}

	@Override
	public void disminuir() {
		System.out.println("La temperatura del Aire Acondicionado esta disminuyendo...");
	}

	@Override
	public void abrir() {
		System.out.println("El Aire Acondicionado no se puede abrir");
	}

	@Override
	public void cerrar() {
		System.out.println("El Aire Acondicionado no se puede cerrar");
	}

	@Override
	public void encender() {
		System.out.println("El Aire Acondicionado se esta encendiendo...");
	}

	@Override
	public void apagar() {
		System.out.println("El Aire Acondicionado se esta apagando...");
	}
	
}
