package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] unsortedInts = getIntegers(5);
        sortIntegers(unsortedInts);
        printArray(unsortedInts);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

    public static void sortIntegers(int[] array){
        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

    public static void printArray(int[] array){
        System.out.println("Printing Array in Descending Order ...");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
