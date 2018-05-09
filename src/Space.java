import java.util.Map;

interface Space {

    int getId();
    int getCurTemperature();
    int getCurCO2Concentration();
    Boolean getLightState(int lightNr);
    Map<Integer, Boolean> getLightStates();

    void setTemperature(int temperature);
    void setLight(int lightNr, boolean state);

}
