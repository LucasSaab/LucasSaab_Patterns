package observer;

public class FanController implements TempeartureObserver{
    @Override
    public void onTemperatureChange(double temp) {
        if (temp > 28){
            System.out.println("Ventilador: LIGAR");
        }else{
            System.out.println("Ventilador: DESLIGAR");
        }
    }
}
