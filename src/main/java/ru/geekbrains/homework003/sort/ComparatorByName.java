package ru.geekbrains.homework003.sort;

import ru.geekbrains.homework003.BaseWorker;

import java.util.Comparator;

/**
 * Метод сортировки по имени
 */
public class ComparatorByName implements Comparator<BaseWorker> {


    @Override
    public int compare(BaseWorker o1, BaseWorker o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
