package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public class Luces extends Receiver{

	@Override
	public void aumentar() {
		System.out.println("La intensidad de las luces estan aumentando...");
	}

	@Override
	public void disminuir() {
		System.out.println("La intensidad de las luces se estan disminuyendo...");
	}

	@Override
	public void abrir() {
		System.out.println("La intensidad de las luces no puede abrirse");
	}

	@Override
	public void cerrar() {
		System.out.println("La intensidad de las luces no puede cerrarse");
	}

	@Override
	public void encender() {
		System.out.println("Las luces se estan encendiendo...");
	}

	@Override
	public void apagar() {
		System.out.println("Las luces se estan apagando...");
	}
    
}