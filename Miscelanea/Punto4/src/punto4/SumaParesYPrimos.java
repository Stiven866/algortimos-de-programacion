/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import java.io.*;

/**
 *
 * @author stiven
 */
public class SumaParesYPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedRead = null;
        
        try{
            file = new File("./data.txt");
            fileReader = new FileReader(file);
            bufferedRead = new BufferedReader(fileReader);
            String line;
            int valueIn=0, sum=0;
            
            while((line=bufferedRead.readLine())!= null){    
                if(!"".equals(line)){
                    valueIn = Integer.parseInt(line);
                     
                    if(isPrimeOrPair(valueIn)){
                       sum+=valueIn;
                    }
                }
            }
            System.out.println("La suma de los primos y pares es: " + sum);
                
            
        }catch(IOException error){
            System.out.println(error);
        }finally{
            
            try{
                if(null != fileReader)
                    fileReader.close();
            }catch(IOException error){
                System.out.println(error);
            }
            
        }
    }
    
    
    public static boolean isPrimeOrPair(int num){
        //System.out.println(num);
        int count=0;
        
        if(num%2==0){
            return true;
        }else{
            //Calculate if it is prime
        for(int i=1; i<num+1; i++){
            
            if(num%i == 0){
                count += 1;
                //System.out.println(count);
            }
        }
        return count==2;
        }
        
        

    }
}
