public class building {
    private
    int NoofRoom;
    room Room[];//przerób na listę
    void init(int size){}
    public
    void raiseAlarm(int roomID) {}
    int addRoom() {
        int ID = NoofRoom + 1;
        NoofRoom++;
        //utwórz pokój i wrzuć na listę
        return ID;
    }
}

class room{
    private
    int airTemperature;
    int co2Density;
    boolean lights;
    public
    void setAirTemperature(){}
    void setCO2Density(){}
    void turnLights(){
        //System.out.println("LIGHTS!");
    }
}