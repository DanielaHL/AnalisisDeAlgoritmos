#include <stdio.h>
#include <stdlib.h>

int main()
{
    char cadena[] = "SOYUNPONYSALVAJE";
    char pat[] ="H";
    buscarPat(cadena,pat);
    
    return 0;
}

void buscarPat(char cadena[],char pat[])
{
	//Variable para obtener la longitud del patron a buscar
    int long_Pat = strlen(pat);
    //Variable para obtener la longitud de la cadena de texto
    int long_Cad = strlen(cadena);
    //Variable para almacenar el valor hash del patron
    int hash_pat = 0;
    //Variable para almacenar el valor hash de la cadena
    int hash_cad  = 0;
    int hash = 1;
    //Contadores
    int i, j;
    int c=0;
	
	//Realizar hash al patron
    for (i = 0; i < long_Pat - 1; i++){
        hash = ((hash * 200)) % 150;
    }
    for (i = 0; i <long_Pat; i++) {
    	//Obtener el hash de el patron
        hash_pat = (200 * hash_pat + pat[i]) % 150;
        //Obtener el hash de la cadena de texto
        hash_cad = (200 * hash_cad + cadena[i]) % 150;
    }
    //Buscar el patron en la cadena
    for (i = 0; i <= long_Cad -  long_Pat; i++) {
        if (hash_pat == hash_cad) {
            for (j = 0; j < long_Pat; j++) {
                if (cadena[i + j] != pat[j])
                    break;
            }
        //Coincidencia
            if (j == long_Pat){
				//Imprimir la posicion en la que se encuentra el patron en la cadena
                printf("El patron se encuentra en la posicion: %d de la cadena\n", i);
                c++;
			}
        }
        if (i < long_Cad - long_Pat) {
            hash_cad = (200 * (hash_cad - cadena[i] * hash) + cadena[i + long_Pat]) % 150;

            if (hash_cad < 0){
			
                hash_cad = (hash_cad + 150);
            }
        }
    }
    //Imprimir la cantidad de veces que se repite el patron en la cadena de texto
    if(c>1){
    	printf("El patron  ' %s ' ",pat);
    	printf("se repite: %d veces \n",c);
	}else if(c==1){
		printf("El patron  ' %s ' ",pat);
    	printf("se repite: %d vez \n",c);
		
	}else if(c==0){
		printf("El patron ingresado no se encuentra en la cadena ): \n");
	}
}


