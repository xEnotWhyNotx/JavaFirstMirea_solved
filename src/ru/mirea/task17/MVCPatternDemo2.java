package ru.mirea.task17;

public class MVCPatternDemo2
{
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeControler controller = new EmployeeControler(model, view);
        controller.updateView();
        controller.setEmployeeName("Sergey");
        controller.setEmployeekol(168);
        System.out.println("After updating, Student Details are as follows");
        controller.updateView();
    }
    private static Employee
    retriveEmployeeFromDatabase()
    {
        Employee employee = new Employee();
        employee.setName("Egor");
        employee.setkol(153);
        return employee;
    }
}