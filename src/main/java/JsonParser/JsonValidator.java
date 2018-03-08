
package JsonParser;

import org.everit.json.schema.Schema;
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
						
			
		}catch(Exception e)
		{
			return e.getMessage();
		}
		

		return "Valid";
	}
	
/*	public static void main(String[] args) {

		
	}*/
	
	

}
