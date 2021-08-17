package employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.white;

public class FrontPage implements ActionListener
{
    JFrame f;
    JLabel id, l1;
    JButton b;

    FrontPage()
    {
        f = new JFrame("Employee Management System");
        f.setBackground(Color.red);
        f.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/icons/font1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);

        l1.setBounds(0, 150, 1360, 530);
        f.add(l1);

        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.black);
        b.setForeground(white);
        b.setBounds(500, 600, 300, 70);
        b.addActionListener(this);

        id = new JLabel();
        id.setBounds(0, 0, 1360, 750);
        id.setLayout(null);

        JLabel lid = new JLabel("Employee Management System");
        lid.setBounds(80, 30, 1500, 100);
        lid.setFont(new Font("serif", Font.PLAIN, 70));
        lid.setForeground(Color.red);
        id.add(lid);

        id.add(b);
        f.add(id);

        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360, 750);
        f.setLocation(200, 100);

        while (true)
        {
            lid.setVisible(false);
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e){}
            lid.setVisible(true);

            try
            {
                Thread.sleep(500);
            }
            catch (Exception e){}
        }
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == b)
        {
            f.setVisible(false);
            //new login();
        }
    }

    public static void main(String[] args)
    {
        FrontPage page = new FrontPage();
    }
}
