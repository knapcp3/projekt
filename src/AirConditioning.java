
public class AirConditioning {

    static void changeTemperature(Room room, int purpose){
        if(purpose != room.getCurTemperature())
        {
            if(purpose < room.getCurTemperature())
            {
                switchAirConditioner(room, purpose);
            }
            else
            {
                switchRadiator(room, purpose);
            }
        }
        System.out.println("Gotowe!");
    }


    static void heating (Room room)
    {
        room.setTemperature(room.getCurTemperature()+1);
    }

    static void cooling(Room room)
    {
        room.setTemperature(room.getCurTemperature()-1);
    }

    static void switchAirConditioner (Room room,int purpose)
    {
        while (room.getCurTemperature() > purpose)
        {
                System.out.println(room.getCurTemperature());
                cooling(room);
        }

    }

    static void switchRadiator(Room room, int purpose)
    {
        while(room.getCurTemperature()< purpose){
            System.out.println(room.getCurTemperature());
            heating(room);
        }
    }
}
