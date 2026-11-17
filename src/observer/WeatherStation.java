package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation{
    double temp;
    List<TempeartureObserver> temperatureObservers = new ArrayList<>();

    void subscribe(TempeartureObserver o){
        temperatureObservers.add(o);
    }

    void unsubscribe(TempeartureObserver o){
        temperatureObservers.remove(o);
    }

    void setTemperature(double temp){
        this.temp = temp;
        notifyObservers();
    }

    private void notifyObservers(){
        for(TempeartureObserver tempObs : temperatureObservers){
            tempObs.onTemperatureChange(temp);
        }
    }
}
