package ru.geekbrains.homework003.array;

import ru.geekbrains.homework003.BaseWorker;

import java.util.ArrayList;
import java.util.List;

public class ArrayWorkers {
    private List<BaseWorker> workers;

    public ArrayWorkers() {
        this.workers = new ArrayList<>();
    }



    public List<BaseWorker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<BaseWorker> workers) {
        this.workers = workers;
    }

    public void sowWorkersOnConsole() {
        for (BaseWorker worker : getWorkers()) {
            System.out.println(worker.toString());
        }
    }
}
