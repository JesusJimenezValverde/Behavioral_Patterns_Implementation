package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public class CAbrir implements ICommand{
	
	private Receiver receiver;
	
	public CAbrir() {
		this.receiver = null;
	}
	
	public CAbrir(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		this.receiver.abrir();
	}

}
