import java.util.Map;
import java.util.TreeMap;

class Room implements Space{

        public Room() {
            this.id = counter;
            counter++;
            this.lights = new TreeMap();
            this.lights.put(0, true);
            this.lights.put(1, false);
            this.lights.put(2, true); /// change to read from outside !!
            this.temperature = 20; /// change to read from outside !!
            this.CO2Concentration = 1;  /// change to read from outside !!
        }

        //getters
        public int getId() {
            return this.id;
        }

        public int getCurTemperature() {
            return this.temperature;
        }

        public int getCurCO2Concentration() {
            return this.CO2Concentration;
        }

        public Boolean getLightState(int lightNr) {
            return this.lights.get(lightNr);
        }

        public Map getLightStates() {
            return this.lights;
        }

        //setters
        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public void setCO2Concentration(int CO2Concentration) {
            this.CO2Concentration = CO2Concentration;
        }

        public void setLight(int lightNr, boolean state) {
            this.lights.put(lightNr, state);
        }

        private int id;
        private int temperature; //in C degrees
        private int CO2Concentration; //in %
        private Map<Integer, Boolean> lights; // Light nr: true(on) || Light nr: false (off)

        private static int counter = 0;
    }

