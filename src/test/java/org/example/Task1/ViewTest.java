package org.example.Task1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class ViewTest {
    View view = new View();

    @Test
    void enterListTest() {
        int[] expected = {1,2,5,8}; // Создаем эталонный лист с целочисленными значениями
        ByteArrayInputStream in = new ByteArrayInputStream("1 2 5 8\n".getBytes()); // В поток ввода передаем 1 2 3
        System.setIn(in);
        int[] actual = view.enterList();  // Заполняем лист используя метод enterList тестируемого класса

        assertArrayEquals(expected,actual,"неверное заполнение листа");
        System.setIn(System.in); // Возвращаем поток ввода в исходное состояние
        }


    @Test
    void printAverage() {
    }
}