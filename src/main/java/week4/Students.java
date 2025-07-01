/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author ADMIN
 */
public class Students {
 private String ID;
    private String Name;
    private String Semester;
    private String Course;

    public Students(String ID, String Name, String Semester, String Course) {
        this.ID = ID;
        this.Name = Name;
        this.Semester = Semester;
        this.Course = Course;
    }



    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    @Override
    public String toString() {
        return "Students{" + "ID=" + ID + ", Name=" + Name + ", Semester=" + Semester + ", Course=" + Course + '}';
    }
    
}
