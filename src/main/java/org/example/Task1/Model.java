package org.example.Task1;

import java.util.Arrays;
import java.util.List;

/*
Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет
следующие действия:
a. Рассчитывает среднее значение каждого списка.
b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
- ""Средние значения равны"", если средние значения списков равны.
 */
public class Model {

    public int getAverage(int[]list){
        int average = Arrays.stream(list).sum() / list.length;
        return average;
    }

    public String compareAverages(int first, int second) {
        String message = "";
        if (first > second) {
            message = "Первый список имеет большее среднее значение";
        }
        else if (first < second) {
            message =  "Второй список имеет большее среднее значение";

        } else {
            message =  "Средние значения равны";
        }
        return message;
    }


}















