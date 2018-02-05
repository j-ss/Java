package Comparable_Comparator;

public class Student{

    private String name;
    private String email;
   // private Course course;

    Student(String name,String email/*,Course course*/)
    {
        this.name=name;
        this.email=email;
       // this.course=course;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

}
