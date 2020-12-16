package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public class CDisminuir implements ICommand{
	
	private Receiver receiver;

	public CDisminuir() {
		this.receiver = null;
	}
	
	public CDisminuir(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		this.receiver.disminuir();
	}	
	
}
