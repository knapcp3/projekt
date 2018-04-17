import java.util.Map;

interface Space {

    int getId();
    int getCurTemperature();
    int getCurCO2Concentration();
    Boolean getLightState(int lightNr);
    Map getLightStates();

    void setTemperature(int temperature);
    void setCO2Concentration(int CO2Concentration);
    void setLight(int lightNr, boolean state);

}
