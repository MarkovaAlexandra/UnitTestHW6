package org.example.Task1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ModelTest {
    Model model = new Model();
    int[] testListOne = {5, 5, 5, 5, 5};
    int[] testListTwo = {2, 2, 2, 2};

    @Test
    void getAverageTest() {
        int expectedAverage = 5; // задаем ожидаемое значение
        int actualAverage = model.getAverage(testListOne); // получаем значение из тестируемого метода
        assertEquals(expectedAverage,actualAverage,"Средняя считается неверно"); // сравниваем полученные значения
    }

    /*
    тестируем метод сравнения средних значений
     */
    @Test
    void compareAveragesTest() {
        String expectedFirstBigger = "Первый список имеет большее среднее значение"; //ожидаемый результат
        int averageFirstCase1 = 5;
        int averageSecondCase1 = 2;
        String actualFirstBigger = model.compareAverages(averageFirstCase1,averageSecondCase1);

        String expectedSecondBigger = "Второй список имеет большее среднее значение";
        int averageFirstCase2 = 5;
        int averageSecondCase2 = 12;
        String actualSecondBigger = model.compareAverages(averageFirstCase2,averageSecondCase2);

        String expectedEquals = "Средние значения равны";
        int averageFirstCase3 = 7;
        int averageSecondCase3 = 7;
        String actualEquals = model.compareAverages(averageFirstCase3,averageSecondCase3);
        assertEquals(expectedFirstBigger,actualFirstBigger,"неверно сравнивает при большем первом значении");
        assertEquals(expectedSecondBigger,actualSecondBigger,"неверно сравнивает при большем втором значении");
        assertEquals(expectedEquals,actualEquals, "неверно сравнивает при равных значениях");

    }
}