package JavaWork.OOPHomeWork.HomeWork_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Program {
    //Задание №2: Переработать метод generateEmployee, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого). Метод должен быть один!
    static Random random = new Random();
    static void generateEmployee(List<Employee> workers){

        int count = 10;
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
            String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

            Double salary = random.nextDouble(20000, 80000);
            int age = random.nextInt(20, 40);

            if (rand.nextInt(5) == 0) {
                workers.add(new Worker(names[random.nextInt(9)], surnames[random.nextInt(surnames.length)], age, salary));
            }
            else{
                workers.add(new Freelancer(names[random.nextInt(9)], surnames[random.nextInt(surnames.length)], age, salary));
            }
            //Задание №3: Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте соответствующее состояние на уровне ваших классов).
            Collections.sort(workers, new SalaryComparator());
            System.out.println(workers.get(i));
        }
    }

    public static void main(String[] args) {
        List<Employee> workers = new ArrayList<>();
        generateEmployee(workers);
    }
}