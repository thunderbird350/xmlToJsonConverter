/**
 * 
 */
package JsonParser;

import java.io.IOException;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonParser {
	
	public static JSONObject parser(String json)
	{
		return new JSONObject(json);
	}
	
	public static Employee stringParser(String json) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		
		Employee obj = mapper.readValue(json, Employee.class);
		
		return obj;
	}

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	  Employee emp=stringParser("{\"empid\":\"123\",\"empname\":\"test\"}");
		
		System.out.println(emp.getEmpid());
	}

}
