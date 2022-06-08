#include<stdio.h>
#include<stdlib.h>

int main(){

    int n, i , cont = 0;

    float *puntero, media;

    printf("Indique el numero de edades\n");
    scanf("%d", &n);

    puntero = (float *) malloc (n* sizeof(float));

    media= 0 ;

    for( i= 0 ; i < n; i++){

        printf("Edad #: %d\n", i +1 );
        scanf("%f", &puntero[i]);
    
    }


    for( i= 0 ; i < n; i++ ){

        if( puntero[i] >= 18){
            cont++;
        }
    }


    printf("Hay  %d personas mayores de edad", cont);

    free(puntero);

return 0 ;
}
