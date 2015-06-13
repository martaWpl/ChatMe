/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import java.awt.Window;

/**
 *
 * @author Marta
 */
public class Stats {
    
    private int[] pointer;
    int[] pointerToNGram;
    private int[] pointerSufiks;
    int[] pointerToSufiks;

    public Stats() {
        pointer = new int[5];
        pointerToNGram = new int[5];
        pointerSufiks = new int[5];
        pointerToSufiks = new int[5];
    }

    public int[] getPointerSufiks() {
        return pointerSufiks;
    }

    public void setPointerSufiks(int[] pointerSufiks) {
        this.pointerSufiks = pointerSufiks;
    }

    public int[] getPointer() {
        return pointer;
    }

    public void setPointer(int[] pointer) {
        this.pointer = pointer;
    }

    public static void createProbabilityOfPrefiks(Ngrams n_gram, int lengthOfArray) {
        try {
            double probability = (double) n_gram.getPrefiksCounts() / (double) lengthOfArray;
            n_gram.setProbabilityOfPrefiks(probability);
        } catch (NullPointerException npe) {

        }
    }

    public static void createProbabilityOfSufiks(Ngrams n_gram) {
        try {
            double probability = (double) n_gram.getSufiksCounts() / (double) n_gram.getPrefiksCounts();
            n_gram.setProbabilityOfSufiks(probability);
        } catch (NullPointerException npe) {

        }
    }

    public static void createProbabilityOfNGram(Ngrams n_gram, int lengthOfArray) {
        try {
            double probability = (n_gram.getPrefiksCounts() / lengthOfArray) * (n_gram.getSufiksCounts() / n_gram.getPrefiksCounts());
            n_gram.setProbabilityOfN_gram(probability);
        } catch (NullPointerException npe) {

        }
    }

    public void findMostCommonNGrams(Ngrams[] n_gram) {
        int tmp = 0;
        int i = 0;
        int j = 0;
        try {
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getPrefiksCounts();
                if (pointer[0] < tmp) {
                    pointer[0] = tmp;
                    pointerToNGram[0] = n_gram[j].getIndex();
                }
                j++;
            }

        } catch (NullPointerException npe) {

        }catch(ArrayIndexOutOfBoundsException aioobe){
            
        }
        
        j = 0;
        try {
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getPrefiksCounts();
                if (pointer[1] < tmp && tmp != pointer[0]) {
                    pointer[1] = tmp;
                    pointerToNGram[1] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        }catch(ArrayIndexOutOfBoundsException aioobe){
            
        }
        j = 0;
        try {
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getPrefiksCounts();
                if (pointer[2] < tmp && tmp != pointer[1] && tmp != pointer[0]) {
                    pointer[2] = tmp;
                    pointerToNGram[2] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        }catch(ArrayIndexOutOfBoundsException aioobe){
            
        }
        j = 0;
        try {
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getPrefiksCounts();
                if (pointer[3] < tmp && tmp != pointer[2] && tmp != pointer[1] && tmp != pointer[0]) {
                    pointer[3] = tmp;
                    pointerToNGram[2] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        }catch(ArrayIndexOutOfBoundsException aioobe){
            
        }
        j = 0;
        try {
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getPrefiksCounts();
                if (pointer[4] < tmp && tmp != pointer[3] && tmp != pointer[2] && tmp != pointer[1] && tmp != pointer[0]) {
                    pointer[4] = tmp;
                    pointerToNGram[3] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        }catch(ArrayIndexOutOfBoundsException aioobe){
            
        }
    }

    public void findMostCommonSufiks(Ngrams[] n_gram) {
        int tmp = 0;
        int i = 0;
        int j = 0;
        try {
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getSufiksCounts();
                if (pointerSufiks[0] < tmp) {
                    pointerSufiks[0] = tmp;
                    pointerToSufiks[0] = n_gram[j].getIndex();
                }
                j++;
            }

        } catch (NullPointerException npe) {

        }catch(ArrayIndexOutOfBoundsException aioobe){
            
        }
        j = 0;
        try {
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getSufiksCounts();
                if (pointerSufiks[1] < tmp && tmp != pointerSufiks[0]) {
                    pointerSufiks[1] = tmp;
                    pointerToSufiks[1] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        }catch(ArrayIndexOutOfBoundsException aioobe){
            
        }
        j = 0;
        try {
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getSufiksCounts();
                if (pointerSufiks[2] < tmp && tmp != pointerSufiks[1] && tmp != pointerSufiks[0]) {
                    pointerSufiks[2] = tmp;
                    pointerToSufiks[2] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        }catch(ArrayIndexOutOfBoundsException aioobe){
            
        }
        j = 0;
        try {
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getSufiksCounts();
                if (pointerSufiks[3] < tmp && tmp != pointerSufiks[2] && tmp != pointerSufiks[1] && tmp != pointerSufiks[0]) {
                    pointerSufiks[3] = tmp;
                    pointerToSufiks[2] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        }catch(ArrayIndexOutOfBoundsException aioobe){
            
        }
        j = 0;
        try {
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getSufiksCounts();
                if (pointerSufiks[4] < tmp && tmp != pointerSufiks[3] && tmp != pointerSufiks[2] && tmp != pointerSufiks[1] && tmp != pointerSufiks[0]) {
                    pointerSufiks[4] = tmp;
                    pointerToSufiks[3] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        }catch(ArrayIndexOutOfBoundsException aioobe){
            
        }
    }

    public String createStatsArray(Ngrams[] n_gram) {
        String words = "";
        createProbabilityOfPrefiks(n_gram[pointerToNGram[0]], Window.getArrayLength()[0]);
        createProbabilityOfPrefiks(n_gram[pointerToNGram[1]], Window.getArrayLength()[0]);
        createProbabilityOfPrefiks(n_gram[pointerToNGram[2]], Window.getArrayLength()[0]);
        createProbabilityOfPrefiks(n_gram[pointerToNGram[3]], Window.getArrayLength()[0]);
        createProbabilityOfPrefiks(n_gram[pointerToNGram[4]], Window.getArrayLength()[0]);

        try {
            words = "1  " + n_gram[pointerToNGram[0]].getPrefiks() + "     " + String.format("%.10f", n_gram[pointerToNGram[0]].getProbabilityOfPrefiks()) + "\n2  "
                    + n_gram[pointerToNGram[1]].getPrefiks() + "     " + String.format("%.10f", n_gram[pointerToNGram[1]].getProbabilityOfPrefiks()) + "\n3  "
                    + n_gram[pointerToNGram[2]].getPrefiks() + "     " + String.format("%.10f", n_gram[pointerToNGram[2]].getProbabilityOfPrefiks()) + "\n4  "
                    + n_gram[pointerToNGram[3]].getPrefiks() + "     " + String.format("%.10f", n_gram[pointerToNGram[3]].getProbabilityOfPrefiks()) + "\n5  "
                    + n_gram[pointerToNGram[4]].getPrefiks() + "     " + String.format("%.10f", n_gram[pointerToNGram[4]].getProbabilityOfPrefiks());
        } catch (NullPointerException npe) {

        }
        return words;
    }

    public String createStatsArray2(Ngrams[] n_gram) {
        String words = "";
        createProbabilityOfSufiks(n_gram[pointerToSufiks[0]]);
        createProbabilityOfSufiks(n_gram[pointerToSufiks[1]]);
        createProbabilityOfSufiks(n_gram[pointerToSufiks[2]]);
        createProbabilityOfSufiks(n_gram[pointerToSufiks[3]]);
        createProbabilityOfSufiks(n_gram[pointerToSufiks[4]]);

        try {
            words = "1  " + n_gram[pointerToSufiks[0]].getSufiks() + "     " + String.format("%.5f", n_gram[pointerToSufiks[0]].getProbabilityOfSufiks()) + "\n2  "
                    + n_gram[pointerToSufiks[1]].getSufiks() + "     " + String.format("%.5f", n_gram[pointerToSufiks[0]].getProbabilityOfSufiks()) + "\n3  "
                    + n_gram[pointerToSufiks[2]].getSufiks() + "     " + String.format("%.5f", n_gram[pointerToSufiks[0]].getProbabilityOfSufiks()) + "\n4  "
                    + n_gram[pointerToSufiks[3]].getSufiks() + "     " + String.format("%.5f", n_gram[pointerToSufiks[0]].getProbabilityOfSufiks()) + "\n5  "
                    + n_gram[pointerToSufiks[4]].getSufiks() + "     " + String.format("%.5f", n_gram[pointerToSufiks[0]].getProbabilityOfSufiks());
        } catch (NullPointerException npe) {

        }
        return words;
    }

    public void setDefaultCloseOperation(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
