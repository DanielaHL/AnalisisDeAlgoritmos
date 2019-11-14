#include <stdio.h>
#include <stdlib.h>


//Longitud del patron
int long_Pat = 0;
//longitud de la cadena
int long_Cad = 0;
int flag=0;
//Contadores
int j;
int i;
int c=0;

int main(){
	
char cadena[] = "keondakepez";
char pat[] = "pez";

buscarPat(pat, cadena);

return 0;
}

void buscarPat(char pat[],char cad[]){
	//Obtener la longitud del patron
	long_Pat=strlen(pat);
	//Obtener la longitud de la cadena
    long_Cad=strlen(cad); 
    //Buscar el patron en la cadena
     for(i=0;i<=long_Cad-long_Pat;i++){
       	int k=i; 
		int j=0;
        while(cad[k]==pat[j] &&  j<=long_Pat){
            k++; 
			j++; 
		}
            if(j>long_Pat-1){
				//Imprimir la posicion en la que se encuentra el patron en la cadena				
				printf("El patron se encuentra en la posicion:  %d de la cadena\n", i);
    			c++;	
		     	flag=1;	
			}else{
				flag=0;	
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
		printf("El patron ingresado no se encuentra en la cadena \n");
	}
}


