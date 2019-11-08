/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochila;

/**
 *
 * @author Daniela
 */
public class Mochila {
    
    
    private int obtenerValMayor(int x, int y){
  
        if(x > y){
            return x;
        }else{
            return y;
        }
    }
    public void miMochila(int cap, int Ben[],int n, int peso[]){
        //capacidad -> Capacidad de la mochila
        //Ben -> Beneficio de los articulos
        //peso -> Peso de los articulos
        //n -> cantidad de articulos dados
        //p -> columnas de pesos
        //item -> filas de articulos
        
        int MatrizM[][] = new int[n+1][cap+1];
  
        for(int item=0;item<=n;item++){
            //Recorrer filas
            System.out.print("|");
            //Recorrer columnas
            for(int p=0;p<=cap;p++){
                if(item==0 || p==0){
                //agregar ceros a la matriz
                    MatrizM[item][p] = 0;
                }else if(peso[item-1]<=p){
                    //Agregar valores de los beneficios a la matriz
                     MatrizM[item][p] = obtenerValMayor(Ben[item-1]+MatrizM[item-1][p-peso[item-1]],MatrizM[item-1][p]);
                }else{
                    //agregar en la posicion de la matriz en la que se encuentra actualmente, el valor 
                    //que tenga la posicion anterior
                    MatrizM[item][p] = MatrizM[item-1][p];
                }
                //Imprimir matriz de la mochila
               System.out.print(MatrizM[item][p]);
               if(p!=MatrizM[item].length-1){
                   System.out.print("\t");
               }
            }
            System.out.println("|");
        }
    System.out.println();
    //Imprimir el beneficio total
    System.out.println("Beneficio total: " +MatrizM[n][cap]);
    //Obtener los articulos utilizados
    while(n!=0){
        if(MatrizM[n][cap]!=MatrizM[n-1][cap]){
            //Imprimir los articulos utilizados, su peso y su valor
            System.out.println("Articulo: "+n+", peso = "+peso[n-1]+", valor = "+Ben[n-1]);
            cap=cap-peso[n-1];
        }
        n--;
        }
    }
}
