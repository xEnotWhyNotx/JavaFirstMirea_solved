package ru.mirea.task17;

public class StudentControler
{
    Student model;
    StudentView view;

    public StudentControler(Student model, StudentView view)
    {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setStudentRollNo(String RollNo){
        model.setRollNo(RollNo);
    }
    public String getStudentRollNo(){
        return model.getRollNo();
    }
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}