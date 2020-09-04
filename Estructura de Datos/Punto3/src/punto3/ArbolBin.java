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
public class ArbolBin {
    
    
    Nodo raiz;
    private int i=0;
    
    public ArbolBin(){
        raiz=null;
    }
    
    public void numberOfNodes(){
        
        System.out.println("El numero de nodos es:" + i);
        
    }
    
    
    public void insert(int i, int object){
        Nodo n = new Nodo(i);
        n.content = object;
        
        if(raiz==null){
            raiz = n;
        }else{
            Nodo aux = raiz;
            while(aux!=null){
                n.padre = aux;
                if(n.key >= aux.key){
                    aux = aux.rigth;
                }  else{
                    aux = aux.left;
                }
            }
            
            if(n.key < n.padre.key){
                n.padre.left = n;
            }else{
                n.padre.rigth = n;
            }
        }
    }
    
     
    public void recorrer(Nodo n){

        if(n !=null){
            i++;
            recorrer(n.left);
            System.out.println("Indice: " + n.key + " \tContenido: " + n.content);
            recorrer(n.rigth);
        }
    }
    
    private class Nodo{
        public Nodo padre;
        public Nodo rigth;
        public Nodo left;
        public int key;
        public Object content;
        
    public Nodo(int index){
        key = index;
        rigth = null;
        left = null;
        padre = null;
        content = null;
    }
        
    }
}
