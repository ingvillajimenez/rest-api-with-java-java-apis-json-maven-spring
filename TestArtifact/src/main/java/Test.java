import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.*;


public class Test {

	public static void main(String[] args) {
		
		Product product1 = new Product("Widget 1", "This is the first widget", 19.99);
//		Product product2 = new Product("Widget 2", "This is the second widget", 15.79);
//		Product product3 = new Product("Widget 3", "This is the third widget", 17.00);
	
		JSONObject sampleJson = new JSONObject(product1);
		
		System.out.println(sampleJson.toString());
		
		String data;
		try {
			
			data = readFileAsString("/Users/juan/code/skillsoft/full-stack-java-developer/spring-boot-rest/TestArtifact/src/sampleJson.json");
			// Convert JSON string to JSONObject
			JSONObject convertedObject = new JSONObject(data);
			System.out.println(convertedObject);
			
		} catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static String readFileAsString(String fileName) throws Exception
	{
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		return data;
	}

}
