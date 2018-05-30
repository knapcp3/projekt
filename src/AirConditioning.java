import javax.swing.*;

public class AirConditioning implements Controller{
    public AirConditioning()
    {
        this.temperature = 20; /// change to read from outside !!
    }

    public boolean check(){
        if(this.temperature < minTemp){

            return false;
        }
        else if(this.temperature > maxTemp){

            return false;
        }
        return true;
    }

    int getCurTemperature() {
        return this.temperature;
    }

    void changeTemperature(int purpose){
        if(purpose != this.temperature)
        {
            if(purpose < this.temperature)
            {
                if(this.temperature == minTemp)
                    JOptionPane.showMessageDialog(null, "Nie można zmniejszyć temperatury, poniewaz osiągnięto dolny limit");
                else
                    switchAirConditioner(purpose);
            }
            else
            {
                if(this.temperature == maxTemp)
                    JOptionPane.showMessageDialog(null, "Nie można zwiększyć temperatury, ponieważ osiągnięto górny limit");
                else
                    switchRadiator(purpose);
            }
        }
        System.out.println("Gotowe!");
    }


    void heating()
    {
        this.temperature++;
    }

    void cooling()
    {
        this.temperature--;
    }

    void switchAirConditioner(int purpose)
    {
        while (this.temperature > purpose)
        {
            System.out.println(this.temperature - 1);
            cooling();
        }

    }

    void switchRadiator(int purpose)
    {
        while(this.temperature < purpose){
            System.out.println(this.temperature + 1);
            heating();
        }
    }

    private int temperature; //in C degrees
    private static final int minTemp = 16;
    private static final int maxTemp = 26;
}
