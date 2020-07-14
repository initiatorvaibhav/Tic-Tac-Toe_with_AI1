package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] array = new char[5][9];
        String str = scanner.next();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 || i == 4)
                    array[i][j] = '-';
                else if ((i != 0 && i != 4 && j == 0) || (i != 0 && i != 4 && j == 8))
                    array[i][j] = '|';
                else if (i > 0 && j % 2 != 0)
                    array[i][j] = ' ';
                else
                    array[i][j] = ' ';
            }
        }
    }
}
