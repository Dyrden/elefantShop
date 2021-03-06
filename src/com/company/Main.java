package com.company;

import java.util.Scanner;

public class Main {

    private Scanner sc = new Scanner(System.in);
    private double utahMoms = 6.85;

    public static void main(String[] args) {
        new Main().run();
    }

    public void run(){
        input();
    }

    public void input(){
        System.out.println("input antal varer");
        String antalVarer = sc.nextLine();
        System.out.println("input pris på varen");
        String varePris = sc.nextLine();

        System.out.println("input statskode for moms");
        String statsKode = sc.nextLine();
        double moms = 0;
        switch (statsKode.toUpperCase()) {
            case "UT" -> moms = 6.85;
            case "NV" -> moms = 8.00;
            case "TX" -> moms = 6.25;
            case "AL" -> moms = 4.00;
            case "CA" -> moms = 8.25;
            default -> moms = 6.85;
        }



        double totalpris = Integer.parseInt(antalVarer)*Double.parseDouble(varePris);
        System.out.println("totalpris uden moms: "+ totalpris + " USD");
        System.out.printf("totalpris med moms af %s%% : %.2f USD" ,moms,totalpris*(moms/100+1));
    }

}
