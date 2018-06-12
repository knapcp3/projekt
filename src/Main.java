import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main{
    public static int [] windows;

    public static void main(String[] args)
    {

        Room[] room;
        room = new Room [9];
        for (int i=0;i<9;i++)
            room[i]=new Room();

        windows=new int [10];
        for(int i=0;i<10;i++)
            windows[i]=0;

        windows[0]=1;
        ManagementGui inter= new ManagementGui(room);
        inter.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        inter.setLocationRelativeTo(null);

        inter.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                inter.dispose();
                windows[0]=0;
            }
        });

        inter.setVisible(true);

    }
}

