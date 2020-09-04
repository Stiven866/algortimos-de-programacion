/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author stiven
 */
public class MainArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBin arbol = new ArbolBin();
        
        
        arbol.insert(0, 20);//Raiz
        arbol.insert(2, 134); //rigth
        arbol.insert(1, 2);   //left
        arbol.insert(3, 3);    //rigth-left
        arbol.insert(4, 3);
        arbol.insert(7, 3);
        arbol.insert(8, 3);
        arbol.insert(4, 3);
        arbol.insert(14, 3);
             
        arbol.recorrer(arbol.raiz);
        arbol.numberOfNodes();
    }
    
}
