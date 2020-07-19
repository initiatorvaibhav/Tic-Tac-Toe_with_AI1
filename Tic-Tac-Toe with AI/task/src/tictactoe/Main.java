package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[][] array = new char[5][str.length()];
        int count = 0;
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
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i == 0 || i == 4) {
                    array[i][j] = '-';
                } else if ((i != 0 && i != 4 && j == 0) || (i != 0 && i != 4 && j == 8)) {
                    array[i][j] = '|';
                } else if (i > 0 && j % 2 != 0) {
                    array[i][j] = ' ';
                } else {
                    array[i][j] = ch[count];
                    count++;

                }
            }
        }
        int i = 1;
        do {
            System.out.println("Enter the coordinates: ");
            int firstNo = scanner.nextInt();
            int secondNo = scanner.nextInt();

        } while (i == 2);


    }
}
