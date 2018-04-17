import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{

    JLabel temp1, temp2;
    JTextField wyn1, wyn2, wyn3, wyn4;
    JButton b1, b2;
    int wpis;

    public Main(Room room1, Room room2)
   {
       setSize(500,200);
       setTitle("Model");
       setLayout(null);

       temp1=new JLabel("temperatura w pokoju nr 1:");
       temp2=new JLabel("temperatura w pokoju nr 2:");
       wyn1=new JTextField(String.valueOf(room1.getCurTemperature()));
       wyn2=new JTextField(String.valueOf(room2.getCurTemperature()));
       wyn3=new JTextField(String.valueOf(room1.getCurTemperature()));
       wyn4=new JTextField(String.valueOf(room2.getCurTemperature()));
       b1=new JButton("zmiana");
       //b2=new JButton("zmiana");
       temp1.setBounds(10,10,160,20);
       temp2.setBounds(10,40,160,20);
       wyn1.setBounds(170,10,50,20);
       wyn2.setBounds(170,40,50,20);
       wyn3.setBounds(260,10,50,20);
       wyn4.setBounds(260,40,50,20);
       b1.setBounds(320,10, 100, 20);
      // b2.setBounds(320,40, 100, 20);
       add(temp1);
       add(temp2);
       add(wyn1);
       add(wyn2);
       add(wyn3);
       add(wyn4);
       add(b1);
       //add(b2);
   }

    @Override
    public void actionPerformed(ActionEvent e) {

        wpis= Integer.parseInt(wyn3.getText());
        wyn1.setText(String.valueOf(wpis));
    }

    public static void main(String[] args){
        Room room1 = new Room();
        Room room2 = new Room();
        AirConditioning.changeTemperature(room1, 15);
        AirConditioning.changeTemperature(room2, 40);
    Main okno = new Main(room1,room2);
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
   }
}

