package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] array = new char[5][9];
        String str = scanner.next();
        System.out.println("---------");
        System.out.println("|" + str.substring(0, 3).replaceAll("", " ") + "|");
        System.out.println("|" + str.substring(3, 6).replaceAll("", " ") + "|");
        System.out.println("|" + str.substring(6, 9).replaceAll("", " ") + "|");
        System.out.println("---------");


    }
}
