import java.util.ArrayList;
import java.util.List;

class FireControl implements Controller, Alarm{
    public boolean check() {
        for(int i = 0; i < sensors.size(); i++){
            if(sensors.get(i).read() > 1)
                return false;
        }
        return true;
    }

    public void alarm(String m){
        System.out.println(m);
        //wyswietl okienko, powiadom sluzby
    }

    List<FireSensor> sensors = new ArrayList<>();
}
