package ru.mirea.task19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Peter", 1050, 3.5));
        students.add(new Student("Ivan", 1060, 2.8));
        students.add(new Student("Oleg", 1040, 4.0));

        Scanner sc = new Scanner(System.in);
        int cmd;
        System.out.println("0) Выход");
        System.out.println("1) Добавить студента");
        System.out.println("2) Найти студента по имени");
        System.out.println("3) Отсортировать студентов по успеваемости");
        System.out.println("4) Список студентов");
        while (true) {
            while (true) {
                cmd = sc.nextInt();
                if (cmd >= 0 && cmd <= 4) {
                    break;
                }
            }
            switch (cmd) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    StudentWorker.addStudent(students, sc);
                    break;
                case 2:
                    Student foundStudent;
                    String name = "";
                    System.out.println("Ââåäèòå èìÿ ñòóäåíòà äëÿ ïîèñêà: ");
                    sc.nextLine();
                    try {
                        name = sc.nextLine();
                        foundStudent = StudentWorker.findStudentByName(students, name);
                    } catch (StudentNotFoundException e) {
                        if (name.isEmpty()) {
                            throw new EmptyStringException("Student name is incorrect", e);
                        }
                        System.out.println(e.getMessage());
                        continue;
                    }
                    System.out.println("Èíôîðìàöèÿ î ñòóäåíòå");
                    System.out.println(foundStudent);
                    break;
                case 3:
                    StudentWorker.sortStudents(students);
                    break;
                case 4:
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
            }
        }

    }


}