package JavaWork.OOPHomeWork.HomeWork_3;

public class Freelancer extends Employee {
//Задание №1: Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
    public Freelancer(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    public Freelancer(String[] names, String[] surnames, int age, int salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
    

    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d; Фрилансер; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}