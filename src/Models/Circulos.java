package Models;

public class Circulos {

	private int tipo;
	private String Listagrande;
	private String Listapequeño;
	private String Listamediano;
	
	
	public Circulos(int tipo, String listagrande, String listapequeño, String listamediano) {
		super();
		this.tipo = tipo;
		Listagrande = listagrande;
		Listapequeño = listapequeño;
		Listamediano = listamediano;
	}	


	public Circulos(String string, int i) {
	
	}



	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public String getListagrande() {
		return Listagrande;
	}


	public void setListagrande(String listagrande) {
		Listagrande = listagrande;
	}
	
	
	public String getListapequeño() {
		return Listapequeño;
	}


	public void setListapequeño(String listapequeño) {
		Listapequeño = listapequeño;
	}


	public String getListamediano() {
		return Listamediano;
	}


	public void setListamediano(String listamediano) {
		Listamediano = listamediano;
	}


	public static void push(Circulos a1) {
		
	}


	public static void add(Circulos a1) {
		
	}
	
	
}
