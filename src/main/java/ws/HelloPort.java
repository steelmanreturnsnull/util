package ws;

import oracle.webservices.annotations.PortableWebService;

@PortableWebService(
	    targetNamespace = "http://www.pinjie.com/hello/1",
	    name="HelloPort"
	)
public interface HelloPort {

	String sayHello ();
}
