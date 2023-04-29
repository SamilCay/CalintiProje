package Part1;

import java.util.Scanner;

public class P3_Gate {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        gate();

    }

    public static void gate(){
        System.out.println("Please choose what you need to get your ticket or pay your park bill");
        System.out.println(
                "\t\n1-To get ticket for park" +
                "\t\n2-To pay ticket bill for get your car"+
                "\t\n3-Exit"
        );
        System.out.print("your number: " + " ");
        int rakam = scanner.nextInt();;
        System.out.println("");

        switch (rakam){
            case 1 :
                P2_CarEntery.carEntry();
                break;
            case 2 :
                break;

        }
    }

}
