package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("galerie.txt");
        Scanner scanner = new Scanner(plik);
        PrintWriter zapis = new PrintWriter("wyniki1.txt");

        LinkedList<String> kody = new LinkedList<>();
        LinkedList<Integer> ilosc = new LinkedList<>();

        while (scanner.hasNext()){
            String linia = scanner.nextLine();;
            String kod = linia.substring(0, 2);
            if(!(kody.contains(kod))) {
                kody.add(kod);
                ilosc.add(1);
            }else{
                int index = kody.indexOf(kod);
                int a = ilosc.get(index)+1;
                ilosc.set(index, a);
            }
        }
        for (int i=0; i<kody.size();i++) {
            System.out.println(kody.get(i) + " " + ilosc.get(i));
            zapis.println(kody.get(i) + " " + ilosc.get(i));
        }
        zapis.close();
    }
}
