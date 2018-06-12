import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ManagementGui extends JFrame implements ActionListener{

    JLabel lab;
    Room [] room;
    JPanel panel;
    JPanel panel1;
    JPanel panel2;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;

    public ManagementGui(Room [] room1){

        setSize(500, 200);
        setTitle("Model");
        setLayout(new FlowLayout());

        panel=new JPanel(new BorderLayout());
        panel1=new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel2=new JPanel(new GridLayout(3,3));


        lab = new JLabel("WYBIERZ NUMER POKOJU");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        room = new Room [9];
        for (int i=0;i<9;i++) {
            room[i] = new Room();
            room[i]=room1[i];
        }

        panel1.add(lab);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b7);
        panel2.add(b8);
        panel2.add(b9);

        panel.add(panel1, BorderLayout.CENTER);
        panel.add(panel2, BorderLayout.PAGE_END);
        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        int num=1;
        if(source==b1){
            num=1;
        }
        else if(source==b2){
            num=2;
        }
        else if(source==b3){
            num=3;
        }
        else if(source==b4){
            num=4;
        }
        else if(source==b5){
            num=5;
        }
        else if(source==b6){
            num=6;
        }
        else if(source==b7){
            num=7;
        }
        else if(source==b8){
            num=8;
        }
        else if(source==b9){
            num=9;
        }

        if(Main.windows[num]==0)
        {
            Main.windows[num]=1;
            Properties okno = new Properties(room[num - 1], num, room);
            okno.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            okno.setLocationRelativeTo(null);
            int finalNum = num;

            okno.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    okno.dispose();
                    Main.windows[finalNum] = 0;
                }
            });

            okno.setVisible(true);
        }
    }
}
