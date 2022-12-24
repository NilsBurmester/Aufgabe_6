package com.NilsBurmester;
import java.util.Scanner;

public class Scan {

    public String scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type in an Actor-id.");
        String id = scanner.nextLine();
        scanner.close();

        return id;

    }
}
