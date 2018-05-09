import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagementGui extends JFrame implements ActionListener{
    JLabel lab;
    JComboBox choice;
    Room [] room;

    public ManagementGui(Room [] room1){

    setSize(500, 200);
    setTitle("Model");
    setLayout(null);

    lab = new JLabel("WYBIERZ NUMER POKOJU");
    lab.setBounds(180, 50, 200,30);
    choice= new JComboBox();
    choice.setBounds(200,100,100,30);

    room = new Room [4];
    for (int i=0;i<4;i++) {
        room[i] = new Room();
        room[i]=room1[i];
    }
    for(int i=1; i<=4;i++) {
        choice.addItem(""+i);
    }
    choice.addActionListener(this);
    add(lab);
    add(choice);

}
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==choice){

                String number = choice.getSelectedItem().toString();
              int i;
              for(i=1;i<5;i++)
                  if (number.equals(String.valueOf(i))) {
                       Properties okno = new Properties(room[i-1],i,room);
                       okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                       okno.setVisible(true);
                       dispose();
                       break;

                   }
        }
    }
}
