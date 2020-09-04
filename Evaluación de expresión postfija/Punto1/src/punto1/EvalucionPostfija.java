/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;


import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
/**
 *
 * @author stiven
 */
public class EvalucionPostfija {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //(4*2) - (2*67^2)/4 ---> 4,2,*,2,67,2,^,*,4,/,- Usando "," como delimitador
        String postFija = "4,2,*,2,67,2,^,*,4,/,-"; 
        String[] arrayPosfix;
        arrayPosfix = postFija.split(","); // [4, 2, *, 2, 67, 2, ^, *, 4]
        Collections.reverse(Arrays.asList(arrayPosfix));  
        /*[4, *, ^, 2, 67, 2, *, 2, 4] Se invierte para tenerlos 
          disponibles en LIFO para extarelos en orden*/ 
        Stack stackIn;
        stackIn = new Stack();
        Stack stackOut;
        stackOut = new Stack();
        
        for (String arrayPosfix1 : arrayPosfix) {//Se empujan a la LIFO
            stackIn.push(arrayPosfix1);
        }
        
        while(!stackIn.empty()){
            if(evalOperator(stackIn.peek().toString())){ //Evaluar si existe el operador e la pila
                stackOut.push(operation(Integer.parseInt(stackOut.pop().toString()),
                                    stackIn.pop().toString(), 
                                    Integer.parseInt(stackOut.pop().toString())));
            }else{
                stackOut.push(stackIn.pop());
                /*Empuja datos mientras encuentra un operación para realizar*/
            }
        }
        System.out.println("Expresión en postfija: " + postFija);
        System.out.println("Resultado: " + stackOut.peek().toString()); 
    }
   
    private static boolean evalOperator(String op){
        switch(op){
            case "+":return true;
            case "-":return true;
            case "*":return true;
            case "/":return true;
            case "^":return true;
            case "%":return true;
            default:return false;
        }
    }
   
   private static int operation(int num2, String op, int num1){
        switch(op){
            case "+":return (num1 + num2);
            case "-":return (num1 - num2);
            case "*":return (num1 * num2);
            case "/":return (num1 / num2);
            case "^":return (int) (Math.pow(num1, num2));
            case "%":return (num1 % num2);    
            default:return 0;
        }       
    }
}
