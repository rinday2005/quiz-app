/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class CourseManagerment {
    List<OnlineCourse> onlineC = new ArrayList<>();
    List<OfflineCourse> offlineC = new ArrayList<>();
    
    public void addOnlineCourse(OnlineCourse c){
        onlineC.add(c);
    }
     public boolean addOfflineCourse(OfflineCourse c) {
        offlineC.add(c);
        return true;
    }
     public boolean deleteCourse(String idcourse) {
    for (OnlineCourse c : onlineC){
        if (c.getCourseID().equalsIgnoreCase(idcourse)) { 
            onlineC.remove(c);
            return true;
        }
      }
        return false;
    }

    public void upadateCourse(String idcourse) throws ParseException {
    for (OnlineCourse c1 : onlineC) {
        if (c1.getCourseID().equalsIgnoreCase(idcourse)) {
            c1.InputAll(idcourse, idcourse, 0, idcourse, idcourse, idcourse);
            return;
        }
    }

    for (OfflineCourse c2 : offlineC) {
        if (c2.getCourseID().equalsIgnoreCase(idcourse)) {
            c2.InputAll(idcourse, idcourse, 0, idcourse, idcourse, idcourse);
            return;
        }
    }

    System.out.println("Course with ID " + idcourse + " not found.");
   }

    public void displayOnlineCourse() {
       for(OnlineCourse c : onlineC){
           System.out.println(c.toString());
       }
    }
        public void displayOfflineCourses() {
        for (OfflineCourse c : offlineC) {
            System.out.println(c);
        }
    }
    
}
