package gn2_Pareja_FabianCecilianoyEstebanJiemenez_Caso1_PatronCommand;

abstract class Receiver{
    public String estado;

    public abstract aumentar();
    public abstract disminuir();
    public abstract abrir();
    public abstract cerrar();
    public abstract encender();
    public abstract apagar();

}