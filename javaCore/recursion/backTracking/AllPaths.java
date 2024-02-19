package javaCore.recursion.backTracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPath("", board, 0, 0);
        System.out.println();
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }

    public static void allPath(String p, boolean[][] maze, int r, int c) {
        int lastRow = maze.length - 1;
        int lastColumn = maze[0].length - 1;
        if (r == lastRow && c == lastColumn) {
            System.out.print(p + "\t");
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;

//        Down
        if (r < lastRow) {
            allPath(p + "D", maze, r + 1, c);
        }
//        Right
        if (c < lastColumn) {
            allPath(p + "R", maze, r, c + 1);
        }
//        Up
        if (r > 0) {
            allPath(p + "U", maze, r - 1, c);
        }
//        Left
        if (c > 0) {
            allPath(p + "L", maze, r, c - 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // I am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }

        if (r > 0) {
            allPathPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
