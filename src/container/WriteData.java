/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Marta
 */
public class WriteData {
     public static void saveFileToBase(String path, File file, String words, String fileName) throws IOException {/*otwiera plik tekstowy i tworzy nową baze*/
        try {
            boolean createFile = (new File(fileName)).mkdir();
            file = new File(path);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
             try (BufferedWriter bw = new BufferedWriter(fw)) {    
                bw.write(words);
             }
             
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
  public static void addFileToBase(String path, File file, String words, String fileName) throws IOException {/*dodaje wczytany plik tekstowy do bazy*/
        try {
            boolean createFile = (new File(fileName)).mkdir();
            file = new File(path);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWritter = new FileWriter(file, true);
            try (BufferedWriter bufferWritter = new BufferedWriter(fileWritter)) {
                bufferWritter.write(words);
            }

        } catch (IOException e) {
            System.err.println("IOException in TextGenerator.addFileToBase");
        }
    }

    public static void addTextToBase(String path, File file, String fileName, String words) {/*dodaje tekst wpisany w wordsIn do bazy*/
        try {
            boolean createFile = (new File(fileName)).mkdir();
            file = new File(path);

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWritter = new FileWriter(file, true);
            try (BufferedWriter bufferWritter = new BufferedWriter(fileWritter)) {
                bufferWritter.write(words);
            }

        } catch (IOException ioe) {
            System.err.println("IOException in TextGenerator.addTextToBase");
        }
    }
}
