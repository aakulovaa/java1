package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    /**
     * Тест метода добавления элементов в конец массива
     */
    @org.junit.jupiter.api.Test
    void testAddElement() {
        Container container = new Container();
        container.addElement(7);
        container.addElement(1);
        container.addElement(3);
        Assertions.assertEquals(7, container.getElement(0));
        Assertions.assertEquals(1, container.getElement(1));
        Assertions.assertEquals(3, container.getElement(2));
    }

    /**
     * Тест метода получения элементов по индексу
     */
    @org.junit.jupiter.api.Test
    void testGetElement() {
        Container container = new Container();
        container.addElement(7);
        Assertions.assertEquals(7, container.getElement(0));
    }

    /**
     * Тест метода добавления элементов по индексу
     */
    @org.junit.jupiter.api.Test
    void testAddElementForIndex() {
        Container container = new Container();
        container.addElementForIndex(0,5);
        container.addElementForIndex(1,9);
        Assertions.assertEquals(5, container.getElement(0));
        Assertions.assertEquals(9, container.getElement(1));
    }

    /**
     * Тест метода удаления элементов по индексу
     */
    @org.junit.jupiter.api.Test
    void testRemoveElementForIndex() {
        Container container = new Container();
        container.addElementForIndex(0,5);
        container.addElementForIndex(1,9);
        container.addElementForIndex(2,6);
        Assertions.assertEquals(6, container.removeElementForIndex(2));
        container.removeElementForIndex(0);
        Assertions.assertEquals(9, container.getElement(0));
        Assertions.assertEquals(0, container.getElement(1));
    }
}