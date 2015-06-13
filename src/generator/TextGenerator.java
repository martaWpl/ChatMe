/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import container.Container;

/**
 *
 * @author Marta
 */
public class TextGenerator {
    
    public static Ngrams[] createNGram(Ngrams[] n_gram, Container[] con, int rankOfN_gram) {/*tworzy n_gram*/

        int tabSize = 10;
        int i = 0;
        String tmp = "";
        n_gram = new Ngrams[tabSize];
        try {
            while (con[i + rankOfN_gram].getWord() != null) {
                if (tabSize <= i) {
                    Ngrams[] n_gram2 = new Ngrams[tabSize];
                    n_gram2 = n_gram.clone();
                    tabSize *= 2;
                    n_gram = new Ngrams[tabSize];
                    System.arraycopy(n_gram2, 0, n_gram, 0, tabSize / 2);
                }
                n_gram[i] = new Ngrams(rankOfN_gram);
                for (int j = 0; j < rankOfN_gram; j++) {
                    tmp = tmp + con[i + j].getWord() + " ";
                }
                n_gram[i].setPrefiks(tmp);
                tmp = "";
                n_gram[i].setSufiks(con[i + rankOfN_gram].getWord());
                n_gram[i].setIndex(i);
//                System.out.println(n_gram[i].getSufiks());
                i++;

            }
        } catch (NullPointerException npe) {
            /*czyta o jeden za dużo stąd ten null*/
        }

        return n_gram;
    }
/*    
    public static String createAnswer(TreeSet tree, String wordsIn, int rankOfNgram){
        String[] splitWords;
        String nGramWords = "";
        String newWords = "";
        int i = 0;
        splitWords = wordsIn.split(" ");
        for(int j = 0; j< rankOfNgram; j++){
            nGramWords = nGramWords + splitWords[j];
        }
        if(tree.contains(nGramWords)){
            to tu !
        }
        
        try {
            for (String s : splitWords) {
                if (!tree.contains(s)) {
                    newWords = newWords + "\n" + s;
                }
                i++;
            }
        } catch (NullPointerException npe) {

        }
        
        return null;
    }
*/
    
}
