/**
 * 
 */
package com.test.xml_josn_converter;

import org.json.JSONObject;
import org.json.XML;

/**
 * @author MD AZAR
 *
 */
public class XmlToJsonConverter {
	private static int PRETTY_PRINT_INDENT_FACTOR=4;
	
	private static String convertToJson(String xmlContent)
	{
		  JSONObject obj=XML.toJSONObject(xmlContent);
		  String jsonPrettyPrintString = obj.toString(PRETTY_PRINT_INDENT_FACTOR);
		return jsonPrettyPrintString;
	}
	
	public static void main(String[] args) {
		
		String result=convertToJson(args[0]);
		System.out.println(result);
	}

}
