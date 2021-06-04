import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //constant
        final int gallon = 350;

        System.out.print("What is the length? ");
        String length = in.nextLine();

        System.out.print("What is the width? ");
        String width = in.nextLine();

        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);
        int area = l * w;
        //conversion to double
        double cover = (double)area / (double)gallon;
        double rounded = Math.ceil(cover);

        System.out.print("You will need to purchase " + (int)rounded + " gallons of paint to cover "
                + area + " square feet.");


    }
}
