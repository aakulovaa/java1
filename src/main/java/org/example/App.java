package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Container container = new Container();
        container.addElement(7);
        container.addElement(1);
        container.addElement(3);
        container.addElementForIndex(3,5);
        container.addElementForIndex(4,9);
        container.addElementForIndex(5,8);
        System.out.println(container.removeElementForIndex(0));
        System.out.println(container.getElement(0));
        System.out.println(container.getElement(1));
        System.out.println(container.getElement(2));
        System.out.println(container.getElement(3));
        System.out.println(container.getElement(4));
        System.out.println(container.getElement(5));

    }
}
