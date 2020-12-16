package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso2_PatronMediador;

public class View extends Action_Collegue {
	
	public void redirect() {
		System.out.println("\n || --------------------> Frame <-------------------- ||");
		System.out.println(" || ------------> Redireccionando a HOME <----------- ||");
		System.out.println(" || --------------------> Frame <-------------------- ||\n");
		servlet.notify(CollegueNames.ACTION, "Charge Metadata", "Home Page");
	}
	
	public void show(String params, String namePage) {
		if(namePage == "Profile" && params == "Show page") {
			System.out.println("\n || --------------------> Frame <-------------------- ||");
			System.out.println(" || ------------> Informacion Personal <------------- ||");
			System.out.println(" || ----> Numero del cliente: 8080 9090        <----- ||");
			System.out.println(" || ----> Nombre del cliente: Fabian Ceciliano <----- ||");
			System.out.println(" || ----> Numero del cliente: 8080 9090        <----- ||");
			System.out.println(" || --------------------> Frame <-------------------- ||");
		} else if (params == "Show page" && namePage != "Profile") {
			System.out.println("\n || --------------------> Frame <-------------------- ||");
			System.out.println("     -----> Bienvenido a la Pagina "+ namePage);
			System.out.println(" || --------------------> Frame <-------------------- ||\n");
		}else {
			System.out.println(" || ---> Imposible mostrar la pagina ----> Frame <--- ||");
		}
		
	}

	public View() {
		super();
		// TODO Auto-generated constructor stub
	}

}
