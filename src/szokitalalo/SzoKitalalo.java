package szokitalalo;

import java.util.Scanner;

public class SzoKitalalo {

    public static void main(String[] args) {       
        String szavak[] = {"őz", "íz", "ez", "zs"};
        String valasz = beker();
        
        eldontes(szavak, valasz);
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
        
    private static void eldontes(String[] szavak, String betu) {
        //vagy nincs benne betű
        //vagy van benne csak rossz helyen találta el
        //vagy eltalálta a betűt és a helyet is
        //vagy az egészet eltalálta
        int i = 0;
        while (i < szavak.length && !(szavak[i] == betu))
            i++;
        boolean talalat = i < szavak.length;
        if(!talalat) {
            //Eltalált-e egy betűt
            i = 0;
            while (i < szavak.length && !(szavak[i].charAt(0) == betu.charAt(0)) && !(szavak[i].charAt(1) == betu.charAt(0)))
                i++;
            talalat = i < szavak.length;
            if(talalat) {
                //Jó helyen van-e az a betű
                i = 0;
                while (i < szavak.length && !(szavak[i].charAt(1) == betu.charAt(1)))
                    i++;
                talalat = i < szavak.length;
            } else {
                //Második karakter jó-e
                i = 0;
                while (i < szavak.length && !(szavak[i].charAt(0) == betu.charAt(1)) && !(szavak[i].charAt(1) == betu.charAt(1)))
                    i++;
                talalat = i < szavak.length;
                if (talalat) {
                    //Jó helyen van-e az a betú
                    i = 0;
                    while (i < szavak.length && !(szavak[i].charAt(1) == betu.charAt(1)))
                        i++;
                    talalat = i < szavak.length;
                } else {
                    System.out.println("Nincs találat!");
                }    
            }
        } else
            System.out.println("Eltaláltál egy szót!");
    }
}