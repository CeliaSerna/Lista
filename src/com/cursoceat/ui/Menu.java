package com.cursoceat.ui;

import java.util.Scanner;

import com.cursoceat.main.Lista;

public class Menu {

static Scanner entrada = new Scanner(System.in);

static int nuevoValor;
static Lista miLista = new Lista();
	
	static public void  menuPrincipal() {
		int opcion;
		
		System.out.println("***********************************");
		System.out.println("1- Ver longitud de la lista");
		System.out.println("2- Añadir elemento al final");
		System.out.println("3- Añadir elemento al principio");
		System.out.println("4- Añadir elemento donde quieras");
		System.out.println("5- Eliminar elemento");
		System.out.println("6- Añadir otra lista");
		System.out.println("7- Buscar elemento por la posición");
		System.out.println("8- Buscar posición por el elemento");
		System.out.println("9- Ver lista");
		System.out.println("***********************************");
	    opcion = entrada.nextInt();
	    
	    switch (opcion) {
	    case 1-> miLista.obtenerNums();
	    case 2-> {
	    System.out.println("Ingrese el nuevo valor para insertar al final ");
	    nuevoValor = entrada.nextInt();
	    miLista.setNuevoValor(nuevoValor);
	    miLista.insertarNumFin();
	    
	    }
	    case 3-> miLista.insertarNumIni();
	    case 4-> miLista.insertarNum();
	    case 5-> miLista.eliminar();
	    case 6-> miLista.aniadirListaFin();
	    case 7-> miLista.obtenerEle();
	    case 8-> miLista.buscarNum();
	    case 9-> miLista.mostrar();
	    
	    }
	
	
	}

}