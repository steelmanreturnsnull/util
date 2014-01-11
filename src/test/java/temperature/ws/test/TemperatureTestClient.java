package temperature.ws.test;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import temperature.ws.target.TemperatureName;
import temperature.ws.target.TemperatureService;

public class TemperatureTestClient 
{

	public static void main(String[] args) throws MalformedURLException 
	{
		TemperatureService tempService = new TemperatureService(
				new URL("http://localhost:7001/ws/temperature?wsdl"),
				new QName("http://www.pinjhuan.com/temperature/1","TemperatureService"));
		TemperatureName tempName = tempService.getTemperatureNamePort();

		double c = 100;
		System.out.println(c + " celsius is " + tempName.celsiusToFahrenheit(c) + " in fahenheit");
		
		double f = 212;
		System.out.println(f + " fahenheit is " + tempName.fahrenheitToCelsius(f) + " in celsius");
	}

}
