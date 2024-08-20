public class Person {
    String name;
    String position;
    String email;
    int phone;
    int salary;
    int age;

    public Person(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void personArray() {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Ivan Ivanov", "Engineer", "ivanovi@nm.ru", 918234506, 35000, 28);
        personArray[1] = new Person("Petr Petrov", "Manager", "petro@mail.com", 928571098, 40000, 31);
        personArray[2] = new Person("Andrey Popov", "Manager", "apopov@yandex.ru", 909563118, 40000, 34);
        personArray[3] = new Person("Anna Malova", "Accountant", "anmal@qip.ru", 918800765, 45000, 45);
        personArray[4] = new Person("Oleg Krasnov", "Supervisor", "krasol@mail.ru", 961525666, 110000, 56);
    }
}

