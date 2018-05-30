class FireSensor {
    public int read(){
        // read and update smoke level
        return this.smokeLevel;
    }

    private int smokeLevel = 0; //0 - 5
}
