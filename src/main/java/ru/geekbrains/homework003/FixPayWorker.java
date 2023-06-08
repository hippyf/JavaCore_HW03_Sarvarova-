package ru.geekbrains.homework003;

public class FixPayWorker extends BaseWorker {
    private int age;

    private String position;

    public FixPayWorker(String name, int age, String position, int fixedPay) {
        super(name);
        if (name == null || name.length() < 3) {
            this.name = "noName";
        } else {
            this.name = name;
        }
        this.age = age;
        this.position = position;
        this.fixedPay = fixedPay;
        hourlyRate = 0;
    }


    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Имя работника: " + name +
                ", Возраст: " + age + '\'' +
                ", Должность: " + position + '\'' +
                ", Оклад: " + fixedPay +
                '}';
    }
}
