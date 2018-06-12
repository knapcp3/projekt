import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Properties extends JFrame implements ActionListener {

    JLabel lab0, lab1, lab2, lab3, temp, CO2, light;
    JButton b1, b2, b3;
    Room room;
    Room [] room3;
    int n;

    public Properties(Room room1,int nr, Room [] room2) {
        setSize(500, 200);
        setTitle("Model");
        setLayout(null);

        n=nr;
        room= new Room();
        room=room1;//spr czy ok
        lab0 = new JLabel("POKÓJ NUMER: "+String.valueOf(n));
        lab1 = new JLabel("Temperatura:");
        lab2 = new JLabel("Poziom CO2:");
        lab3 = new JLabel("Stan świateł:");
        temp = new JLabel(String.valueOf(room.getCurTemperature())+"°C");
        CO2 = new JLabel(String.valueOf(room.getCurCO2Concentration()));
        light = new JLabel("zgaszone");
        b1 = new JButton("-");
        b1.addActionListener(this);
        b1.setBackground(Color.RED);
        b3 = new JButton("+");
        b3.addActionListener(this);
        b3.setBackground(Color.green);
        b1.setFont(new Font("Times New Roman",(Font.BOLD|Font.ITALIC),15));
        b3.setFont(new Font("Times New Roman",(Font.BOLD|Font.ITALIC),15));

        b2=new JButton("Menu");
        b2.addActionListener(this);
        lab0.setBounds(200, 10, 300, 40);
        lab1.setBounds(10, 60, 120, 20);
        lab2.setBounds(10, 90, 120, 20);
        lab3.setBounds(10, 120, 120, 20);

        temp.setBounds(210, 60, 30, 20);//temp
        CO2.setBounds(150, 90, 100, 20);//co2
        light.setBounds(150, 120, 100, 20);//swiatlo

        b1.setBounds(150, 60, 50, 20);
        b2.setBounds(20,10, 100, 30);
        b3.setBounds(250,60, 50, 20);

        add(lab0);
        add(lab1);
        add(lab2);
        add(lab3);
        add(temp);
        add(CO2);
        add(light);
        add(b1);
        add(b2);
        add(b3);

        room3 = new Room [9];
        for (int i=0;i<9;i++) {
            room3[i] = new Room();
            room3[i] = room2[i];
        }
    }


    //@Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == b1) {
            room.setTemperature(room.getCurTemperature()-1);
            temp.setText(String.valueOf(room.getCurTemperature())+"°C");
        }
        else if(source ==b3)
        {
            room.setTemperature(room.getCurTemperature()+1);
            temp.setText(String.valueOf(room.getCurTemperature())+"°C");
        }
        else if(source ==b2){
            if(Main.windows[0]==0)
            {
                Main.windows[0] = 1;
                ManagementGui inter = new ManagementGui(room3);
                inter.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                inter.setLocationRelativeTo(null);

                inter.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        inter.dispose();
                        Main.windows[0] = 0;
                    }
                });

                inter.setVisible(true);
            }
        }
    }
}