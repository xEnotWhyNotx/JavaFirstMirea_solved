package ru.mirea.task9;

import java.util.Comparator;



public class SortingStudentsByGPA{

    private StudentClass studentClass;

    Comparator<Student> comparator = new Comparator<Student>() {

        @Override

        public int compare(Student o1, Student o2) {

            return Double.compare(o1.getGpa(),o2.getGpa());

        }



        @Override

        public boolean equals(Object obj) {

            return this==obj;

        }

    };



    public SortingStudentsByGPA(int n) {

        studentClass = new StudentClass(n);

    }

    void sortGpaMerge(){

        this.studentClass.students= sortMerge(this.studentClass.students);

    }



    void sortGpaQuick(){

        quickSort(this.studentClass.students,0,this.studentClass.students.length-1);

    }



    private void quickSort(Student[] array, int low, int high) {

        if (array.length == 0) return;

        if (low >= high) return;

        int middle = low + (high - low) / 2;

        Student opora = new Student();

        opora = array[middle];

        Student temp = new Student();

        int i = low, j = high;

        while (i <= j) {

            while (this.comparator.compare(array[i],opora) > 0) {

                i++;

            }



            while (this.comparator.compare(array[j],opora) < 0) {

                j--;

            }



            if (i <= j) {

                temp = array[i];

                array[i] = array[j];

                array[j] = temp;

                i++;

                j--;

            }

        }



        if (low < j) quickSort(array, low, j);

        if (high > i) quickSort(array, i, high);

    }



    private Student[] sortMerge(Student[] arrayA){

        if (arrayA == null) return null;

        if (arrayA.length < 2)return arrayA;



        Student [] left = new Student[arrayA.length / 2];

        System.arraycopy(arrayA, 0, left, 0, arrayA.length / 2);



        Student [] right = new Student[arrayA.length - arrayA.length / 2];

        System.arraycopy(arrayA, arrayA.length / 2, right, 0, arrayA.length - arrayA.length / 2);



        left = sortMerge(left);

        right = sortMerge(right);



        return mergeArray(left, right);

    }



    private Student [] mergeArray(Student[] left, Student[] right) {

        Student[] merged = new Student[left.length+right.length];

        for (int i = 0; i < merged.length; i++) merged[i]=new Student();

        int lengthLeft = left.length;

        int lengthRight = right.length;

        while (lengthLeft > 0 && lengthRight > 0){

            if (this.comparator.compare(left[left.length - lengthLeft],right[right.length - lengthRight]) > 0){

                merged[merged.length -lengthLeft-lengthRight] = left[left.length - lengthLeft];

                lengthLeft--;

            }

            else{

                merged[merged.length - lengthLeft-lengthRight] = right[right.length - lengthRight];

                lengthRight--;

            }

        }

        while (lengthLeft > 0){

            merged[merged.length - lengthLeft] = left[left.length-lengthLeft];

            lengthLeft--;

        }

        while (lengthRight > 0){

            merged[merged.length - lengthRight] = right[right.length-lengthRight];

            lengthRight--;

        }

        return merged;

    }



    void out_students(){

        studentClass.out_students();

    }

}
