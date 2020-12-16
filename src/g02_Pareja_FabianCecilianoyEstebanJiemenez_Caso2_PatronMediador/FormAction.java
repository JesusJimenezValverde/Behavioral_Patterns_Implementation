package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso2_PatronMediador;

public class FormAction extends Action_Collegue {
	
	public void setValidate(String params, String pageName) {
		if(params == "Datos Completos") {
			System.out.println(" || ---> Validando y Cargando info --> FormAction <-- ||");
			this.servlet.notify(CollegueNames.ACTION, "Charge Metadata", pageName);
		}else {
			System.out.println(" || -------> Imposible Validar ------> Action <------ ||");
			this.servlet.notify(CollegueNames.OTHER, "", "");
		}
	}

	public FormAction() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
