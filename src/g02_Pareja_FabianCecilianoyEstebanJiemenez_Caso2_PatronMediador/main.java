package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso2_PatronMediador;

import java.util.Scanner;

public class main {
	
	public static void menu() {
		// ===============> Setting everything up <=============== //
		
		FormAction validator = new FormAction();
		Action actor = new Action();
		View frame = new View();
		Servlet servlet = new Servlet(validator,actor,frame);
		
		validator.setServlet(servlet);
		actor.setServlet(servlet);
		frame.setServlet(servlet);
		
		// ======================================================= //
		Scanner option = new Scanner(System.in);  
		int opcionEscogida = 0;		
		do {
			System.out.println(" || ------------------------------------------------------------- ||");
			System.out.println("     Seleccione la pagina que desea visitar: ");
			System.out.println("     1. HomePage ");
			System.out.println("     2. Login");
			System.out.println("     3. Profile");
			System.out.println("     4. News");
			System.out.println("     5. GooGleS");
			System.out.println("     6. YoutuV");
			System.out.println("     7. Salir");
			System.out.println(" || ------------------------------------------------------------- ||");
			opcionEscogida = option.nextInt();	
			
			if(opcionEscogida==7) {
				System.out.println(" || ------------------------ Hasta Luego ----------------------------- ||");
				break;
			}
			
			switch(opcionEscogida) {
			case 1:
				servlet.askForPage("home");
				break;
			case 2:
				servlet.askForPage("login");
				break;
			case 3:
				servlet.askForPage("Profile");
				break;
			case 4:
				servlet.askForPage("news");
				break;
			case 5:
				servlet.askForPage("other1");
				break;
			case 6:
				servlet.askForPage("other2");
				break;
			default:
				System.out.println(" || ==> Opcion incorrecta <== || ");
				continue;
			}	
						
		}while(true);
		
	}

	public static void main(String[] args) {
		
		menu();
		
	}
	
}
