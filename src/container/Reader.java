/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Marta
 */
public class Reader {
    
    public static String readFile(String fileName) throws FileNotFoundException, IOException { /*czyta z pliku*/
        StringBuilder sb = new StringBuilder();
        String words;
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            while ((words = br.readLine()) != null) {
                sb.append(words);
            }
        }
         catch (IOException e) {
        }
        return sb.toString();
    }
    
}
