import java.util.Map;
import java.util.TreeMap;


public class Room implements Space{

    public Room() {
        this.id = counter;
        counter++;

        this.CO2ConcentrationController = new CO2Concentration();
        this.airConditioningController = new AirConditioning();
        this.lightController = new Light();
    }

    public int getId() {
        return this.id;
    }

    //CO2
    public int getCurCO2Concentration() {
        return this.CO2ConcentrationController.getCurCO2Concentration();
    }


    //LIGHT
    //public Boolean getLightState(int lightNr) {
    public Boolean getLightState(int lightNr) {
        return this.lightController.getLightStates().get(lightNr);
    }

    public Map getLightStates() {
        return this.lightController.getLightStates();
    }

    public void setLight(int lightNr, boolean state) {
        this.lightController.setLight(lightNr, state);
    }


    //TEMP
    public int getCurTemperature() {
        return this.airConditioningController.getCurTemperature();
    }

    public void setTemperature(int temperature) {
        this.airConditioningController.changeTemperature(temperature);
    }

    private int id;
    private CO2Concentration CO2ConcentrationController;
    private AirConditioning airConditioningController;
    private Light lightController;
    private Door door;
    private static int counter = 0;
}

