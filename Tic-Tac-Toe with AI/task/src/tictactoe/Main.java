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
            if (firstNo > 3 || secondNo > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                i = 2;
            } else if (firstNo == 1 && secondNo == 3) {
                if (array[1][2] == ' ') {
                    array[1][2] = Count(array) ? 'O' : 'X';
                    i = 0;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    i = 2;
                }
            } else if (firstNo == 2 && secondNo == 3) {
                if (array[1][4] == ' ') {
                    array[1][4] = Count(array) ? 'O' : 'X';
                    i = 0;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    i = 2;
                }
            } else if (firstNo == 3 && secondNo == 3) {
                if (array[1][6] == ' ') {
                    array[1][6] = Count(array) ? 'O' : 'X';
                    i = 0;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    i = 2;
                }
            } else if (firstNo == 1 && secondNo == 2) {
                if (array[2][2] == ' ') {
                    array[2][2] = Count(array) ? 'O' : 'X';
                    i = 0;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    i = 2;
                }
            } else if (firstNo == 3 && secondNo == 2) {
                if (array[2][6] == ' ') {
                    array[2][6] = Count(array) ? 'O' : 'X';
                    i = 0;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    i = 2;
                }
            } else if (firstNo == 1 && secondNo == 1) {
                if (array[3][2] == ' ') {
                    array[3][2] = Count(array) ? 'O' : 'X';
                    i = 0;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    i = 2;
                }
            } else if (firstNo == 2 && secondNo == 1) {
                if (array[3][2] == ' ') {
                    array[3][2] = Count(array) ? 'O' : 'X';
                    i = 0;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    i = 2;
                }
            } else if (firstNo == 3 && secondNo == 1) {
                if (array[3][2] == ' ') {
                    array[3][2] = Count(array) ? 'O' : 'X';
                    i = 0;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    i = 2;
                }
            } else {
                System.out.println("You should enter numbers!");
                i = 2;
            }
        } while (i == 2);
    }

    public static boolean Count(char[][] array) {
        int X = 0;
        int O = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[i][j] == 'X')
                    X++;
                else if (array[i][j] == 'O')
                    O++;
            }
        }
        return X > O;
    }

    public static boolean check(char[][] array) {
        int valueOfX = 0;
        int valueOfO = 0;
        int emptyValue = 0;
        int countOfX = 0;
        int countOfO = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[i][j] == 'X') countOfX++;
                if (array[i][j] == 'O') countOfO++;
            }
        }
        for (int i = 1; i < 4; i++) {
            int j = 0;
            if (array[i][j + 2] == 'X' && array[i][j + 4] == 'X' && array[i][j + 6] == 'X') {
                valueOfX++;
                break;
            }
            if (array[i][j + 2] == 'O' && array[i][j + 4] == 'O' && array[i][j + 6] == 'O') {
                valueOfO++;
                break;
            }
        }
        for (int i = 2; i < 7; i += 2) {
            int j = 1;
            if (array[j][i] == 'X' && array[j + 1][i] == 'X' && array[j + 2][i] == 'X') {
                valueOfX++;
                break;
            }
            if (array[j][i] == 'O' && array[j + 1][i] == 'O' && array[j + 2][i] == 'O') {
                valueOfO++;
                break;
            }
        }
        if (array[1][2] == 'X' && array[2][4] == 'X' && array[3][6] == 'X') {
            valueOfX++;
        }
        if (array[1][2] == 'O' && array[2][4] == 'O' && array[3][6] == 'O') {
            valueOfX++;
        }
        if (array[1][6] == 'O' && array[2][4] == 'O' && array[3][2] == 'O') {
            valueOfO++;
        }
        if (array[1][6] == 'X' && array[2][4] == 'X' && array[3][2] == 'X') {
            valueOfO++;
        } else if (valueOfO == 0 && valueOfX == 0) {
            System.out.println("Draw");
            emptyValue++;
        } else if (valueOfX != 0) {
            System.out.println("X wins");
            emptyValue++;
        } else if (valueOfO != 0) {
            System.out.println("O wins");
            emptyValue++;
        }

        return emptyValue > 0;
    }
}

