package szokitalalo;

import java.util.Scanner;

public class SzoKitalalo {

    public static void main(String[] args) {       
        String szavak[] = {"őz", "íz", "ez", "zs"};
        String valasz = beker();
        karakterSzetbontas(valasz);
        betuEllenorzes(valasz); // a karakterSzetbontas n. eleme kell
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
    
    private static void karakterSzetbontas(String valasz) {
        
    }

    private static boolean betuEllenorzes(String betu) {
        // Megnézi, hogy van e egyezés
        // return van benne vagy nincs
        return false;
    }

    private static boolean helyEllenorzes(String betu) {
        //return a helyén van a betű vagy sem
        return false;
    }

    private static void eldontes() {
        //vagy nincs benne betű
        //vagy van benne csak rossz helyen találta el
        //vagy eltalálta a betűt és a helyet is
        //vagy az egészet eltalálta
    }
}