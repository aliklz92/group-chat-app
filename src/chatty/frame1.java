package chatty;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frame1  extends JFrame
{

    frame2 frameB;
    frame3 frameC;

    JFrame frame = new JFrame("Raza");
    JPanel panel = new JPanel();
    JTextField tf = new JTextField(10);
    JTextArea jArea = new JTextArea();
    JButton b = new JButton("Send");

    public void setFrameC(frame3 frameC) {
        this.frameC = frameC;
    }
    public void setFrameB(frame2 frameB) {
        this.frameB = frameB;
    }

    public void Send(String text)
    {
        String s = jArea.getText();
        s=s+"\n"+"Reza: "+text ;

        frameB.jArea.setText(s);
        frameC.jArea.setText(s);

        jArea.setText(s);

    }

    public String frame_1()
    {
        jArea.setEditable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);



        tf.setBounds(50, 100, 150, 20);
        jArea.setBounds(10, 30, 200, 200);
        frame.add(jArea);
        panel.add(tf);
        panel.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Send(tf.getText());
                tf.setText("");

            }
        });

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, tf);
        frame.setVisible(true);
        Font font = new Font("Arial", Font.ROMAN_BASELINE, 15);
        jArea.setFont(font);
        jArea.setForeground(Color.BLUE);


        return null;
    }


}