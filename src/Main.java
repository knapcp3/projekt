import java.util.*;

public class Main {
    public static void main(String[] args){
        Room room1 = new Room();
        //Room room2 = new Room();

        System.out.println(room1.getLightState(0));
        LightingController.switchLight(room1, 0);
        System.out.println(room1.getLightState(0));

        //System.out.println(room2.getId());
        //Arrays.toString(map.entrySet().toArray())

    }
}
