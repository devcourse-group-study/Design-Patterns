package observer;

import observer.display.CurrentConditionsDisplay;
import observer.display.ForecastDisplay;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();

		weatherData.registerObserver(currentDisplay);
		weatherData.registerObserver(forecastDisplay);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
