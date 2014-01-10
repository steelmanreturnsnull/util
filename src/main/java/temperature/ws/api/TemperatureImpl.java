package temperature.ws.api;

import javax.jws.WebService;

@WebService
(
		targetNamespace = "http://www.pinjhuan.com/temperature/1",
		name = "TemperatureName",
	    serviceName = "TemperatureService",
	    endpointInterface = "temperature.ws.api.Temperature", 
	    wsdlLocation = "WEB-INF/wsdl/TemperatureService.wsdl"
)
public class TemperatureImpl implements Temperature 
{
	
	@Override
	public double celsiusToFahrenheit
	(double c) 
	{
		return c*9/5 + 32;
	}
	
	@Override
	public double fahrenheitToCelsius
	(double f) 
	{
		return (f-32)/9*5;
	}

}
