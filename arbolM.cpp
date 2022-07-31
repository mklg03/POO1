#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;

struct nodo{
	int dato;
	nodo *der;
	nodo *izq;
};

void Menu();
nodo *crearNodo(int );
void agregarNodo(nodo *&, int);
void recorrer(nodo *);


nodo *arbol = NULL;

int main(){
	Menu();
	
	
	
	getch();
	return 0;
}
void Menu(){
	int dato, opcion, contador = 0;
	
	do{
		cout<<"1. Agregar elementos al arbol. "<<endl;
		cout<<"2. Recorrer el Arbol."<<endl;
		cout<<"3. Salir."<<endl;
		cout<<"\nOpcion: ";
		cin>>opcion;
		
		switch(opcion){
			case 1:	cout<<"Numero a agregar: ";
					cin>>dato;
					agregarNodo(arbol,dato);
					break;
			case 2: cout<<"\nRecorrido en PreOrden: ";
					recorrer(arbol);
					break;
		}
		system("pause");
		system("cls");
	}while(opcion != 3);
}
nodo *crearNodo(int n){
	nodo *NuevoNodo = new nodo();
	NuevoNodo->dato = n;
	NuevoNodo->der = NULL;
	NuevoNodo->izq = NULL;
	
	return NuevoNodo;
}
void agregarNodo(nodo *&arbol, int n){
	if(arbol == NULL){
		nodo *nuevoNodo = crearNodo(n);
		arbol = nuevoNodo;
		cout<<("Nodo raiz creado")<<endl;
	}else{
		int ValorDeRaiz = arbol->dato;
		if(n < ValorDeRaiz){
			agregarNodo(arbol->izq,n);
			cout<<("Nodo izquierdo creado")<<endl;
		}else{
			agregarNodo(arbol->der,n);//Agregando al lado derecho.
			cout<<("Nodo derecho creado")<<endl;
		}
	}
}



void recorrer(nodo *arbol){
	if(arbol == NULL){
		return ;
	}else{
		cout<<arbol->dato<<" , ";
		recorrer(arbol->izq);
		recorrer(arbol->der);
	}
}


