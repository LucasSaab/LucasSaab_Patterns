package observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TempeartureObserver fan = new FanController();
        TempeartureObserver display = new ConsoleDisplay();

        weatherStation.subscribe(display);
        weatherStation.subscribe(fan);

        weatherStation.setTemperature(26);
        weatherStation.setTemperature(30);

        weatherStation.unsubscribe(display);

        weatherStation.setTemperature(27);
    }
}
