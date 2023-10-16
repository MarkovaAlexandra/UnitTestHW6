package org.example.Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        int[] firstList = view.enterList();
        int firstAverage = model.getAverage(firstList);
        System.out.println("Среднее значение списка = " + firstAverage);
        int[] secondList = view.enterList();
        int secondAverage = model.getAverage(secondList);
        System.out.println("Среднее значение списка = " + secondAverage);
        System.out.println(model.compareAverages(firstAverage,secondAverage));


    }
}
