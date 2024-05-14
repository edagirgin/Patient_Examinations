package Examinations;

import java.util.List;

public abstract class Examination {
    protected int year;
    protected int month;
    protected int day;

    public Examination(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year= year;


    }
    public abstract String getInfo();

    public abstract String displayInfo();
}
