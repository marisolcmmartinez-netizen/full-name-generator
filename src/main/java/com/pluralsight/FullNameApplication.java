package com.pluralsight;

public class FullNameApplication {
    public static void main(String[] args) {
        String lastName = " Martinez";

        //person 1
        String firstName1 = "   Marisol";
        String fullName1 = firstName1.trim() + " " + lastName.trim();
        System.out.println("Full name: " + fullName1);

        // Person 2
        String firstName2 = " Eric";
        String fullName2 = firstName2.trim() + " " + lastName.trim();
        System.out.println("Full name: " + fullName2);

        // Person 3
        String firstName3 = " Lizbeth";
        String fullName3 = firstName3.trim() + " " + lastName.trim();
        System.out.println("Full name: " + fullName3);
    }
}
