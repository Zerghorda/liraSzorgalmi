package lirafeladatok;

import java.util.Scanner;

public class alapElagazasosFeladatok {

    Scanner sc = new Scanner(System.in, "latin2");

    void start() {

//Kör: legyen az a változó egy kör sugara. Számolja ki a program a kör kerületét, területét
//Háromszög 1: legyen az a és b változónk egy derékszögű háromszög 2 befogója és számoljuk ki az
//átfogót 2 tizedessel
//Háromszög 2: nézzük meg, hogy az eredetileg bekért 3 szám szerkeszthető háromszöget ad e ki
//Matek: írjuk ki a 3 szám számtani és mértani közepét
//Monogram: kérjük be a nevünket szóközzel elválasztva. A program írja ki a monogramunkat.
        int a = szamBeker();
        int b = szamBeker();
        int c = szamBeker();
        int szamok[] = {a, b, c};

        sorbarak(szamok);
        uresSor();
        relacio(a, b);
        csere(a, b);
        uresSor();
        egyenlet(a, b);
        Oszthatosag();
        monogram();

    }

    private void uresSor() {
        System.out.println("");
    }

    private int szamBeker() {
        //Kérjünk be 3 db valós számot, a, b, c változókban eltárolva.
        System.out.println("Adjon egy egesz szamot!");
        int szam = sc.nextInt();
        return szam;
    }

    private void sorbarak(int[] lista) {
        //Sorbarak: írjuk ki növekvő sorban a számokat
        int csere;
        for (int i = 0; i <= lista.length - 1; i++) {
            for (int j = i + 1; j <= lista.length - 1; j++) {
                if (lista[i] > lista[j]) {
                    csere = lista[i];
                    lista[i] = lista[j];
                    lista[j] = csere;
                }
            }
            if (i == lista.length - 1) {
                System.out.println(lista[i]);
            } else {
                System.out.print(lista[i] + " ");
            }

        }

    }

    private void relacio(int a, int b) {
        //Reláció: Az a és b számok közötti relációt szövegesen írjuk ki. (kisebb, nagyobb, egyenlő)
        String txt = "";
        if (a == b) {
            txt += String.format("%d egyenlo %d-vel\n", a, b);
        } else if (b > a) {
            txt += String.format("%d kisebb mint %d\n", a, b);
        } else if (a > b) {
            txt += String.format("%d nagyobb mint %d\n", a, b);
        }

        System.out.println(txt);
    }

    private void csere(int a, int b) {
        //Csere: cseréljük meg a és b változó értékét
        int csere = a;
        a = b;
        b = csere;
        System.out.printf("a=%d,b=%d", a, b);
    }

    private void egyenlet(int a, int b) {
        //Egyenlet: határozzuk meg az ax + b = 0 egyenlet megoldását! (x-re rendezve az egyenletet)
        if (a != 0) {
            System.out.println("eredmeny " + (-b / a));
        } else {
            System.out.println("Nem egyenlo az egyenlet!");
        }
    }

    private void Oszthatosag() {
        //Oszthatóság: képezzünk egész számokat a bekért értékekből és írjuk ki, hogy b osztható e a-val
        int a = szamBeker();
        int b = szamBeker();
        if (b % a == 0) {
            System.out.println("b oszthato a-val");
        } else {
            System.out.println("b nem oszthato a-val ");
        }

    }

    private void monogram() {
        String name;
        System.out.println("Kérem, hogy adja meg a nevet!");
        name = sc.nextLine();
        String[] words = name.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].trim();
        }
        for (int i = 0; i < words.length; i++) {
            char firstLetter = words[i].toUpperCase().charAt(0);
            System.out.print(firstLetter);
        }
        uresSor();
    }
}
