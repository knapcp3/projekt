import java.util.ArrayList;
import java.util.List;


class Building {
    public Building(Room[] rooms){
        this.roomList = rooms;
    }

    Room[] roomList;
    Monitoring monitoring = new Monitoring();
    FireControl fireControl = new FireControl();
    AudioSystem audioSystem = new AudioSystem();
}
