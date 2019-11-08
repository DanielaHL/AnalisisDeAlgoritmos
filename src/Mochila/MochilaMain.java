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
public class MochilaMain {

    public static void main(String[] args) {
    
    //int peso[] = new int[]{3,6,6,1,9,1,11};
    //int Ben[] = new int[]{34,28,90,23,11,19,700};
    int peso[] = new int[]{1,2,9,6,4,8};
    int Ben[] = new int[]{100,36,51,3,200,1};  
    Mochila nw = new Mochila();
    
        nw.miMochila(10,Ben,Ben.length,peso);
    }
}
