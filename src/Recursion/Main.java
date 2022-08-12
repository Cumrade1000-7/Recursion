package Recursion;

public class Main {
    public static void findPath (char[][] field, int x0, int y0, char[][] memory) {

        char[][] path = new char[field.length][field[0].length];
        int x = x0;
        int y = y0;
        while (x != 0 || y != 0){
            char direction = whereFrom(field, x, y, memory);
            if (direction == 'N') {
                System.out.println("Такого пути нет");
                return;
            }
            else if (direction == 'U') {
                path[y][x] = 'X';
                y -= 1;
            } else if (direction == 'L') {
                path[y][x] = 'X';
                x -= 1;
            }
        }
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[0].length; j++){
                if (i == 0 && j == 0){
                    System.out.print((path[0][0] = 'Щ') + " ");
                } else if (j == x0 && i == y0){
                    System.out.print((path[i][j] = 'Ч') + " ");
                } else if (path[i][j] == 'X'){
                    System.out.print(path[i][j] + " ");
                } else System.out.print(field[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static char whereFrom (char[][] field, int x, int y, char[][] memory) {
        if (memory[y][x] != '\u0000') return memory[y][x];
        if (x > 0) {
            int leftX = x - 1;
            if (leftX == 0 && y == 0) {
                memory[y][x] = 'L';
                return 'L';
            }
            if (field[y][leftX] != '*') {
                if (whereFrom(field, leftX, y, memory) != 'N') {
                    memory[y][x] = 'L';
                    return 'L';
                }
            }
        }
        if (y > 0) {
            int upY = y - 1;
            if (x == 0 && upY == 0){
                memory[y][x] = 'U';
                return 'U';
            }
            if (field[upY][x] != '*'){
                if (whereFrom(field, x, upY, memory) != 'N'){
                    memory[y][x] = 'U';
                    return 'U';
                }
            }
        }
        memory[y][x] = 'N';
        return 'N';
    }

    public static void main(String[] args) {

        int n = 10;
        char[][] memory = new char[n][n];

        char[][] field = new char[][]{
                new char[]{'-', '-', '-', '*', '*', '-', '-', '-', '-', '-',},
                new char[]{'-', '-', '-', '-', '*', '-', '*', '*', '-', '-',},
                new char[]{'-', '-', '-', '*', '-', '*', '-', '-', '-', '*',},
                new char[]{'-', '*', '-', '-', '-', '-', '-', '-', '-', '-',},
                new char[]{'-', '-', '-', '-', '-', '-', '*', '-', '-', '-',},
                new char[]{'-', '-', '*', '-', '-', '*', '-', '-', '-', '-',},
                new char[]{'-', '-', '-', '*', '-', '-', '*', '*', '*', '-',},
                new char[]{'-', '-', '-', '-', '-', '-', '-', '*', '-', '-',},
                new char[]{'-', '-', '-', '-', '-', '-', '-', '*', '-', '-',},
                new char[]{'-', '-', '-', '-', '-', '*', '*', '-', '-', '-',}
        };

        findPath(field, 8, 3, memory);
    }
}
