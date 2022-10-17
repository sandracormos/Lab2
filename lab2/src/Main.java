import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor();
        List<Integer> noten = Arrays.asList(22,23,39, 42,44,67);


//        System.out.println(prof.rundetNote(41));
//        System.out.println(prof.rundetNote(42));
//        System.out.println(prof.rundetNote(43));
//        System.out.println(prof.rundetNote(44));

        System.out.println(prof.nichAusreichendeNoten(noten));
        System.out.println(prof.durchsnitt(noten));
        System.out.println(prof.abgerundeteNoten(noten));
        System.out.println(prof.maxNote(noten));

    }
}