import Examinations.BP;
import Examinations.Examination;
import Examinations.MRI;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
public class UI {
    private JFrame frame;

    public UI(){
        frame = new JFrame("Patient Information");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new GridLayout(2,1));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        ArrayList<Examination> exams = new ArrayList<Examination>();

        Patient pat1 = new Patient("Daphne Von Oram", 62, "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        pat1.addExam(new MRI("https://martinh.netfirms.com/BIOE60010/mri1.jpeg",2, 14, 9, 2023));
        pat1.addExam(new BP(130,70,"ST",15,9,2023));

        Patient pat2 = new Patient("Sebastian Compton", 31, "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");
        pat2.addExam(new MRI("https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4, 19,11,2023));
        pat2.addExam(new BP(150,80,"VST",20,11,2023));

        displayPatientInfo(panel1, pat1);
        displayPatientInfo(panel2,pat2);
        mainPanel.add(panel1);
        mainPanel.add(panel2);

        frame.add(mainPanel);
        frame.setVisible(true);

    }

    private void displayPatientInfo(JPanel panel, Patient patient) {
        JPanel Patientpanel = new JPanel(new GridLayout(1, 4));
        JLabel label = new JLabel();
        URL imageURL = null;
        try {
            imageURL = new URL("https://martinh.netfirms.com/b3ta/kennyg.jpg");

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);

        JLabel newlabel = new JLabel("My text");
        newlabel.setText("<html> Name: " + patient.getName() + "<br> Age: " + patient.getAge() + "</html>");
        Patientpanel.add(newlabel);
        panel.add(Patientpanel);

        String MRI_info = null;
        String BP_info = null;

        List<Examination> exams = patient.getexam();
        int i = 1;
        for (Examination exam : exams) {
            //System.out.println(2);
            if (i == 1) {
                panel.add(new JLabel(exam.displayInfo()));
                //System.out.println(3);
                MRI_info = exam.getInfo();
                //System.out.println(exam.getInfo());

            }
            if (i == 2) {
                panel.add(new JLabel(exam.displayInfo()));
                BP_info = exam.getInfo();


            }
            i = i + 1;
        }


        System.out.println("Patient: " + patient.getName() + ":" + MRI_info + ": " + BP_info + " ");
    }

}
