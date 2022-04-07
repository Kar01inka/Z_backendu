package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("galerie_przyklad.txt");
        Scanner scanner = new Scanner(plik);

        String kod, nazwa, nazwaNajwieksza="", nazwaNajmniejsza="";
        int dlugosc, szerokosc, iloczyn, ilosc, suma, najwieksza=0, najmniejsza=9999999;
        PrintWriter a = new PrintWriter("wyniki2_a.txt");
        PrintWriter b = new PrintWriter("wyniki2_b.txt");
        while(scanner.hasNext()){
            ilosc=0;
            suma=0;
            kod = scanner.next();
            nazwa= scanner.next();
            for (int i=0; i<70;i++){
                szerokosc = scanner.nextInt();
                dlugosc = scanner.nextInt();
                iloczyn=szerokosc*dlugosc;
                suma+=iloczyn;
                if(iloczyn!=0){
                    ilosc++;
                }
            }
            System.out.println(kod+" "+nazwa+" "+suma+" "+ilosc);
            a.println(kod+" "+nazwa+" "+suma+" "+ilosc);

            if(suma>najwieksza){
                najwieksza=suma;
                nazwaNajwieksza=nazwa;
            }else if(suma<najmniejsza){
                najmniejsza=suma;
                nazwaNajmniejsza=nazwa;
            }
        }
        System.out.println("Największa: "+nazwaNajwieksza+" "+najwieksza);
        b.println("Największa: "+nazwaNajwieksza+" "+najwieksza);
        System.out.println("Najmniejsza: "+nazwaNajmniejsza+" "+najmniejsza);
        b.println("Najmniejsza: "+nazwaNajmniejsza+" "+najmniejsza);
        b.close();
        a.close();

    }
}