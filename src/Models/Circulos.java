package Models;

public class Circulos {

	private int tipo;
	private String Listagrande;
	private String Listapeque�o;
	private String Listamediano;
	
	
	public Circulos(int tipo, String listagrande, String listapeque�o, String listamediano) {
		super();
		this.tipo = tipo;
		Listagrande = listagrande;
		Listapeque�o = listapeque�o;
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
	
	
	public String getListapeque�o() {
		return Listapeque�o;
	}


	public void setListapeque�o(String listapeque�o) {
		Listapeque�o = listapeque�o;
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
