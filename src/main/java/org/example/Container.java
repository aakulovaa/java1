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

    public int getElement(int index) {
        return arrayForContainer[index];
    }

    public void addElementForIndex(int index, int element)
    {
        int[] longerArray = new int[arrayForContainer.length + 1];
        for(int i = 0; i<longerArray.length - 1; i++)
        {
            if(i == index)
            {
                longerArray[i] = element;
            }
            else{
                longerArray[i] = arrayForContainer[i];
                containerSize++;
            }

        }
        arrayForContainer = longerArray;
    }
}
