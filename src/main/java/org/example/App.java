package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Container container = new Container();
        Scanner scanner = new Scanner(System.in);
        boolean flagExit = true;
        int choice;
        while (flagExit) {
            System.out.println("Выберите действие: 1-добавить элемент в конец. 2-добавить элемент по индексу." +
                    "3-получить значение элемента по индексу. 4-удалить элемент по индексу. 5 - выход ");
            choice = scanner.nextInt();
            switch (choice) {
                case (1):
                    System.out.println("Введите элемент");
                    int element = scanner.nextInt();
                    container.addElement(element);
                    break;
                case (2):
                    System.out.println("Введите индекс и элемент");
                    int index = scanner.nextInt();
                    int elementForAdd = scanner.nextInt();
                    container.addElementForIndex(index, elementForAdd);
                    break;
                case (3):
                    System.out.println("Введите индекс элемента");
                    int indexForGet = scanner.nextInt();
                    System.out.println(container.getElement(indexForGet));
                    break;
                case (4):
                    System.out.println("Введите индекс элемента");
                    int indexForRemove = scanner.nextInt();
                    System.out.println(container.removeElementForIndex(indexForRemove));
                    break;
                case (5):
                    flagExit = false;
                    break;
            }

        }
    }
}
