package Examinations;

import java.time.LocalDate;

public class BP extends Examination{
    private int SP;
    private int DP;
    private String duration;

    public BP(int SP, int DP,  String duration,int day, int month, int year) {
        super(day, month, year);
        this.DP= DP;
        this.SP = SP;
        this.duration= duration;
    }
    @Override
    public String getInfo() {
        LocalDate ld = LocalDate.of(year,month,day);
        String s = ld.toString();
        return "BP: "+duration+", "+ s;
    }

    @Override
    public String displayInfo() {
        return "<html> Blood pressure <br> "+SP+" over "+ DP+ "</html>";
    }
}
