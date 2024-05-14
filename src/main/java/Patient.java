import Examinations.Examination;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private int age;
    private String picture;
    private ArrayList<Examination> exams = new ArrayList<Examination>();

    public Patient(String name, int age, String picture){
        this.name= name;
        this.age = age;
        this.picture = picture;
    }

    public void info(){

        System.out.println("Patient: "+name+" picture: ");

    }

    public void addExam(Examination exam){
        exams.add(exam);
    }

    public List<Examination> getexam() {
        return exams;
    }

    public String getPicture() {
        return picture;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
