package ru.job4j;

import java.util.Arrays;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0]; /* переменная для временного хранения значение ячейки с индексом 0. */
        array[0] = array[3]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
        array[3] = temp; /* записываем в ячейку с индексом 3 значение временной переменной. */
        temp = array[2];
        array[2] = array[1];
        array[1] = temp;
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        int[] array2 = new int[]{5, 3, 2, 1, 4, 17, 6, 25};
        System.out.println("Так же погуглил еще про метот класса Arrays:");
        Arrays.sort(array2);
        for (int i : array2) {
            System.out.println(i);
        }
    }
}
