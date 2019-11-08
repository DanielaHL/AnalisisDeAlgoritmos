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
public class TSPMain {
     public static void main(String[] args) {
          
 String a = "a", d = "d";
        TSP c = new TSP(4);
        c.AgregarRuta(a, d, 20);
        c.distanciaCorta();    }
}
