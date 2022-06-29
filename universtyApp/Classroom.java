package com.company.universtyApp;
import java.lang.Object;
import java.util.Arrays;

public class Classroom {
    int classId;
    String classRoomName;
    Course course;
    Arrays arrays;


    Classroom(){
        System.out.println("Sınıf oluşturuldu.");
        Classroom abc = new Classroom();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassRoomName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


}
