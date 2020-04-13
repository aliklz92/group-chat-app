package chatty;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frame3  extends JFrame
{

    frame2 frameB;
    frame1 frameA;

    JFrame frame3 = new JFrame("Big");
    JPanel panel = new JPanel();
    JTextField tf = new JTextField(10);
    JTextArea jArea = new JTextArea();
    JButton b = new JButton("Send");

    public void setFrameA(frame1 frameA) {
        this.frameA = frameA;
    }

    public void setFrameB(frame2 frameB) {
        this.frameB = frameB;
    }

    public void Send(String text)
    {
        String s = jArea.getText();
        s=s+"\n"+"Big: "+text ;

        frameB.jArea.setText(s);
        frameA.jArea.setText(s);

        jArea.setText(s);

    }

    public String frame_3()
    {
        jArea.setEditable(false);

        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 500);



        tf.setBounds(50, 100, 150, 20);
        jArea.setBounds(10, 30, 200, 200);
        frame3.add(jArea);
        panel.add(tf);
        panel.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Send(tf.getText());
                tf.setText("");

            }
        });

        frame3.getContentPane().add(BorderLayout.SOUTH, panel);
        frame3.getContentPane().add(BorderLayout.NORTH, tf);
        frame3.setVisible(true);
        Font font = new Font("Arial", Font.ROMAN_BASELINE, 15);
        jArea.setFont(font);
        jArea.setForeground(Color.RED);


        return null;
    }


}