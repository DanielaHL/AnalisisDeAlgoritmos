/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSP;

/**
 *
 * @author Daniela
 */
public class TSP {
    double matriz[][];
    double menor = 100;
    int n=4;
   
    public TSP(int n){
        this.n=n;
        matriz = new double[n][n];
       
   }
   
 public void AgregarRuta(String in, String fin, int dis){
        int r1,r2; 
    }

public void permutaciones(String[] e, String auts, int n, int r){
        if(n==0){
            System.out.println(auts);
        }else{
            for(int i=0;i<r;i++){
                if(!auts.contains(e[i])){
                    permutaciones(e,auts+e[i]+", ",n-1,r);
                }
            }
        }
    }


   public void distanciaCorta(){
//Generar matriz    
       matriz=new double[4][4];
//Agregar valores a la matriz      
        matriz[0][0]=100;
        matriz[0][1]=3;
        matriz[0][2]=1;
        matriz[0][3]=6;
        matriz[1][0]=4;
        matriz[1][1]=100;
        matriz[1][2]=4;
        matriz[1][3]=12;
        matriz[2][0]=2;
        matriz[2][1]=20;
        matriz[2][2]=100;
        matriz[2][3]=8;
        matriz[3][0]=1;
        matriz[3][1]=1;
        matriz[3][2]=5;
        matriz[3][3]=100;
      
      
        int i = 0;
        double aux = 0;
        
        double menor=0;
        //men=matriz[0];
        
//Obtener la distancia menor
       while(i<matriz.length){
            for(int j=0;j<matriz.length;j++){
                if(i==0 && j==0){
                    menor = matriz[i][j]; 
                }
                if(matriz[i][j]<menor ){
                    menor = matriz[i][j];
                }
            }
            i++;
        }
       
//imprimir el menor
        System.out.println("menor: "+menor);
      //  System.out.println("posiscion x: " +i+ "posicion y: "+i);
        
        String[] e={"a","b","c","d"};
        int numElem=10;
        int r=e.length;
        permutaciones(e,"",numElem,r);
   }
    
}