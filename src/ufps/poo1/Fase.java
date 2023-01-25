package ufps.poo1;

public class Fase {

	private TipoFase nombreFase;
	private int fase;

    /**
     * Este metodo procesa el numero ingresado
     * para generar el nombre de la fase.
     * 0 - Inicio
     * 1 - Elaboración
     * ...
     */
    public void asignarFase(int fase){
        this.fase = fase;
    }
    
    public void asignarFase(TipoFase fase){
        this.nombreFase = fase;
    }

    public String getFase(){
        return nombreFase.toString();
    }
	
}

