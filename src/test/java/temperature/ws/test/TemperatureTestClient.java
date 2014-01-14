package temperature.ws.test;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import temperature.ws.target.MyTemperatureName;
import temperature.ws.target.MyTemperatureService;

public class TemperatureTestClient 
{

	public static void main(String[] args) throws MalformedURLException 
	{
		MyTemperatureService tempService = new MyTemperatureService(
				new URL("http://localhost:7001/ws/temperature?wsdl"),
				new QName("http://www.pinjhuan.com/temperature/1","MyTemperatureService"));
		MyTemperatureName tempName = tempService.getMyTemperaturePort();

		double c = 100;
		System.out.println(c + " celsius is " + tempName.celsiusToFahrenheit(c) + " in fahenheit");
		
		double f = 212;
		System.out.println(f + " fahenheit is " + tempName.fahrenheitToCelsius(f) + " in celsius");
	}

}
