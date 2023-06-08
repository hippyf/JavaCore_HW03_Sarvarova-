package ru.geekbrains.homework003;

public abstract class BaseWorker {
    protected String name;
    protected int hourlyRate;
    protected int fixedPay;

    public BaseWorker(String name) {
        this.name = name;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getFixedPay() {
        return fixedPay;
    }

    public String getName() {
        return name;
    }
// Задание 1.a) Описать в базовом классе абстрактный метод для расчета среднемесячной заработной платы.
    public boolean AverageSalary (){
        double monthlySalary;
        if (hourlyRate != 0) {
            monthlySalary = 20.8 * 8 * hourlyRate;
            System.out.printf("Среднемесячная зарплата у работника %s равна %.2f руб.\n", getName(), monthlySalary);
            return true;
        }
        else if (fixedPay !=0) {
            monthlySalary = fixedPay;
            System.out.printf("Среднемесячная зарплата у работника %s равна %.2f руб.\n", getName(), monthlySalary);
            return true;
        }
        else return false;
    };



}
