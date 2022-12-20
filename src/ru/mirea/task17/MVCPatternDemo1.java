package ru.mirea.task17;

public class MVCPatternDemo1
{
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentControler controller = new StudentControler(model, view);
        controller.updateView();
        controller.setStudentName("Sergey");
        System.out.println("After updating, Student Details are as follows");
        controller.updateView();
    }
    private static Student
    retriveStudentFromDatabase()
    {
        Student student = new Student();
        student.setName("Egor");
        student.setRollNo("01");
        return student;
    }
}