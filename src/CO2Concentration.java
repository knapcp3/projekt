public class CO2Concentration implements Controller, Alarm{
    public CO2Concentration(){
        this.CO2Concentration = 500;  /// change to read from outside !!
    }

    public void alarm(String message){
        ////
    }

    public boolean check(){
        if(this.CO2Concentration < low_normal_concentration){

            return false;
        }
        else if(this.CO2Concentration > hight_normal_concentration){
            //
            return false;
        }
        return true;
    }

    static void check_air(int id_room){};

    public int getCurCO2Concentration() {
        return this.CO2Concentration;
    }

    public void setCO2Concentration(int CO2Concentration) {
        this.CO2Concentration = CO2Concentration;
    }


    private int CO2Concentration; //in %
    final static double low_normal_concentration = 250;
    final static double hight_normal_concentration = 1500;

}
