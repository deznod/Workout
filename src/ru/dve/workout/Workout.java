package ru.dve.workout;

import java.util.Arrays;
import java.util.Scanner;

public class Workout {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {8, 2, 9, 17, 4, 4, 10};
        int time;
        System.out.println("Введите время: ");
        time = sc.nextInt();
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println("Элементы массива " + i);
        }
        int sum = 0;
        for (int i = arr.length - 1; arr.length - i <= time; i--) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма " + sum);
        System.out.println("Время " + time);
    }


}

