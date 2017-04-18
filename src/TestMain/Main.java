package TestMain;

import Models.Circulos;
import Models.Lista;

public class Main {

	public static void main(String[] args) {
	
		// Los tipos de circulos
	
	Circulos a1=new Circulos("Lista Grande",70);
	Circulos a2=new Circulos("Lista Pequeño",60);
	Circulos a3=new Circulos("Lista Mediano",40);
	
	
	Lista<Circulos> list = new Lista<Circulos>();
	
	
	// añadimos las listas de los circulos
	
      Circulos.add(a1);
      Circulos.add(a2);
      Circulos.add(a3);
      
      
      System.out.println("Lista Grande");
      System.out.println("Lista Pequeño");
      System.out.println("Lista Mediano");

      
      
	
}
	
}
