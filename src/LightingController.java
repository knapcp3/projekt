class LightingController {

    static void switchLight(Room room, int lightNr){
        boolean newState = !room.getLightState(lightNr);
        room.setLight(lightNr, newState);
    }

}
