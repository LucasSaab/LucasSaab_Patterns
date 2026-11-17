package observer;

public class ConsoleDisplay implements TempeartureObserver {
    @Override
    public void onTemperatureChange(double temp) {
        System.out.println("Display: temperatura = " + temp);
    }
}
