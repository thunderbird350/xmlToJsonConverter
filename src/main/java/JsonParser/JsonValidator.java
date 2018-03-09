
package JsonParser;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingMessage;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.google.common.base.StandardSystemProperty;
import com.google.common.collect.Lists;

public class JsonValidator {
	
	
	public static String jsonValidator(String jsonpayLoad,String jsonschema) throws IOException, ProcessingException
	{
		
		final String LS = StandardSystemProperty.LINE_SEPARATOR.value();
			JsonNode jsonPayJsonNode = JsonLoader.fromString(jsonpayLoad);
			 JsonNode schemaNode = JsonLoader.fromString(jsonschema);
			 JsonSchemaFactory factory=JsonSchemaFactory.byDefault();
			 JsonSchema jSchema = factory.getJsonSchema(schemaNode);
			 ProcessingReport report = jSchema.validate(jsonPayJsonNode);
			
			
			 if (!report.isSuccess()) {

					StringBuilder builder = new StringBuilder();
					builder.append("Could not validate JSON against schema");
				//	builder.append(getDescriptionAppendable());
					builder.append(":");
				//	builder.append(LS);
					List<ProcessingMessage> messages = Lists.newArrayList(report);
					for (int i = 0; i < messages.size(); i++) {
						builder.append("- ");
						builder.append(messages.get(i).getMessage());
						//builder.append(i == (messages.size() - 1) ?  : LS);
					}
					return builder.toString();
				}	

		return "Valid";
	}
	

	
	

}
