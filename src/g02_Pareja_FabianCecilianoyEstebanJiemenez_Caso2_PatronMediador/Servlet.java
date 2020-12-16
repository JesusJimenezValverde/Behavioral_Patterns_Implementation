package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso2_PatronMediador;

public class Servlet implements Mediador{

	private FormAction formAction;
	private Action action;
	private View view;
	
	@Override
	public void notify(CollegueNames pAction, String params, String pageName) {
		// TODO Auto-generated method stub
		switch(pAction) {
		case FORM:
			this.formAction.setValidate(params, pageName);
			break;
		case ACTION:
			this.action.perform(params, pageName);
			break;
		case FRAME:
			this.view.show(params, pageName);
			break;
		case OTHER:
			this.view.redirect();
			break;
		default:
			System.out.println("|| ============= ¡¡Can't process that!! ============= ||");
		}
	}
	
	public void askForPage(String pageName) {
		if(pageName == "home") {
			notify(CollegueNames.FORM, "Datos Completos", "Home");			
		}else if (pageName == "login") {
			notify(CollegueNames.FORM, "Datos Completos", "Login");
		}else if (pageName == "Profile") {
			notify(CollegueNames.FORM, "Datos Completos", "Profile");
		}else if (pageName == "news") {
			notify(CollegueNames.FORM, "Datos Completos", "News");
		}else {
			notify(CollegueNames.FORM, "Otra Pagina", "Other");
		}
	}
	
	// AUTO-generated methods //
	public Servlet(FormAction formAction, Action action, View view) {
		super();
		this.formAction = formAction;
		this.view = view;
		this.action = action;
	}
	public FormAction getFormAction() {
		return formAction;
	}
	public void setFormAction(FormAction formAction) {
		this.formAction = formAction;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public View getView() {
		return view;
	}
	public void setView(View view) {
		this.view = view;
	}

	
	
	
}
