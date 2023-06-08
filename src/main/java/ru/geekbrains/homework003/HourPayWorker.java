package ru.geekbrains.homework003;

public class HourPayWorker extends BaseWorker {

    private int age;

    private String position;

    public HourPayWorker(String name, int age, String position, int hourlyRate) {
        super(name);
        if (name == null || name.length() < 3) {
            this.name = "noName";
        } else {
            this.name = name;
        }
        this.age = age;
        this.position = position;
        this.hourlyRate = hourlyRate;
        fixedPay = 0;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }
}
