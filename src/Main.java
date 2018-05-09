import javax.swing.*;

public class Main{

    public static void main(String[] args){
        Room room1 = new Room();
        Room room2 = new Room();
        AirConditioning.changeTemperature(room1, 15);
        AirConditioning.changeTemperature(room2, 40);

        Room[] room;
        room = new Room [4];
        for (int i=0;i<4;i++)
            room[i]=new Room();
    ManagementGui inter= new ManagementGui(room);
        inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inter.setVisible(true);

   }
}

