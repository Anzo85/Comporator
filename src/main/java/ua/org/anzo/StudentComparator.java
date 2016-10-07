package ua.org.anzo;


import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{


    public int compare(Student s1, Student s2) {
        if(s1.getName().equals(s2.getName()))
        return 0;
        return s1.getName().compareTo(s2.getName());
    }
}