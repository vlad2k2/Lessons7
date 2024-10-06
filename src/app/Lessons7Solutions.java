package app;

import java.util.Arrays;
import java.util.Random;

public class Lessons7Solutions {

    // Довжина масива
    // Створіть масив цілих чисел з 20 елементами.
    static int[] arrInt = new int[20];

    public static void main(String[] args){

        Random ran = new Random();

        int[] arrInt = new int[20];

        // Ініціалізація масива
        // Заповніть масив випадковими цілими числами в діапазоні від -100 до 100.
        for (int index = 0; index < arrInt.length; index++ ){
            arrInt[index] = ran.nextInt(201) -100;
        }
        // Елементи масиву:
        System.out.println("Елементи масиву:" + Arrays.toString(arrInt));

        // Знайдіть та виведіть суму всіх від'ємних чисел в масиві.
        int sumNeg = 0;
        for (int indexNeg : arrInt){
            if (indexNeg < 0){
                sumNeg += indexNeg;
            }
        }
        System.out.println("Сума від'ємних чисел: " + sumNeg);

        // Знайдіть та виведіть кількість парних і непарних чисел в масиві.
        int couples = 0;
        int notEven = 0;
        for (int indexCount : arrInt){
            if (indexCount % 2 == 0){
                couples++;
            }else { notEven++;}
        }
        System.out.printf("Кількість парних чисел: %d \n" +
                "Кількість непарних чисел: %d %n", couples, notEven);

        // Знайдіть найбільший та найменший елементи масиву та їхні індекси.
        int min = arrInt[0], max = arrInt[0];
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] < min) {
                min = arrInt[i];
                minIndex = i;
            }
            if (arrInt[i] > max) {
                max = arrInt[i];
                maxIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");

        // 4. Знаходження середнього арифметичного чисел після першого від'ємного числа
        int firstNegativeIndex = -1;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex == -1) {
            System.out.println("В масиві немає від'ємних чисел.");
        } else {
            int sumAfterNegative = 0;
            int countAfterNegative = 0;

            for (int i = firstNegativeIndex + 1; i < arrInt.length; i++) {
                sumAfterNegative += arrInt[i];
                countAfterNegative++;
            }

            if (countAfterNegative > 0) {
                double averageAfterNegative = (double) sumAfterNegative / countAfterNegative;
                System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + averageAfterNegative);
            } else {
                System.out.println("Немає чисел після першого від'ємного числа.");
            }
        }
    }
}
