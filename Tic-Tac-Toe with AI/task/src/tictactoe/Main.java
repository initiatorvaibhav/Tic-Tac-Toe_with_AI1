package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[][] array = new char[5][str.length()];
        System.out.println("---------");
        System.out.println("|" + str.substring(0, 3).replaceAll("", " ") + "|");
        System.out.println("|" + str.substring(3, 6).replaceAll("", " ") + "|");
        System.out.println("|" + str.substring(6, 9).replaceAll("", " ") + "|");
        System.out.println("---------");
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '_') {
                ch[i] = ' ';
            }
        }

    }
}
