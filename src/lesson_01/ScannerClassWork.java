package lesson_01;

import java.util.Scanner;

public class ScannerClassWork {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        System.out.println("name = " + name);
        System.out.println("age = " + age);

        String city = new String("Rishon");
    }
}
