package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public class Invocador {
	
	private ICommand comando;
	
	public Invocador() {
		this.comando=null;
	}
	
	public Invocador(ICommand comando) {
		this.comando=comando;
	}

	public void setComando(ICommand comando) {
		this.comando = comando;
	}
	
	public void setReceiver(Receiver receiver) {
		this.comando.setReceiver(receiver);
	}
	
	public void ejecutarCommando() {
		this.comando.ejecutar();
	}

}
