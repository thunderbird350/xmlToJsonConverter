
package JsonParser;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;

public class JsonValidator {
	
	
	public static String jsonValidator(String jsonpayLoad,String jsonschema)
	{
		
		try{
			
			JSONObject jsonPayLoad = new JSONObject(jsonpayLoad);
			JSONObject jsonSchema = new JSONObject(jsonschema);
			
			Schema schemaT = SchemaLoader.load(jsonSchema);
			
			schemaT.validate(jsonPayLoad);
						
			
		}catch(ValidationException e)
		{
			
			System.out.println("I am in excepption");
			return e.getMessage();
		}
		

		return "Valid";
	}
	
	public static void main(String[] args) {

		String r=jsonValidator("","");
		
		System.out.println(r);
	}
	
	

}
