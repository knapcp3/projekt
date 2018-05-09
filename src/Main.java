
import java.util.*;

public class Main {
    public static void main(String[] args){
        Room r1 = new Room();
        Map<Integer, Boolean> lights = r1.getLightStates();
        for (Map.Entry<Integer, Boolean> entry : lights.entrySet()) {
            boolean b = entry.getValue();
            System.out.println("light nr " + entry.getKey() + " is " + ( b ? "on" : "off") );
        }
        r1.setLight(0, false);
        System.out.println("\n"  + r1.getLightState(0) + "\n");


        System.out.println("co2: " + r1.getCurCO2Concentration() + ", temp: " + r1.getCurTemperature());
        r1.setTemperature(24);
        System.out.println("temp after change: " + r1.getCurTemperature());

    }
}

