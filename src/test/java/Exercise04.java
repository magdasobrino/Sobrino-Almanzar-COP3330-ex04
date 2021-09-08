/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */
package exercise;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adj = input.nextLine();

        System.out.print("Enter and adverb: ");
        String adverb = input.nextLine();

        System.out.println("Do you " + verb + " your " + adj + " " + noun + " " + adverb + "? That's hilarious!");
    }

}
