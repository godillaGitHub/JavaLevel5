package level5;

public class Person {

    /* 1. Создать класс "Сотрудник" с полями:
    ФИО, должность, email, телефон, зарплата, возраст
     */
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private double wage;
    private int age;

    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Person(String name, String position, String email, String phoneNumber, double wage, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wage = wage;
        this.age = age;
    }

    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void info() {
        System.out.println("ФИО: " + name
                + "; Должность: " + position
                + "; Email: " + email
                + "; Телефон: " + phoneNumber
                + "; Зарплата: " + wage
                + "; Возраст: " + age);
    }

    public void infoForAge(int queryAge)
    {
        if (age > queryAge) {
            info();
        }

    }
}