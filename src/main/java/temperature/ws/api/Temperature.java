package temperature.ws.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
(
		targetNamespace = "http://www.pinjhuan.com/temperature/1",
		name = "TemperatureName"
)
public interface Temperature 
{
	public static final String CELSIUS = "Celsius";
	public static final String FAHRENHEIT = "Fahrenheit";
	
	@WebMethod
	public double celsiusToFahrenheit(@WebParam(name = CELSIUS) double c);
	
	@WebMethod
	public double fahrenheitToCelsius(@WebParam(name = FAHRENHEIT) double f);
}