/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class OfflineCourse extends Course {

    private Date begin;
    private Date end;
    private String campus;

    public void setBegin(String begin) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.begin = sdf.parse(begin);
    }

    public void setEnd(String end) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.end = sdf.parse(end);
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public OfflineCourse() throws Exception {
        super();
        this.begin = new Date();
        this.end = new Date();
        this.campus = "";
    }

    public String getBegin() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(begin);
    }

    public String getEnd() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(end);
    }

    public String getCampus() {
        return campus;
    }

    public void InputAll(String id, String na, int cre, String be, String e, String camp) throws ParseException {
        super.InputAll(id, na, cre);
        setBegin(be);
        setEnd(e);
        setCampus(camp);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString() + String.format(" Begin: %s - End: %s - Campus: %s ",
                sdf.format(begin), sdf.format(end), campus);
    }

}
