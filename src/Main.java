import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static final int SIZE = 20;
    public static void main(String[] args) {
        System.out.println("Bubble sort");
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ile liczb posortowac:");
        int sizeArray = scaner.nextInt();
        scaner.nextLine();

        int[] numberArray = new int[sizeArray];
        System.out.println("Czy tablice wygenerowac czy podajesz wartosci?");
        System.out.println("Wpisz 1 - wypisywanie z klawiatury");
        System.out.println("Wpisz 2 - wygeneruj");
        String choice = scaner.next();

            switch (choice) {
                case "1" ->{
                    System.out.println("Wprowadz "+sizeArray+" kolejno liczb");
                    for (int i = 0; i < sizeArray; i++){
                        numberArray[i]= scaner.nextInt();
                    }
                    System.out.println("Tablica wypisana z klawiatury: ");
                    for (int i = 0; i < sizeArray; i++){
                        System.out.print(numberArray[i]+", ");
                    }
                }
                case "2" ->{

                    System.out.println("Jaki zakres liczb ");
                    System.out.println("Liczby od :");
                    int start = scaner.nextInt();
                    System.out.println("Liczby do :");
                    int finish = scaner.nextInt();
                    System.out.println("Tablica wygenerowanych liczb");
                    for (int i = 0; i < sizeArray; i++){
                        numberArray[i] = (int) (Math.random() * (finish-start))+start;
                        System.out.print(numberArray[i]+", ");
                    }
                }
            }

        System.out.println();
        System.out.println("Posortowana tablica");
        int[] sortedArray = bubbleSort(numberArray);
        for (int i = 0; i < sizeArray; i++){
            System.out.print(sortedArray[i]+", ");
        }



    }

    public static int[] bubbleSort(int[] numberArray) {
        int sizeArray = numberArray.length;
        int temp;
        for (int i = sizeArray - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++){
                if (numberArray[j] > numberArray[j+1]){
                    temp = numberArray[j];
                    numberArray[j] = numberArray[j+1];
                    numberArray[j+1] = temp;
                }
            }
        }
        return numberArray;
    }
}