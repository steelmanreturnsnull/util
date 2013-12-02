import java.net.URLDecoder;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.net.URLCodec;


public class URL {

	/**
	 * @param args
	 * @throws DecoderException 
	 */
	public static void main(String[] args) throws DecoderException {
		// TODO Auto-generated method stub
		String input = "1386021548681 ::ffff:10.240.110.166 - 28 565 88.23 81.75 200 - -4 4 /ws/admin/ %3Cenv%3AEnvelope+xmlns%3Aenv%3D%22http%3A%2F%2Fschemas.xmlsoap.org%2Fsoap%2Fenvelope%2F%22%3E%3Cenv%3AHeader%2F%3E%3Cenv%3ABody%3E%3Cns2%3Arequest+xmlns%3Ans2%3D%22http%3A%2F%2Fwww.endeca.com%2FMDEX%2Fadmin%2F2%2F0%22%3E%3Cns2%3AreportLeaderOperation%2F%3E%3C%2Fns2%3Arequest%3E%3C%2Fenv%3ABody%3E%3C%2Fenv%3AEnvelope%3E Content-Length%3A+221%0D%0AEcid-Context%3A+1.600da1602ef17915%3Ac4d16a3%3A142b5509fda%3A-8000-0000000000000050%3BkXjE%0D%0AHost%3A+slc01qun%3A7010%0D%0AConnection%3A+TE%0D%0ASoapaction%3A+%22%22%0D%0ATe%3A+trailers%2C+deflate%2C+gzip%2C+compress%0D%0AContent-Type%3A+text%2Fxml%3B+charset%3DUTF-8%0D%0AAccept-Encoding%3A+gzip%2C+x-gzip%2C+compress%2C+x-compress%0D%0AUser-Agent%3A+Oracle+HTTPClient+Version+10h%0D%0A";
		
		String result = URLDecoder.decode(input);
		System.out.println(result);
		
		String result2 = new String(URLCodec.decodeUrl(input.getBytes()));
		System.out.println(result2);
	}

}
