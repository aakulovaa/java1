package org.example;

/** Класс Контейнер со свойствами <b>arrayForContainer</b> и <b>containerSize</b>.
 * @author Анна Акулова
 */
public class Container {
    /** Поле массив для контейнера */
    private int[] arrayForContainer;
    /** Поле размерность контейнера */
    private int containerSize;

    /**
     * Конструктор - создание нового объекта
     * @see Container#Container()
     */
    public Container() {
        arrayForContainer = new int[1];
        containerSize = 0;
    }

    /**
     * Метод добавления элемента в конец массива
     * @param element - добавляемый элемент
     */
    public void addElement(int element)
    {
        int[] longerArray = new int[arrayForContainer.length + 1];
        for(int i = 0; i < arrayForContainer.length; i++)
        {
            longerArray[i] = arrayForContainer[i];

        }
        arrayForContainer = longerArray;
        longerArray[containerSize] = element;

        containerSize++;
    }

    /**
     * Метод получения элемента по индексу
     * @param index - индекс извлекаемого элемента
     * @return возвращает элемент массива по заданному индексу
     */
    public int getElement(int index) {
        return arrayForContainer[index];
    }

    /**
     * Метод добавления элемента по индексу
     * @param index - индекс добавляемого элемента
     * @param element - элемент для добавления
     */
    public void addElementForIndex(int index, int element)
    {
        int[] longerArray = new int[arrayForContainer.length + 1];
        for(int i = 0; i<longerArray.length - 1; i++)
        {
            longerArray[i] = i == index ? element : arrayForContainer[i];
        }
        arrayForContainer = longerArray;
    }

    /**
     * Метод удаления элемента по индексу
     * @param index - индекс удаляемого элемента
     * @return возвращает удаленный элемент
     */
    public int removeElementForIndex(int index)
    {
        int removedElement = getElement(index);
        int[] shorterArray = new int[arrayForContainer.length - 1];
        if (index >= 0 && index < arrayForContainer.length) {
            for (int i = 0; i < shorterArray.length; i++) {
                if (i != index) {
                    int newIndex = i < index ? i : i - 1;
                    shorterArray[newIndex] = arrayForContainer[i];
                }
            }

            arrayForContainer = shorterArray;
        }
        return removedElement;
    }
}
