import java.util.Map;
import java.util.TreeMap;

public class Light{
    public Light(){
        this.lights = new TreeMap();
        this.lights.put(0, true);
        this.lights.put(1, false);
        this.lights.put(2, true); /// change to read from outside !!

    }


    void light_on(int id_room) {
    }

    void light_off(int id_room) {
    }

    void all_light_off() {
    }


    public Boolean getLightState(int lightNr) {
        return this.lights.get(lightNr);
    }

    public Map<Integer, Boolean> getLightStates() {
        return this.lights;
    }

    public void setLight(int lightNr, boolean state) {
        this.lights.put(lightNr, state);
    }

    private Map<Integer, Boolean> lights; // Light nr: true(on) || Light nr: false (off)
}
