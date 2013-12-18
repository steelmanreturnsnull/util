package ws;

import oracle.webservices.annotations.PortableWebService;

@PortableWebService(
		targetNamespace = "http://www.pinjie.com/hello/1", 
		name = "HelloPort", 
		serviceName = "Hello", 
		endpointInterface = "ws.HelloPort", 
		wsdlLocation = "WEB-INF/wsdl/Hello.wsdl"
		)
public class HelloPortImpl implements HelloPort
{

	@Override
	public String sayHello() {
		return "Hello";
	}

}
