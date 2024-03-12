package org.example;

public class Container {
    private int[] arrayForContainer;
    private int containerSize;

    public Container() {
        arrayForContainer = new int[1];
        containerSize = 0;
    }

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
}
