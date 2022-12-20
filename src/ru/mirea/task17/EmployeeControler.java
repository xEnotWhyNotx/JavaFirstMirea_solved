package ru.mirea.task17;

public class EmployeeControler
{
    Employee model;
    EmployeeView view;

    public EmployeeControler(Employee model, EmployeeView view)
    {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name){
        model.setName(name);
    }
    public String getEmployeeName(){
        return model.getName();
    }
    public void setEmployeeRollNo(int kol){
        model.setkol(kol);
    }
    public int getEmployeeRollNo(){
        return model.getkol();
    }
    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getkol());
    }

    public void setEmployeekol(int kol) {
        {
            model.setkol(kol);
        }
    }
}
