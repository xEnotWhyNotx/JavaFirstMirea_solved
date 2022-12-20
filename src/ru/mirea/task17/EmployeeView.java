package ru.mirea.task17;

public class EmployeeView
{
    void printEmployeeDetails(String EmployeeName, int Employeekol)
    {
        System.out.println("Employee Details: ");
        System.out.println("Name: " + EmployeeName);
        System.out.println("Employee zarplata: " + Employeekol * 125);
    }
}