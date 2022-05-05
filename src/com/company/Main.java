package com.company;

import java.util.Scanner;

public class Main {

    private Scanner sc = new Scanner(System.in);

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

        double totalpris = Integer.parseInt(antalVarer)*Double.parseDouble(varePris);
        System.out.println("totalpris: "+ totalpris + " USD");
    }

}
