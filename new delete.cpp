
#include <iostream>
#include <stdlib.h>
#include <conio.h>

using namespace std;


void pedirNotas();
void mostrar();

int nCalificaciones,*Calif;

int main (){
 pedirNotas();
 mostrar();
 
 delete []Calif;
 system ("pause");
 return 0;
}

void pedirNotas(){
 do{
 cout<<"Numero de calificaciones: ";cin>>nCalificaciones;
 }while (nCalificaciones < 0);
 
 Calif = new int [nCalificaciones];
 
 for (int i = 0; i < nCalificaciones;i++){
  do{
   cout<<"Nota: ";cin>>Calif[i];
   if (Calif[i]<0){
    cout<<"Nota invalida"<<endl;
   }
  }while(Calif[i]<0);
  
 }
}

void mostrar(){
 cout<<"\nNotas: "<<endl;
 for(int i = 0; i < nCalificaciones;i++){
  cout<<Calif[i]<<endl;
 }
}
