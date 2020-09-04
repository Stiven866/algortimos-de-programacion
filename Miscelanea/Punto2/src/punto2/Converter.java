/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.util.Scanner;

/**
 *
 * @author stiven
 */
public class Converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float meters;
        System.out.print("Ingrese mestros: ");
        meters = input.nextFloat();
        System.out.println(meters + " m" +" to " + String.format("%.4f", meterToFts(meters))+ " ft");
        System.out.println(meters + " m" +" to " + String.format("%.4f", metersToInch(meters) )+ " inch");
    }
    
    private static float meterToFts(float meters){
        return meters*3.28084f;
    }
    
    private static float metersToInch(float meters){
        return meters*39.37f;
    }
}
