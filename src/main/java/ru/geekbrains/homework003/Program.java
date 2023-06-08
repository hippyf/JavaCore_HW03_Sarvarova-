package ru.geekbrains.homework003;

public class Program {
    public static void main(String[] args) {

         // Проверка работа метода расчета среднемесячной заработной платы.

        BaseWorker worker1 = new FixPayWorker("Olga", 25, "Manager", 90000);
        BaseWorker worker2 = new FixPayWorker("Marina", 22, "HR", 120000);
        BaseWorker worker3 = new HourPayWorker("Irina", 19, "Operator", 300);
        BaseWorker worker4 = new HourPayWorker("Sergey", 20, "Consultant", 600);
        System.out.println("РАСЧЕТ СРЕДНЕМЕСЯЧНОЙ ЗАРАБОТНОЙ ПЛАТЫ:\n");
        worker1.AverageSalary();
        worker2.AverageSalary();
        worker3.AverageSalary();
        worker4.AverageSalary();


        // Задание 1.б) Создать на базе абстрактоного класса массив сотрудников и заполнить его.

        BaseWorker[] workers = {
                new FixPayWorker("Ivan", 28, "Manager", 100000),
                new FixPayWorker("Aleksey", 33, "Programmer", 150000),
                new FixPayWorker("Daria", 30, "Accountant", 150000),
                new HourPayWorker("Irina", 23, "Operator", 500),
                new HourPayWorker("Timur", 27, "Courier", 400),
                new HourPayWorker("Igor", 38, "Consultant", 800),
        };
    }
}
