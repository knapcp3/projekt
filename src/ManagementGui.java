import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagementGui extends JFrame implements ActionListener{
    JLabel lab;
    JComboBox choice;
    Room [] room;
    JPanel panel;
    JPanel panel1;
    JPanel panel2;

    JButton b1,b2,b3,b4;

    public ManagementGui(Room [] room1){

        setSize(500, 200);
        setTitle("Model");
        setLayout(new FlowLayout());

        panel=new JPanel(new BorderLayout());
        //panel.setVisible(true)
        panel1=new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel2=new JPanel(new GridLayout(2,2));


        lab = new JLabel("WYBIERZ NUMER POKOJU");
        //lab.setBounds(180, 50, 200,30);
        choice= new JComboBox();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);


        //panel.setBounds(0, 90, 500, 20);
        //choice.setBounds(200,100,100,30);

        room = new Room [4];
        for (int i=0;i<4;i++) {
            room[i] = new Room();
            room[i]=room1[i];
        }
        for(int i=1; i<=4;i++) {
            choice.addItem(""+i);
        }
        choice.addActionListener(this);

        //panel1.setSize(500,100);
        panel1.add(lab);
        //add(choice);
        //add(b1);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);

        //add(panel2);
        //panel2.add(choice);
        panel.add(panel1, BorderLayout.CENTER);
        panel.add(panel2, BorderLayout.PAGE_END);
        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        int num=1;
        if(source==choice){

            String number = choice.getSelectedItem().toString();
            int i;
            for(i=1;i<5;i++)
                if (number.equals(String.valueOf(i))) {
                    System.out.println("Hellob1");
                    Properties okno = new Properties(room[i-1],i,room);
                    okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    okno.setLocationRelativeTo(null);
                    okno.setVisible(true);
                    dispose();
                    break;

                }
        }
        else if(source==b1){
            num=1;
        }
        else if(source==b2){
            num=2;
        }else if(source==b3){
            num=3;
        }
        else if(source==b4){
            num=4;
        }
        Properties okno = new Properties(room[num-1],num,room);
        okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        okno.setLocationRelativeTo(null);
        okno.setVisible(true);
        dispose();
    }
}
