package com.cursoceat.main;

import java.util.Arrays;



//cambiar los system al main//
public class Lista {
	


//atributos
private int tabla[];
private int nuevoValor;

//constructores
public Lista(int[] tabla) {
		this.tabla = tabla;
		
		tabla= new int [0];	
}

public Lista() {
}
//getter y setter
public int getNuevoValor() {
	return nuevoValor;
}

public void setNuevoValor(int nuevoValor) {
	this.nuevoValor = nuevoValor;
}

//metodos
public void obtenerNums() {

System.out.println("El número de elementos de la tabla es: "+ tabla.length);
		
}

public void insertarNumFin() {

    this.tabla = Arrays.copyOf(this.tabla, this.tabla.length +1);
	
	this.tabla[this.tabla.length-1]= this.nuevoValor;
		
}
public void insertarNumIni() {/*

    tabla = Arrays.copyOf(tabla, tabla.length+1);
	//desplazar la tabla dejando un hueco al principio
    int tablaCopia[] = new int[tabla.length+1];
    System.arraycopy(tabla, 0, tablaCopia, 0, 0);
	System.arraycopy(tabla, 0, tablaCopia, 1, tabla.length-0);
    tabla = tablaCopia;
	
    System.out.println("Ingrese el nuevo valor para insertar al inicio ");
	tabla[0]= entrada.nextInt();
*/}
public void insertarNum() {/*

	System.out.println("Escriba la posición en la que quiere ingresar el nuevo dato ");
    int posicion=entrada.nextInt();
	//desplazar la tabla dejando un hueco donde nos diga la posicion
	int tablaCopia[] = new int[tabla.length+1];
    System.arraycopy(tabla, 0, tablaCopia, 0, posicion);
    System.arraycopy(tabla, posicion, tablaCopia, posicion+1, tabla.length - posicion);
	tabla = tablaCopia;
	
	System.out.println("Ingrese el nuevo valor ");
	tabla[posicion]= entrada.nextInt();
	
*/}
public void aniadirListaFin() {
	
}
public void eliminar() {
	
}
public void obtenerEle() {/*

	System.out.println("Escribe la posición del elemento que quiere ver ");
	int posicion = entrada.nextInt();
	System.out.println(tabla[posicion]);
	
	
*/}
public int buscarNum() {
	int i =0; 
	
	return i;
}
public void mostrar() {
	System.out.println(Arrays.toString(this.tabla));
}



}