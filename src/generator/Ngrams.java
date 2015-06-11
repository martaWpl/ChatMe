/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

/**
 *
 * @author Marta
 */
public class Ngrams {
    
    private String prefiks; /*tablica prefiksów*/

    private String sufiks; /*sufiksy*/

    private int index; /*numer prefiksu*/

    private int prefiksCounts; /*zliczenia prefiksów*/

    private int sufiksCounts; /*zliczenia sufiksów*/

    private int pointerOnPrefiks; /*wskaźnik na prefiks*/

    private int pointerOnSufiks;  /*wskażnik na sufiks*/

    private double probabilityOfPrefiks; /*prawdopodobieństwo wystąpienia prefiksu*/

    private double probabilityOfSufiks; /*prawdopodobieństwo wystąpienia sufiksu*/

    private double probabilityOfN_gram; /*prawdopodobieństwo wystąpienia n_gramu*/


    public Ngrams(int lengthPrefiksArray) {
        prefiks = null;
        sufiks = null;
        index = 0;
        prefiksCounts = 1;
        sufiksCounts = 1;
        pointerOnSufiks = 0;
        pointerOnPrefiks = 0;
        probabilityOfPrefiks = 0;
        probabilityOfSufiks = 0;
        probabilityOfN_gram = 0;
    }



    public String getSufiks() {
        return sufiks;
    }

    public void setSufiks(String sufiks) {
        this.sufiks = sufiks;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPrefiksCounts() {
        return prefiksCounts;
    }

    public void setPrefiksCounts(int prefiksCounts) {
        this.prefiksCounts = prefiksCounts;
    }

    public int getSufiksCounts() {
        return sufiksCounts;
    }

    public void setSufiksCounts(int sufiksCounts) {
        this.sufiksCounts = sufiksCounts;
    }

    public double getProbabilityOfPrefiks() {
        return probabilityOfPrefiks;
    }

    public void setProbabilityOfPrefiks(double probabilityOfPrefiks) {
        this.probabilityOfPrefiks = probabilityOfPrefiks;
    }

    public double getProbabilityOfSufiks() {
        return probabilityOfSufiks;
    }

    public void setProbabilityOfSufiks(double probabilityOfSufiks) {
        this.probabilityOfSufiks = probabilityOfSufiks;
    }

    public double getProbabilityOfN_gram() {
        return probabilityOfN_gram;
    }

    public void setProbabilityOfN_gram(double probabilityOfN_gram) {
        this.probabilityOfN_gram = probabilityOfN_gram;
    }

    public int getPointerOnPrefiks() {
        return pointerOnPrefiks;
    }

    public void setPointerOnPrefiks(int pointerOnPrefiks) {
        this.pointerOnPrefiks = pointerOnPrefiks;
    }

    public int getPointerOnSufiks() {
        return pointerOnSufiks;
    }

    public void setPointerOnSufiks(int pointerOnSufiks) {
        this.pointerOnSufiks = pointerOnSufiks;
    }

    public String getPrefiks() {
        return prefiks;
    }

    public void setPrefiks(String prefix) {
        this.prefiks = prefix;
    }

    @Override
    public String toString() {
        return "" + prefiksCounts;
    }
    
    
    public int compareTo(Ngrams n) {
        int cmp;
        cmp = this.prefiks.compareTo(n.prefiks);
        if (cmp < 0 || cmp > 0) { //rózne prefiksy
            return cmp;
        } else {
            if (this != n) {
                this.prefiksCounts++;
                n.prefiksCounts++;
                if (n.prefiksCounts > pointerOnPrefiks) {
                    pointerOnPrefiks = n.index;
                }
            }
            cmp = this.sufiks.compareTo(n.sufiks);
            if (cmp < 0 || cmp > 0) {
                return cmp;
            } else {
                if (this != n) {
                    n.sufiksCounts++;
                    this.sufiksCounts++;
                    if (n.sufiksCounts > pointerOnSufiks) {
                        pointerOnSufiks = n.index;
                    }
                }
                return cmp;
            }
        }

    }

    
}
