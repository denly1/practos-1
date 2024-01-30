import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО студента:");
        String name = scanner.nextLine();

        System.out.println("Введите возраст студента:");
        int age = scanner.nextInt();

        System.out.println("Введите рост студента :");
        double rost = scanner.nextDouble();

        System.out.println("Бюджетник или внебюджетник б/в:");
        String budget = scanner.next();

        System.out.println("Введите пол студента м/ж:");
        String pol = scanner.next();

        System.out.println("Информация о студенте:");
        System.out.println("ФИО: " + name);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Рост: " + rost + " см");
        System.out.println("Бюджетник или внебюджетник: " + (budget.equals("б") ? "Бюджетник" : "внебюджетник"));
        System.out.println("Пол: " + (pol.equals("м") ? "Мужской" : "Женский"));
    }
}
