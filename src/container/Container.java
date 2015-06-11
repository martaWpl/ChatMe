/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;


 public class Container {
     
    private String word; /*przeczytane słowo */
    
    private int index; /*numer słowa*/
    
    private int counts; /* zliczenia wybranego słowa w tekście*/
    
    public Container() {
        this(null, 0, 0);
    }
    
    public Container(String s, int i, int c) {
        word = s;
        index = i;
        counts = c;
    }
    
     public void setWord(String word) {
        this.word = word;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public String getWord() {
        return word;
    }

    public int getIndex() {
        return index;
    }

    public int getCounts() {
        return counts;
    }
    
    public static Container[] createWordsArray(Container[] con, String nameFile, int[] arrayLength) {/*tworzy tablice słów*/
        int tabSize = 10;
        int i = 0;
        con = new Container[tabSize];
        String dane;
        File file = new File(nameFile);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException fnfe) {
            System.err.println("File: " + file + " is not exist");
        }

        try {
            while ((dane = scanner.next()) != null) {
                if (tabSize <= i) {
                    Container[] con2 = new Container[tabSize];
                    con2 = con.clone();
                    tabSize *= 2;
                    con = new Container[tabSize];
                    System.arraycopy(con2, 0, con, 0, tabSize / 2);
                }
                con[i] = new Container();
                con[i].setWord(dane);
                con[i].setIndex(1);
                i++;

//                System.out.println(con[i - 1].getWord() + "  " + con[i - 1].getCounts());
            }
            } catch (NullPointerException npe) {
            System.err.println("Error: file: " + file + " = null pointer");
        } catch (NoSuchElementException nsee) {

        }
        arrayLength[0] = i;
//        System.out.println(arrayLength[0]);
        return con;

    }
}
