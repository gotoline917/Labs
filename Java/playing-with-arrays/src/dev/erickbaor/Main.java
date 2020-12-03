package dev.erickbaor;

public class Main {

    public static void main(String[] args) {
	    int[] chart = {10, 8, 1, 5, 20, 11, 9, 13, 30};
	    int[][] values = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};

        System.out.println("\n=== Horizontal Bar Chart ===\n");

	    for (int i=0; i<chart.length; i++) {
	        for (int j=0; j<chart[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n=== Traversing an array ===\n");
	    traversingFromLeftToRight(values);

    }

    public static void traversingFromLeftToRight(int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (j<arr[i].length)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.println(arr[i][j]);
            }
        }
    }
}
