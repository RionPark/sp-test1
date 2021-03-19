package test;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import lombok.Data;

@Data
class Result{
	private String srcLangType;
	private String tarLangType;
	private String translatedText;
	private String engineType;
	private String pivot;
}
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class Message{
	private Result result;
}
@Data
class PaPagoResult{
	private Message message;
}

public class PapagoTest {
	
	public static void main(String[] args) {		
		String json = "{\r\n"
				+ "\"message\": {\r\n"
				+ "\"@type\": \"response\",\r\n"
				+ "\"@service\": \"naverservice.nmt.proxy\",\r\n"
				+ "\"@version\": \"1.0.0\",\r\n"
				+ "\"result\": {\r\n"
				+ "\"srcLangType\": \"id\",\r\n"
				+ "\"tarLangType\": \"ko\",\r\n"
				+ "\"translatedText\": \"사랑합니다\",\r\n"
				+ "\"engineType\": \"PRETRANS\",\r\n"
				+ "\"pivot\": null\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "}";
		ObjectMapper om = new ObjectMapper();
		try {
			PaPagoResult ppr = om.readValue(json, PaPagoResult.class);
			System.out.println(ppr);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
