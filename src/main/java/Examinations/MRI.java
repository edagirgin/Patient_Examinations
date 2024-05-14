package Examinations;

import java.time.LocalDate;
import java.util.List;

public class MRI extends Examination{
    private String image;
    private int fieldStrength;
    public MRI(String image, int fieldStrength, int day, int month, int year) {
        super(day, month, year);
        this.image = image;
        this.fieldStrength= fieldStrength;
    }

    @Override
    public String getInfo() {
        LocalDate d = LocalDate.of(year,month, day);
        String s = d.toString();
        return "MRI: "+fieldStrength+ " Telsa, "+ s;
    }

    @Override
    public String displayInfo() {
        return image;
    }

    public String getURL(){
        return image;
    }
}
