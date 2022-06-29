package com.company.universtyApp;

public class Run {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.setName("Software Engineering");

        Professor professor1 = new Professor();
        professor1.setName("Ahmet Arslan");

        Course course1 = new Course();
        course1.setName("Int. to Software Engineering");

        Student student1 = new Student();
        student1.setName("Akin Kaldiroğlu");

        // Head of Software Engineering department is Ahmet Arslan and consequently his department is Software Engineering.
        department1.head = professor1;
        professor1.department = department1;

        // Department of Int. to Software Engineering course is Software Engineering and consequently the course
        // Int. to Software Engineering belongs to Software Engineering department.
        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;


        course1.teacher = professor1;
        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;

        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;
        student1.advisor = professor1;

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;

        course1.students = new Student[100];
        course1.students[0] = student1;

        System.out.println("Name of student student1's first course is " + student1.coursesTaken[0].name); //studen1 in aldığı derslerden ilki[0]'nin ismi nedu ?
        System.out.println("Name of student student1's first course's professor is " + student1.coursesTaken[0].teacher.name);
        System.out.println("Name of student student1's first course's professor's department is " + student1.coursesTaken[0].teacher.department.name);
        System.out.println("**********************");

        Professor professor2 = new Professor();
        professor2.setName("Mahmut Hoca");

        Course course2 = new Course();
        course2.name=("Object Orianted Programming I");

        Classroom classroom1 = new Classroom();
        classroom1.setClassId(1);
        classroom1.setClassRoomName("DERSLİK 6");

        classroom1.course = course2; //bu derslikte bu kurs işleniyor.
        course2.classroom = classroom1; //kurs2 nin sınıfı classroom1 .


        System.out.println("Kurs 2'nin dersliği :"+course2.classroom.classRoomName);
        System.out.println(course2.classroom.classRoomName+"'nın Dersi :"+classroom1.course.name); //Kurs 2 nin dersi


    }
}
