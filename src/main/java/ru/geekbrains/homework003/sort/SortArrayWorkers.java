package ru.geekbrains.homework003.sort;

import ru.geekbrains.homework003.BaseWorker;

import java.util.Arrays;

public class SortArrayWorkers {
    /**
     * Сортировка массива сотрудников по имени
     * @param workers массив рабочих
     */
    public void sortingArrayWorkers (BaseWorker[] workers) {
        Arrays.sort(workers, new ComparatorByName());
        for (BaseWorker worker: workers) {
            System.out.println(worker.toString());
        }

    }
}
