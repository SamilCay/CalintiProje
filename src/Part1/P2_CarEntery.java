package Part1;

import java.util.Scanner;

public class P2_CarEntery {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        carEntry();



    }

public static void carEntry(){
    System.out.println("\t\t\t\tWelcome Central Park:"+"\nPlease enter your info and your car info: ");
    System.out.println("Enter car number");
    String num1 = scanner.nextLine();
    System.out.println("Enter your name");
    String name = scanner.nextLine();
    System.out.println("Enter car Brand");
    String brand = scanner.next();
    System.out.println("Enter duration");
    String duration = scanner.next();


    if (num1.length()-1 == 8){
        System.out.println("Your entery is not valid");
        return;
    }
    if ( ! (0 < Integer.parseInt(duration) && Integer.parseInt(duration) < 3) ){
        System.out.println("Time is limited for this park, duration must be between 0 to 3");
        carEntry();
    }

    P1 car = new P1(
            num1,
            name,
            brand,
            duration);


    System.out.println("Your car number"+num1 +
            "\nYour name: "+ name +
            "\nYour car brand: "+ brand +
            "\nHow many hours you will park: "+ duration);





}



}
