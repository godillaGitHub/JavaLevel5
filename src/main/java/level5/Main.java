package level5;

public class Main {

    public static void main(String[] args) {
        /*4. Создать массив из 5 сотрудников.
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);
         */

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivanov@mailbox.com", "89231231212", 30000, 52);
        // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person("Petrov Petr", "Manager", "pepetrov@mailbox.com", "89241089964", 20000, 26);
        persArray[2] = new Person("Vlasov Vlas", "Analysis", "vlvlasov@mailbox.com", "89561678645", 20000, 41);
        persArray[3] = new Person("Sidorov Sid", "Tester", "sisidorov@mailbox.com", "89342784513", 20000, 27);
        persArray[4] = new Person("Ivanova Anna", "Manager", "anivanova@mailbox.com", "89265553565", 20000, 22);

        //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (Person person : persArray) {
            person.infoForAge(40);
        }
    }
}
