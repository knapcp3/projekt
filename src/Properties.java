import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Properties extends JFrame implements ActionListener {

    JLabel lab0, lab1, lab2, lab3;
    JTextField wyn1, wyn2, wyn3, wyn4;
    JButton b1, b2;
    int wpis;
    Room room;
    Room [] room3;

    public Properties(Room room1,int nr, Room [] room2) {
        setSize(500, 200);
        setTitle("Model");
        setLayout(null);

        room= new Room();
        room=room1;//spr czy ok
        lab0 = new JLabel("POKÓJ NUMER: "+String.valueOf(nr));
        lab1 = new JLabel("Temperatura:");
        lab2 = new JLabel("Poziom CO2:");
        lab3 = new JLabel("Stan świateł:");
        wyn1 = new JTextField(String.valueOf(room.getCurTemperature()));
        wyn2 = new JTextField(String.valueOf(room.getCurCO2Concentration()));
        wyn3 = new JTextField(String.valueOf(room.getCurTemperature()));
        wyn4 = new JTextField("zgaszone");
        b1 = new JButton("zmiana");
        b1.addActionListener(this);

        b2=new JButton("Menu");
        b2.addActionListener(this);
        lab0.setBounds(200, 10, 300, 40);
        lab1.setBounds(10, 60, 120, 20);
        lab2.setBounds(10, 90, 120, 20);
        lab3.setBounds(10, 120, 120, 20);

        wyn1.setBounds(150, 60, 100, 20);//temp
        wyn2.setBounds(150, 90, 100, 20);//co2
        wyn3.setBounds(280, 60, 50, 20);//temp
        wyn4.setBounds(150, 120, 100, 20);//swiatlo

        b1.setBounds(340, 60, 100, 20);
         b2.setBounds(20,10, 100, 30);
        add(lab0);
        add(lab1);
        add(lab2);
        add(lab3);
        add(wyn1);
        add(wyn2);
        add(wyn3);
        add(wyn4);
        add(b1);
        add(b2);

        room3 = new Room [4];
        for (int i=0;i<4;i++) {
            room3[i] = new Room();
            room3[i]=room2[i];
        }

    }


    //@Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == b1) {
            wpis = Integer.parseInt(wyn3.getText());
            room.setTemperature(wpis);
            wyn1.setText(String.valueOf(wpis));
        }
        else if(source ==b2){
            ManagementGui inter= new ManagementGui(room3);
            inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            inter.setVisible(true);
        }
    }
}