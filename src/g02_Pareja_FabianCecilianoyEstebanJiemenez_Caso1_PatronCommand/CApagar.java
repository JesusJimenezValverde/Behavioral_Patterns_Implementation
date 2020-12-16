package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public class CApagar implements ICommand{
	
	private Receiver receiver;

	public CApagar() {
		this.receiver = null;
	}
	
	public CApagar(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		this.receiver.apagar();
	}
	
	
}
