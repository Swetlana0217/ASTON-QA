public class Employee {
    String surname;
    String name;
    String patronymic;
    String position;
    String email;
    int phone;
    int salary;
    int age;

    public Employee(String surname, String name, String patronymic, String position, String email, int phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.println("Иванов"+" "+"Иван"+" "+"Иванович"+" "+"менеджер"+" "+"ivanov@nm.ru"+" "+981235467+" "+45000+" "+28);
    }
}
