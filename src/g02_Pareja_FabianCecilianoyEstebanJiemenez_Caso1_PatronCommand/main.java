package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

import java.util.Scanner;

public class main {
	
	
	public static void menu() {
		Scanner myObj = new Scanner(System.in);  
		int opcionComando = 0;  
		int opcionObjeto = 0;
		Invocador x = new Invocador();
		
		do {
			System.out.println("****************************************************************");
			System.out.println("Seleccione la operacion que desea realizar:");
			System.out.println("1. Abrir");
			System.out.println("2. Cerrar");
			System.out.println("3. Aumentar");
			System.out.println("4. Disminuir");
			System.out.println("5. Encender");
			System.out.println("6. Apagar");
			System.out.println("7. Salir");
			System.out.println("****************************************************************");
			opcionComando = myObj.nextInt();	
			
			if(opcionComando==7) {
				System.out.println("Adios!!");
				break;
			}
			
			switch(opcionComando) {
			case 1:
				x.setComando(new CAbrir());
				break;
			case 2:
				x.setComando(new CCerrar());
				break;
			case 3:
				x.setComando(new CAumentar());
				break;
			case 4:
				x.setComando(new CDisminuir());
				break;
			case 5:
				x.setComando(new CEncender());
				break;
			case 6:
				x.setComando(new CApagar());
				break;
			default:
				System.out.println("Opcion incorrecta!!");
				continue;
			}
			
			//////////////////////////////////////////////////////////////////////////////////
			
			System.out.println("****************************************************************");
			System.out.println("Seleccione la operacion que desea realizar:");
			System.out.println("1. Aire Acondicionado");
			System.out.println("2. Ventilador");
			System.out.println("3. Puerta del garaje");
			System.out.println("4. Luces");
			System.out.println("5. Parlante");
			System.out.println("6. Salir");
			System.out.println("****************************************************************");
			opcionObjeto = myObj.nextInt();	
			
			if(opcionObjeto==6) {
				System.out.println("Adios!!");
				break;
			}
			
			switch(opcionObjeto) {
			case 1:
				x.setReceiver(new AC());
				break;
			case 2:
				x.setReceiver(new Ventilador());
				break;
			case 3:
				x.setReceiver(new Garage());
				break;
			case 4:
				x.setReceiver(new Luces());
				break;
			case 5:
				x.setReceiver(new Parlante());
				break;
			default:
				System.out.println("Opcion incorrecta!!");
				continue;
			}
			
			x.ejecutarCommando();
			
		}while(true);
		
	}

	public static void main(String[] args) {
		
		//Invocador x = new Invocador(new CAumentar(new Ventilador()));
		//x.ejecutarCommando();
		
		menu();
		
	}

}