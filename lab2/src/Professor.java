import java.util.ArrayList;
import java.util.List;

public class Professor {
    public Integer rundetNote(Integer note) {
        if (note<38){
            return note;
        }
        for (int i = 0; i < 5; i++) {
            if ((note + i )% 5 == 0) {
                if (i < 3) {
                    return note + i;
                }
            }
        }
        return note;
    }

    //ex1
    public List<Integer> nichAusreichendeNoten(List<Integer> listNoten){
        List<Integer> finalList= new ArrayList<>();
        for(int i=0; i<listNoten.size(); i++){
            if (listNoten.get(i) < 40){
                finalList.add(listNoten.get(i));
            }
        }return finalList;
    }

    //ex2
    public Float durchsnitt(List<Integer> listNote){
        Float aux =0.0f;
        for(int i=0; i<listNote.size(); i++){
            aux+= listNote.get(i);
        }
        return aux/listNote.size();
    }

    //ex3
    public List<Integer> abgerundeteNoten(List<Integer> originaleNoten){
        List<Integer> aux = new ArrayList<>();
        for( int i: originaleNoten){
            aux.add(rundetNote(i));
        }
        return aux;
    }

    //ex4
    public Integer maxNote(List<Integer> originaleNoten){
        List<Integer> aux = new ArrayList<>();
        aux = abgerundeteNoten(originaleNoten);
        Integer max= aux.get(0);
        for (int i: aux){
            if (i > max){
                max=i;
            }
        }
        return max;
    }

}
