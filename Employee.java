package JavaWork.OOPHomeWork.HomeWork_3;

public abstract class Employee implements Comparable<Employee> {

    protected static String name;
    protected static String surname;
    protected double salary; // Ставка заработной платы
    protected int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }
    
    public int getAge() {
        return age;
    }

    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int res = name.compareTo(this.name);
        if (res == 0){
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
        return res;
    }
    
}

