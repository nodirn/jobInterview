package ru.jobInterview;

//Тропин Андрей
//nodvirn@gmail.com
//Решение задачи с помощью рекурсии.

public class combinationsOfArrayValues_Recursion {
    static public void main(String[] args) {
        int[] arr = new int[9]; //Кол-во элементов массива для теста можно уменьшить
        int maxColor = 255; //Количество цветов
        arrayCombinations(maxColor, arr, 0);

    }


    private static void arrayCombinations(int maxColor, int[] arr, int d) {
        if (d == arr.length) {
            for (int i = 0; i <= arr.length - 1; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            return;
        }
        for (int i = 0; i <= maxColor; i++) {
            arr[d] = i;
            arrayCombinations(maxColor, arr, d + 1);
        }
    }
}
