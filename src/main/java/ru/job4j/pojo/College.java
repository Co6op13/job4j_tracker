package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Dunyushkin Vladimir");
        student.setGroup("Intern");
        student.setDateAdmission(new Date(122, 6, 24));
        System.out.println(student.getFullName() + " started training on the course - "
                + student.getGroup() + " " + student.getDateAdmission().toString());
    }
}
