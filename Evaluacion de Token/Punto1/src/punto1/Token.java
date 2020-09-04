/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author stiven
 */



public class Token {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList array = new ArrayList();
        String line = "<data>\n\t<record>\n\t\t{1234}\n\t</record>\n\t<record>\n\t\t{Alfredo}\n\t\t{perez}\n\t</record>\n\t<record>\n\t\t{123453456}\n\t</record>\n\t<record>\n\t\t{carlos}\n\t\t{gómez}\n\t</record>\n<data>";
        System.out.println(line);
        String pattern = "(?<=\\{)([^\\}]+)(?=\\})"; //expresion regular {a-z-A-Z y 1234}
        Pattern response = Pattern.compile(pattern);
        Matcher match = response.matcher(line);
        while(match.find()) {
            array.add(match.group().substring(0, 1).toUpperCase() + match.group().substring(1).toLowerCase());
            //System.out.println(m.group().substring(0, 1).toUpperCase() + m.group().substring(1).toLowerCase());
      }
        System.out.println(array);    
    }
    
}
