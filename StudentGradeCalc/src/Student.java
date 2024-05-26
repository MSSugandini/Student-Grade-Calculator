import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtstname;
    private JTextField txtbio;
    private JTextField txtchem;
    private JTextField txtphy;
    private JTextField txttotal;
    private JTextField txtavg;
    private JButton calButton;
    private JTextField txtgrd;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                 int m1,m2,m3,total;
                 double avg;


                 m1 = Integer.parseInt(txtbio.getText());
                 m2 = Integer.parseInt(txtchem.getText());
                 m3 = Integer.parseInt(txtphy.getText());

                 total = m1 + m2 + m3;

                 txttotal.setText(String.valueOf(total));

                 avg = total/3;

                 txtavg.setText(String.valueOf(avg));

                 if(avg>35){
                     txtgrd.setText("Pass");
                 }
                 else{
                     txtgrd.setText("Fail");
                 }

            }
        });
    }
}
