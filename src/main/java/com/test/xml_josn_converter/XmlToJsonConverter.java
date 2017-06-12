/**
 * 
 */
package com.test.xml_josn_converter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.json.JSONObject;
import org.json.XML;

/**
 * @author MD AZAR
 *
 */
public class XmlToJsonConverter {
	private static int PRETTY_PRINT_INDENT_FACTOR=4;
	
	@SuppressWarnings("resource")
	public static String convertToJson(String filepath)
	{
		
		try {
			Stream<String> stream = Files.lines(Paths.get(filepath));
			
			String xmlContent=stream.collect(Collectors.joining());
			 JSONObject obj=XML.toJSONObject(xmlContent);
			  String jsonPrettyPrintString = obj.toString(PRETTY_PRINT_INDENT_FACTOR);
			return jsonPrettyPrintString;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;

	}
	
	public static void main(String[] args) {
		//test data
		String result=convertToJson("C:/Users/MDAZAR/Desktop/data.xml");
		System.out.println(result);
	}

}
