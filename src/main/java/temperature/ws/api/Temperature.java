package temperature.ws.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
(
		targetNamespace = "http://www.pinjhuan.com/temperature/1",
		name = "MyTemperatureName"
)
public interface Temperature 
{
	public static final String CELSIUS = "Celsius";
	public static final String FAHRENHEIT = "Fahrenheit";
	
	@WebMethod(operationName="CelsiusToFahrenheit")
	@WebResult(name=FAHRENHEIT)
	public double celsiusToFahrenheit(@WebParam(name = CELSIUS) double c);
	
	@WebMethod(operationName="FahrenheitToCelsius")
	@WebResult(name=CELSIUS)
	public double fahrenheitToCelsius(@WebParam(name = FAHRENHEIT) double f);
}