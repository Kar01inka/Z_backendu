package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Każde zadanie jest napisane tak, jakby był to osobny program
        // więc trzeba je włączać osobno a nie wszystkie na raz.

        // zadanie 1
        /* Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello "+name+"!"); */

        // zadanie 2
        /* System.out.println("8 best streamers: ");
        Scanner scanner = new Scanner(System.in);
        String eight = scanner.next();
        System.out.println("8: "+eight);
        String seven = scanner.next();
        System.out.println("7: "+seven);
        String six = scanner.next();
        System.out.println("6: "+six);
        String five = scanner.next();
        System.out.println("5: "+five);
        String four = scanner.next();
        System.out.println("4: "+four);
        String three = scanner.next();
        System.out.println("3: "+three);
        String two = scanner.next();
        System.out.println("2: "+two);
        String one = scanner.next();
        System.out.println("1: "+one); */

        // zadanie 3
        /* System.out.println("Write 3 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        if(one>two && one>three){
            System.out.println("First one is the biggest");
        } else if(two>one&&two>three){
            System.out.println("Second is the biggest");
        } else if(three>one&&three>two){
            System.out.println("Third is the biggest");
        }else{
            System.out.println("There isn't one biggest number");
        } */

        //zadanie 4
        /* int[] tablica = new int[5];
        System.out.println("Write 5 numbers");
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<5;i++){
            tablica[i]=scanner.nextInt();
        }
        Arrays.sort(tablica);
        System.out.println(Arrays.toString(tablica)); */

        // zadanie 5
        /* System.out.println("Enter the radius of the sphere");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double sa = radius*radius*Math.PI;
        double vol = (Math.PI* radius * radius * radius * 4)/3;
        System.out.println("Surface area: "+ sa);
        System.out.println("Volume: "+vol); */

        // zadanie 6
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cenę: ");
        int cena = scanner.nextInt();
        System.out.println("Podaj ilość rat: ");
        int raty = scanner.nextInt();

        if(cena>0 && cena<=50000 && raty>0 && raty<=48) {
            float procent;
            float rata;
            float odsetki;
            float suma;
            if (raty < 13) {
                procent=0.03f;
            } else if (raty < 25) {
                procent=0.06f;
            } else {
                procent = 0.1f;
            }

            odsetki = cena * procent / raty;
            rata = (float) cena / raty + odsetki;

            System.out.println(rata);
        }
        else{
            System.out.println("Niepoprawne dane.");
        }*/

        // zadanie 7
        /*Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        String dzialanie = scanner.next();
        float b = scanner.nextFloat();
        float wynik=0;

        switch (dzialanie){
            case "+":
                wynik = a + b;
                break;
            case "-":
                wynik = a - b;
                break;
            case "*":
                wynik = a * b;
                break;
            case "/":
                if(b==0){
                    System.out.println("Druga liczba nie może być równa zero");
                    return;
                }else{
                    wynik = a / b;
                }
                break;
            default:
                System.out.println("Nieprawidłowe działanie");
                return;
        }
        System.out.println(a + dzialanie + b + "=" + wynik);*/

        // zadanie 8
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f, f1, m;
        if (n==0 || n==1){
            System.out.println(n);
        }else{
            f1=0;
            f=1;
            System.out.println("0");
            System.out.println("1");
            for(int i=2; i<=n; i++){
                m = f + f1;
                f1 = f;
                f = m;
                System.out.println(f);
            }

        }*/


    }
}
