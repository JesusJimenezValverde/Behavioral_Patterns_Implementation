package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso2_PatronMediador;

public class Action extends Action_Collegue {
	
	public void perform(String params, String pageName) {
		if(params == "Charge Metadata") {
			System.out.println(" || -----------> Ejecutando en ------> Action <------ ||");
			this.servlet.notify(CollegueNames.FRAME, "Show page", pageName);
		}else {
			System.out.println(" || ----> Imposible cargar los datos ---> Action <--- ||");
		}
	}

	public Action() {
		super();
		// TODO Auto-generated constructor stub
	}

}
