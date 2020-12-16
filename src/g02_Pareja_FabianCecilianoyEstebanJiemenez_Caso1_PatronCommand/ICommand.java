package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

public interface ICommand {
	public void ejecutar();
	public void setReceiver(Receiver receiver);
}
