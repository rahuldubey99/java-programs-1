package com.tarun;

public class a3Darray {
    public static void main(String args[]) {
        int my3DArray[][][] = new int[4][5][5];

        //this group of for loops is for initialization of the 3d arrray
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 5; j++)
                for (int k = 0; k < 5; k++)
                    my3DArray[i][j][k] = i * j * k;

                //this group of for loops is for the printing of the 3d array. and it prints garbage values.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++)
                    System.out.print(my3DArray[i][j][k] + "  ");
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
