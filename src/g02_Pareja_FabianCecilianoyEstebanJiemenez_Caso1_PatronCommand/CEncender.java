package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public class CEncender implements ICommand{
	
	private Receiver receiver;

	public CEncender() {
		this.receiver = null;
	}
	
	public CEncender(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		this.receiver.encender();
	}
	
}
