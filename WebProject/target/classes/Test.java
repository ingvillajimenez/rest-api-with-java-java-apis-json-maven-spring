import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.*;

public class Test {
	
	public static void main(String[] args) {
		
		Product product1 = new Product("Widget 1", "test", 99.99);
		
		JSONObject sampleJson = new JSONObject(product1);
	}
	
	public static String readFileAsString(String fileName) throws Exception
	{
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		return data;
	}
}


//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		SpringApplication.run(Test.class, args);
//	}
//
//}
