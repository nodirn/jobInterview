package ru.jobInterview;

//Тропин Андрей
//nodvirn@gmail.com
//Решение задачи с без рекурсии.

public class combinationsOfNumbers {
    public static void main (String[] args){
        int step = 1; //Шаг переборки цветов. Для тестирования прграммы.
        int maxColor = 255;
        for (int a = 0; a <= maxColor; a+=step)
            for (int k = 0; k <= maxColor; k+=step)
                for (int c = 0; c <= maxColor; c+=step)
                    for (int d = 0; d <= maxColor; d+=step)
                        for (int q = 0; q <= maxColor; q+=step)
                            for (int f = 0; f <= maxColor; f+=step)
                                for (int u = 0; u <= maxColor; u+=step)
                                    for (int h = 0; h <= maxColor; h+=step)
                                        for (int j = 0; j <= maxColor; j+=step) {
                                            System.out.println(j+" "+h+" "+u);
                                            System.out.println(f+" "+q+" "+d);
                                            System.out.println(c+" "+k+" "+a);
                                            System.out.println();

                                        }
    }
}
