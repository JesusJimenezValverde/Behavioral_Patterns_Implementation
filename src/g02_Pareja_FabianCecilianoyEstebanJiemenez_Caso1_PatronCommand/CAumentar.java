package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public class CAumentar implements ICommand {
	
	private Receiver receiver;

	public CAumentar() {
		this.receiver = null;
	}
	
	public CAumentar(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		this.receiver.aumentar();
	}
	
	
}
