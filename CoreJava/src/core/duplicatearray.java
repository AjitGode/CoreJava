package core;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class duplicatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the integer numbers: ");
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                System.out.println("Invalid Integer, please enter a correct integer");
                sc.next();
                i--;
            }
        }

        System.out.println("Input array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] newArr = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] newArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            newArr[i++] = num;
        }
        return newArr;
    }
}

