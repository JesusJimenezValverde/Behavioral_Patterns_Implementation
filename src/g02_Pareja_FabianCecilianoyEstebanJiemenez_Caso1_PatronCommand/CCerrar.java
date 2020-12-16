package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public class CCerrar implements ICommand {
	
	private Receiver receiver;

	public CCerrar() {
		this.receiver = null;
	}
	
	public CCerrar(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		this.receiver.cerrar();
	}

}
