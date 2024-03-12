package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Container container = new Container();
        container.addElement(7);
        container.addElement(1);
        container.addElement(3);
        System.out.println(container.getElement(0));
        System.out.println(container.getElement(1));
        System.out.println(container.getElement(2));

    }
}
