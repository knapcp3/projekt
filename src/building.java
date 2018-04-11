import java.util.List;
import java.util.Map;

public class building {
    private
    int NoofRoom;
    int NoofDoors;
    Map<Integer, Boolean> DoorList;
    List<room> RoomList; //przerób na listę
    void init(int size, int noOfDoors){}
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