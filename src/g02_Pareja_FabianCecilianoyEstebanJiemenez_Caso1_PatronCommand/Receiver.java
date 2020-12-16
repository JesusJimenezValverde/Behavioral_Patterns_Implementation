package g02_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

abstract class Receiver{
    public String estado;

    public abstract void aumentar();
    public abstract void disminuir();
    public abstract void abrir();
    public abstract void cerrar();
    public abstract void encender();
    public abstract void apagar();

}