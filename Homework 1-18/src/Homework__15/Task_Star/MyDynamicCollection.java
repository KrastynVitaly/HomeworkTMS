package Homework__15.Task_Star;

import java.util.Arrays;

public class MyDynamicCollection<E> {
    private E[] array, augmentedArray;
    private static int actualSize = 0;

    //Конструктор без параметров - создает массив размером, заданным по умолчанию.
    public MyDynamicCollection() {
        array = (E[]) new Object[10];
    }

    //Конструктор с задаваемым размером внутреннего массива
    public MyDynamicCollection(int size) {
        array = (E[]) new Object[size];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    //Добавление объекта с предусмотренной возможностью автоматического расширения коллекции при
    //добавлении элемента в том случае, когда коллекция уже заполнена.
    public void add(E object) {
        if (actualSize == array.length) {
            augmentedArray = (E[]) new Object[actualSize + 1];
            System.arraycopy(array, 0, augmentedArray, 0, actualSize);
            array = augmentedArray;
        }
        array[actualSize] = object;
        actualSize++;
    }

    //2. удаления элемента
    public void remove(E object) {
        for (int i = 0; i < actualSize; i++) {
            if (array[i].equals(object)) {
                remove(i);
                break;
            }
        }
    }

    //2. удаления элемента по индексу
    public void remove(int index) {
        try {
            for (int i = index; i < actualSize - 1; i++) {
                array[i] = array[i + 1];
            }
            array[actualSize - 1] = null;
            actualSize--;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Указанный индекс находится за пределами коллекции");
        }
    }

    //3. получение элемента по индексу
    public E get(int index) {
        if (index > actualSize || index < -1)
            throw new ArrayIndexOutOfBoundsException("Exit of out the collection range bounds");
        return array[index];
    }

    //4. проверка есть ли элемент в коллекции
    public boolean contains(E object) {
        for (int i = 0; i < actualSize; i++) {
            if (array[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    //5. очистка всей коллекции
    public void clear() {
        array = (E[]) new Object[array.length];
        actualSize = 0;
    }

    public int length() {
        return actualSize;
    }
}
