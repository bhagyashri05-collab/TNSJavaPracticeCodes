package interface_assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int hours = sc.nextInt();
        double costPerHour = sc.nextDouble();

        double amount = 0;

        if (choice == 1) {
            AirIndia a = new AirIndia(hours, costPerHour);
            amount = a.calculateAmount();
        } 
        else if (choice == 2) {
            KingFisher k = new KingFisher(hours, costPerHour);
            amount = k.calculateAmount();
        } 
        else if (choice == 3) {
            Indigo i = new Indigo(hours, costPerHour);
            amount = i.calculateAmount();
        }

        System.out.printf("%.2f", amount);
    }
}