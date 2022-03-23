package szokitalalo;

import java.util.Scanner;

public class SzoKitalalo {

    public static void main(String[] args) {       
        String szavak[] = {"őz", "íz", "ez", "zs"};
        String valasz = beker();
        betuEllenorzes(karakterSzetbontas(valasz)); // a karakterSzetbontas n. eleme kell
        helyEllenorzes(valasz); // a karakterSzetbontas n. eleme kell
        eldontes();
    }

    private static String beker() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Írj be egy két betűs szót: ");
        String valasz = sc.nextLine();
        int i = 0;
        while (i < valasz.length() && valasz.length() == 2)
            i++;
        boolean kettoBetuE = i == valasz.length();
        if (!kettoBetuE)
            beker();
                    
        return valasz;
    }
    
    private static char[] karakterSzetbontas(String valasz) {
        char karakterek[] = {'a', 'a'};
        for (int i = 0; i < valasz.length(); i++)
            karakterek[i] = valasz.charAt(i);
       
        return karakterek;
    }

    private static Integer betuEllenorzes(char[] betu) {
        // Megnézi, hogy van e egyezés
        // return van benne vagy nincs
        // Négy féle kimenet van és ezeket számmal jelöljük
        
        return 1;
    }

    private static Integer helyEllenorzes(String betu) {
        //return a helyén van a betű vagy sem
        return 1;
    }

    private static void eldontes() {
        //vagy nincs benne betű
        //vagy van benne csak rossz helyen találta el
        //vagy eltalálta a betűt és a helyet is
        //vagy az egészet eltalálta
    }
}