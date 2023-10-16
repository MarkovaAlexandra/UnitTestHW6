package org.example.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class View {
    int[]list;
    public int[] enterList (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел числа для заполнения списка, для окончания ввода нажмите Enter: ");
        String [] userInput = scanner.nextLine().strip().split("\s");
        int [] arrNumbers = Arrays.stream(userInput).mapToInt(Integer::parseInt).toArray();
        this.list = arrNumbers;
        return arrNumbers;
    }
}
