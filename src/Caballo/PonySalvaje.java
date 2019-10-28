/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caballo;

/**
 *
 * @author Daniela
 */
public class PonySalvaje {
    
    //Definir el tablero
    int[][] tablero = new int[9][9];
    //Definir los valores de los 8 movimientos permitidos del caballo
    int[][] movimientos = {{2, 1},{1, 2},{-1, 2},{-2, 1},{-2, -1},{-1, -2},{1, -2},{2, -1}};
    //Variables que guarda las coordenadas en donde inicia el caballo
    int x0, y0;
    boolean exito;

    public PonySalvaje(int x, int y){
        if ((x < 1) || (x > 8) || (y < 1) || (y > 8)) {
            System.out.println("Las coordenadas no son validas");
        }
        x0 = x;
        y0 = y;
        for (int i = 1; i <= 8; i++){
            for (int j = 1; j <= 8; j++){
                tablero[i][j] = 0;
            }
        }
        //Se anota el movimiento 1 en el tablero, que es el lugar en donde comenzo el caballo
        tablero[x0][y0] = 1;  
    }
    
     private void saltoDelPony(int x, int y, int i) {
        int ejex;
        int ejey;
        int k;
        //Variable que sirve para almacenar los posibles movimientos del caballo
        k = 0; 
        do {
            k++;
            ejex = x + movimientos[k - 1][0];
            ejey = y + movimientos[k - 1][1];
            //Verificar que las coordenadas del nuevo movimiento del caballo esten dentro del tablero
            if((ejex >= 1) && (ejex <= 8) && (ejey >= 1) && (ejey <= 8) && (tablero[ejex][ejey] == 0)) {
                // se anota el numero de movimiento en el tablero, en el primer recorrido del do el valor registrado 
                //sera 2, ya que el movimiento 1 se registra en el lugar donde empezó el caballo
                tablero[ejex][ejey] = i;
                //Se verifica que el valor de i (contador del num. de mov. aun no llega a 64)
                if(i < 8 * 8){
                    saltoDelPony(ejex, ejey, i + 1);
                //Se verifica que el tablero no este completo
                    if (!exito){ 
                        tablero[ejex][ejey] = 0;
                    }
                }else {
                    //El tablero esta completo
                    exito = true; 
               }
            }
        } while((k < 8) && !exito);
    }

    public void saltar() {
        saltoDelPony(x0, y0, 2);
    }

//Imprime el tablero con los movimientos que realizo el caballo
    void imprimirTablero() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
