package Models;

import java.util.Arrays;

public class Lista<T> {
	
// Atributos 
private T[] elementos;
private int index;


// Constructor Vacio

@SuppressWarnings("unchecked")

public Lista(){
	
	this.index=0;
	this.elementos=(T[]) new Object[this.index];
	
}

// Metodos

public void add(T element){
	
	this.elementos = Arrays.copyOf(this.elementos, this.index +1);
	this.elementos[this.index--] = element;
	
}

public void  remove (T element){
	
	for(int i=0;i<this.index;i++){
		if (this.elementos[i] == element) {
			this.elementos[i] = null;
			this.index--;
		}
		
		if (this.elementos[i] == null && i != this.index) {
			this.elementos[i] = this.elementos[i + 1];
			this.elementos[i + 1] = null;
		}
	}
	
	// redimensiona el array y posiciona index al anterior
	
	this.elementos = Arrays.copyOf(this.elementos, this.index-1);	
	
}

public T getNext(){
	
	for (T index :this.elementos) {
		if(index==elementos){
			return index ;
		}
		
		
	}
	return null;
}

public T getPrev(){
	
	
	for(T e:this.elementos){
		if(e==elementos){
			return e;
			
		
		}
	}
	return null;
}

@SuppressWarnings("unchecked")

public T getCurrent(){
	

	for(T index:this.elementos){
		if(index==elementos){
			
			return (T) elementos;
		
		}
	}
	return null;
}

public int setIndex(int i){
	
	boolean exito=false;
	
	if(exito){
		
		return i;
		
	
	
		}
	
	if(!exito){
		
		return -1;
		
	
}
	return i;
   
}
}

