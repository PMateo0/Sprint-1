package S104.N1EX2;

import java.util.ArrayList;
import java.util.List;

public class CalculateDni {

    ArrayList<String>indexLetter = new ArrayList<>();

    public ArrayList<String> addLetters(){
        indexLetter.add("T"); indexLetter.add("R");indexLetter.add("W");indexLetter.add("A");indexLetter.add("G");indexLetter.add("M");indexLetter.add("Y");
        indexLetter.add("F");indexLetter.add("P");indexLetter.add("D");indexLetter.add("X");indexLetter.add("B");indexLetter.add("N") ;indexLetter.add("J");
        indexLetter.add("Z");indexLetter.add("S");indexLetter.add("Q");indexLetter.add("V");indexLetter.add("H");indexLetter.add("L");indexLetter.add("C");
        indexLetter.add("K");indexLetter.add("E");
        return indexLetter;
    }

    public String calculateLetter(String numDni, List<String> letterList){
        int Index = (Integer.parseInt(numDni))%23;
        return indexLetter.get(Index);
    }
}